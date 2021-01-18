package home.blackharold.generics;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class HeroesGenerator implements Generator<Heroes>, Iterable<Heroes> {

//	Comparable<T>;
//	Comparator<T>;

	private Class[] types = { Positive.class, Negative.class };
	Random r = new Random();
	private int size = 0;
	private int count = size;

	public HeroesGenerator() {
	}

	public HeroesGenerator(int i) {
		size = i;
	}

	public static void main(String[] args) {
		HeroesGenerator hg = new HeroesGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(hg.next());
			for (Heroes heroes : new HeroesGenerator(10)) {
				System.out.println(heroes);
			}
		}
	}

	@Override
	public Iterator<Heroes> iterator() {
		Iterator<Heroes> iterator = new Iterator<Heroes>() {

			@Override
			public boolean hasNext() {
				return count > 0;
			}

			@Override
			public Heroes next() {
				count--;
				return HeroesGenerator.this.next();
			}
		};
		return iterator;
	}

	@Override
	public Heroes next() {
		try {
			return (Heroes) types[r.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
