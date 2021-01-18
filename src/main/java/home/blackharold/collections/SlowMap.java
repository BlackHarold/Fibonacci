package home.blackharold.collections;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import home.blackharold.collections.CountingMapData2.EntrySet;
import home.blackharold.map.Maps;

public class SlowMap<K, V> extends AbstractMap<K, V> {

	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();

	@Override
	public V put(K key, V value) {
		if (key == null)
			throw new NullPointerException();
		V oldValue = get(key); // The old value or null
		if (!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		} else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}

	public V get(Object key) {
		if (key == null)
			throw new NullPointerException();
		if (!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}

	private Set<Entry<Integer, String>> entrySet = new EntrySet();

	@Override
	public Set<Entry<K, V>> entrySet() {
//		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
//		Iterator<K> ki = keys.iterator();
//		Iterator<V> vi = values.iterator();
//		while (ki.hasNext())
//			set.add(new MapEntry<K, V>(ki.next(), vi.next()));
		return null;
	}

	public static void main(String[] args) {

		Maps.test(new SlowMap<Integer, String>());

//		SlowMap<String, String> m = new SlowMap<>();
//		m.putAll(ParsingTxt.getCountries());
//		System.out.println(m);
//		System.out.println(m.get("Болгария"));
//		System.out.println(m.entrySet());
	}
}
