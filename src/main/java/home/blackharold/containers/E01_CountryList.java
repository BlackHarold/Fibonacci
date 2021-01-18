package home.blackharold.containers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import home.blackharold.map.Countries;

public class E01_CountryList {

	public static Random r = new Random(47);

	public static void main(String[] args) {
//		List<String> l = new ArrayList<>(Countries.names(8));
		List<String> l = new LinkedList<>(Countries.names(8));
		Collections.sort(l);
		System.out.println(l);
		for (int i = 1; i < 5; i++) {
			Collections.shuffle(l, r);
			System.out.println(" " + i + "_:_" + l);
		}

	}

}
