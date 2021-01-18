package home.blackharold.generics;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	private Class[] types = { Latte.class, Cappuccino.class, Breve.class, Mocha.class, Americana.class };
	private Random r = new Random(47);

	private int size = 0;

	public CoffeeGenerator() {
		super();
	}

	public CoffeeGenerator(int size) {
		super();
		this.size = size;
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[r.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public static void main(String[] args) {
		CoffeeGenerator cg = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(cg.next());
			for (Coffee c : new CoffeeGenerator(5)) {
				System.out.println(c);
			}
		}
	}
}
