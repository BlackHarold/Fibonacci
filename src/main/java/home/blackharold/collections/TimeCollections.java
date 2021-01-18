package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class TimeCollections {

	public static void main(String[] args) {

		long m = System.currentTimeMillis();
//		System.out.println(m);
		// 
		Collection<Integer> arrayList = new ArrayList();
		Collection<Integer> linkedList = new LinkedList();

		for (long i = 0; i < 1000000; i++) {
//			arrayList.add((int) i);
			linkedList.add((int)i);
			System.out.println(i);
		}

		System.out.println((System.currentTimeMillis() - m) / 1000f + " s");

	}

}
