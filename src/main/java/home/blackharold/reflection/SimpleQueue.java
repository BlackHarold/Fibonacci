package home.blackharold.reflection;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleQueue<T> implements Iterable<T> {
	private LinkedList<T> storage = new LinkedList<>();

	public void add(T t) {
		storage.offer(t);
	}

	public T get() {
		return storage.poll();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return storage.iterator();
	}

}