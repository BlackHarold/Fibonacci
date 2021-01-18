package home.blackharold.collections;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class EntrySet extends AbstractSet<Map.Entry<String, String>> {

	private int size;

	@Override
	public Iterator<Map.Entry<String, String>> iterator() {

//		Entry entry = new Entry();

//		boolean hasNext() {
//		return entry.index < size - 1;

//		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

//	Map.Entry<String, String>

//			EntrySet(int size) {
//		if (size < 0)
//			this.size = 0;
//		// Can’t be any bigger than the array:
////		else if (size > DATA.length)
////			this.size = DATA.length;
//		else
//			this.size = size;
//	}

}
