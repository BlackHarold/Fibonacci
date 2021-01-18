package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class TimeCollections2 {

	public static void main(String[] args) {

		long m = System.currentTimeMillis();
//		System.out.println(m);
		// 
		Random r = new Random();
		Collection<Integer> arrayList = new ArrayList();
		Collection<Integer> linkedList = new LinkedList();

		for (int i = 0; i < 10000; i++) {
//			arrayList.add(i);
			linkedList.add(i);
			System.out.println(i);
		}

		System.out.println();
		int i = 1;
		int count = 0;

		while (!linkedList.isEmpty()) {
//		while (!arrayList.isEmpty()) {
			count = r.nextInt(10000);
//			arrayList.remove(count);
			linkedList.remove(count);

			System.out.println("Удален элемент " + count);
			i++;
		}
//		System.out.println(arrayList.isEmpty());

		System.out.println((System.currentTimeMillis() - m) / 1000f + " s");

	}

}
