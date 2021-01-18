package home.blackharold.collections;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountingMapData2 extends AbstractMap<Integer, String> {

	private static int size;
	private static String[] chars = "ABCDEFGHJIKLMNOPQRSTUVWXYZ".split("");

	public CountingMapData2(int size) {
		if (size < 0)
			this.size = 0;
		this.size = size;
	}

	private static class Entry implements Map.Entry<Integer, String> {

		int index;

		Entry(int index) {
			this.index = index;
		}

		@Override
		public int hashCode() {
			return Integer.valueOf(index).hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Entry && index == ((Entry) obj).index;
		}

		@Override
		public Integer getKey() {
			return index;
		}

		@Override
		public String getValue() {
			return chars[index % chars.length] + index / chars.length;
		}

		@Override
		public String setValue(String value) {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Set<Map.Entry<Integer, String>> entrySet() {
		Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<>();
		for (int i = 0; i < size; i++) {
			entries.add(new Entry(i));
		}
		return entries;
	}

	public static void main(String[] args) {
		System.out.println(new CountingMapData2(60));
	}

	static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
		int size;
		public int size() {
			return size;
		}

		private class Iter implements Iterator<Map.Entry<Integer, String>> {

			private Entry entry = new Entry(-1);

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return entry.index < size - 1;
			}

			@Override
			public Map.Entry<Integer, String> next() {
				entry.index++;
				return entry;
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		}

		@Override
		public Iterator<Map.Entry<Integer, String>> iterator() {
			// TODO Auto-generated method stub
			return new Iter();
		}

		private Set<Map.Entry<Integer, String>> entries = new EntrySet();

		public Set<Map.Entry<Integer, String>> entrySet() {
			return entries;
		}
	}
}
