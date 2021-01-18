package home.blackharold.collections;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountingMapData extends AbstractMap<Integer, String> {

	private int size;
	private static String[] chars = "ABCDEFGHJIKLMNOPQRSTUVWXYZ".split("");

	public CountingMapData(int size) {
		if (size < 0)
			this.size = 0;
		this.size = size;
	}

	private static class Entry implements Map.Entry<Integer, String> {

		int index;

		public Entry(int index) {
			this.index = index;
		}

		@Override
		public int hashCode() {
			return Integer.valueOf(index).hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Entry other = (Entry) obj;
			if (index != other.index)
				return false;
			return true;
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

	public static void main(String[] args) {
		System.out.println(new CountingMapData(60));

	}

	@Override
	public Set<Map.Entry<Integer, String>> entrySet() {
		Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<>();
		for (int i = 0; i < size; i++) {
			entries.add(new Entry(i));
		}
		return entries;
	}
}
