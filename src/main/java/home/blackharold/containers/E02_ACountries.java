package home.blackharold.containers;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import home.blackharold.map.Countries;

public class E02_ACountries {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>(Countries.capitals());
		TreeSet<String> set = new TreeSet<>(Countries.names());

		String b = null;

		for (String string : map.keySet()) {
			if (string.startsWith("B")) {
				b = string;
				break;
			}
		}

		Map<String, String> aMap = map.headMap(b);
		Set<String> aSet = set.headSet(b);
		System.out.println("aMap" + aMap);
		System.out.println("aSet" + aSet);

	}

}
