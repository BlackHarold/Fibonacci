package home.blackharold.concurrency;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class Event implements Runnable, Delayed {
    protected final long delayTime;
    private long trigger;

    public Event(long delayTime) {
        this.delayTime = delayTime;
    }

    public long getDelay(TimeUnit unit) {
        return unit.convert(trigger - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public int compareTo(Delayed arg) {
        Event that = (Event) arg;
        if (trigger < that.trigger)
            return -1;
        if (trigger > that.trigger)
            return 1;
        return 0;
    }

    public void start() {
        trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delayTime, TimeUnit.MILLISECONDS);
    }

    public abstract void run();
}

class Controller implements Runnable {
    private DelayQueue<Event> q;

    public Controller(DelayQueue<Event> q) {
        this.q = q;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Event event = q.take();
                System.out.println(event);
                event.run();
            }
        } catch (InterruptedException e) {
        }
        System.out.println("Finished Controller");
    }

    public void addEvent(Event c) {
        c.start();
        q.put(c);
    }
}

class GreenhouseControls extends Controller {

    public GreenhouseControls(DelayQueue<Event> q) {
        super(q);
    }

    private boolean light;

    public class LightOn extends Event {
        public LightOn(long delatTime) {
            super(delatTime);
        }

        @Override
        public void run() {
            light = true;

        }

        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void run() {
            light = false;
        }

        public String toString() {
            return "Light is off";
        }
    }

    private boolean water;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void run() {
            water = true;

        }

        public String toString() {
            return "Greenhouse water is on";
        }

    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void run() {
            water = false;

        }

        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void run() {
            thermostat = "Night";

        }

        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void run() {
            thermostat = "Day";

        }

        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        public void run() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        public void run() {
            for (Event e : eventList) {
                addEvent(e);
            }
            addEvent(this);
        }

        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {
        private ExecutorService exec;

        public Terminate(long delayTime, ExecutorService e) {
            super(delayTime);
            exec = e;
        }

        public void run() {
            exec.shutdownNow();
        }

        public String toString() {
            return "Terminating";
        }
    }
}
