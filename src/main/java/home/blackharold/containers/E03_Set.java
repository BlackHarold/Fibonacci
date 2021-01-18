package home.blackharold.containers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import home.blackharold.map.Countries;

public class E03_Set {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		for (int i = 0; i < 5; i++) {
			set.addAll(Countries.names(10));
		}

		System.out.println(set);

	}

}
