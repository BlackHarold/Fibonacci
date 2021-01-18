package home.blackharold.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

import home.blackharold.concurrency.Event;
import home.blackharold.innerclasses.GreenhouseControls;

public class GreenhouseControls2 extends GreenhouseControls {

	class Restart extends Event {

		private Event[] eventList;

		public Restart(long delayTime) {
			super(delayTime);
		}

		public void action() {
			for (Event event : eventList) {
				event.start();
				addEvent(event);
			}
			start();
			addEvent(this);
		}

		@Override
		public String toString() {
			return "Restarting system";
		}

		public void setEventList(Event[] eventList) {
			this.eventList = eventList;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	}

	@Override
	public void run() {

	}

	public GreenhouseControls2(DelayQueue<Event> q) {
		super(q);
	}

	class GHEventFactory {
		LinkedList<EventCreator> events = new LinkedList<>();

		class EventCreator {
			Constructor<Event> ctor;
			long offset;

			public EventCreator(Constructor<Event> ctor, long offset) {
				this.ctor = ctor;
				this.offset = offset;
			}
		}

		public GHEventFactory(String eventFile) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(eventFile));
				String s;
				while ((s = br.readLine()) != null) {
					int colon = s.indexOf(':');
					String className = s.substring(0, colon).trim();
					Class<?> outer = className.equals("Restart") ? GreenhouseControls2.class : GreenhouseControls.class;
					String type = outer.getSimpleName() + "S" + className;
					long offset = Long.parseLong(s.substring(colon + 1).trim());
					Class<Event> eventClass = (Class<Event>) Class.forName(type);
					Constructor<Event> ctor = eventClass.getConstructor(new Class<?>[] { outer, long.class });
					events.add(new EventCreator(ctor, offset));
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		Iterator<Event> iterator() {
			return new Iterator<Event>() {
				Iterator<EventCreator> iterator = events.iterator();

				public boolean hasNext() {
					return iterator.hasNext();
				}

				@Override
				public Event next() {
					EventCreator ec = iterator.next();
					Event returnVal = null;
					try {
						returnVal = ec.ctor.newInstance(new Object[] { GreenhouseControls2.this, ec.offset });
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
					return returnVal;
				}

				public void remove() {
					throw new UnsupportedOperationException();
				}
			};
		}
	}

	GHEventFactory gheFactory;

	public GreenhouseControls2(String initFile) {
		
		super(q);
		
		gheFactory = new GHEventFactory(initFile);
		LinkedList<Event> restartableEvents = new LinkedList<Event>();
		Iterator<Event> it = gheFactory.iterator();
		while (it.hasNext()) {
			Event e = it.next();
			if (e instanceof Bell || e instanceof Restart)
				continue;
			restartableEvents.add(e);
		}
		it = gheFactory.iterator();
		while (it.hasNext()) {
			Event e = it.next();
			addEvent(e);
			if (e instanceof Restart)
				((Restart) e).setEventList(restartableEvents.toArray(new Event[0]));
		}
	}

	public GreenhouseControls2(DelayQueue<Event> q, GHEventFactory gheFactory) {
		super(q);
		this.gheFactory = gheFactory;
	}
}
