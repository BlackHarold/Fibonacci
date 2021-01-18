package home.blackharold.map;

import java.util.Iterator;

import home.blackharold.arrays.CountingGenerator;
import home.blackharold.generics.Generator;

public class MapDataTest {

	public static void main(String[] args) {
		System.out.println(MapData.map(new Letters(), 11));
//		System.out.println(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3),8));
		System.out.println(MapData.map(new CountingGenerator.Character(), "value", 6));
//		System.out.println(MapData.map(new Letters(),new RandomGenerator.String(3)));
		System.out.println(MapData.map(new Letters(), "Pop"));
	}

}

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {

	private int size = 9;
	private int number = 1;
	private char letter = 'A';

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			public Integer next() {
				return number++;
			}

			public boolean hasNext() {
				return number < size;
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Pair<Integer, String> next() {

		return new Pair<Integer, String>(number++, "" + letter++);
	}

}
