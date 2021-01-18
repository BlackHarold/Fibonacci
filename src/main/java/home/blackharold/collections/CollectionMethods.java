package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import home.blackharold.map.Countries;

public class CollectionMethods {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();

		c.addAll(Countries.names(6));
		c.add("ten");
		c.add("eleven");
		System.out.println(c);

		Object[] array = c.toArray();

		String[] str = c.toArray(new String[0]);

		System.out.println("Collection.max(c) = " + Collections.max(c));
		System.out.println("Collection.min(c) = " + Collections.min(c));

		Collection<String> c2 = new ArrayList<>();
		c2.addAll(Countries.names(6));
		c.addAll(c2);
//		[EGYPT, KENYA, UGANDA, AFGANISTAN, CHINA, BANGLADESH, ten, eleven, EGYPT, KENYA, UGANDA, AFGANISTAN, CHINA, BANGLADESH]
		System.out.println(c);

		c.remove(Countries.DATA[0][0]);
		c.remove(Countries.DATA[1][0]);
		c.remove(Countries.DATA[2][0]);
//		[AFGANISTAN, CHINA, BANGLADESH, ten, eleven, EGYPT, KENYA, UGANDA, AFGANISTAN, CHINA, BANGLADESH]
		System.out.println(c);

		System.out.println("c2 = " + c2);
		c.removeAll(c2);
//		[ten, eleven]
		System.out.println(c);
		c.addAll(c2);
		System.out.println(c);

		String val = Countries.DATA[3][0];
		System.out.println(c.containsAll(c2));

		Collection<String> c3 = ((List<String>) c).subList(0, 5);

		System.out.println("c3 = " + c3);
		c2.retainAll(c3);
		System.out.println(c2);

		c2.removeAll(c3);
		System.out.println("c2.isEmpty() = " + c2.isEmpty());
		c = new ArrayList<>();
		c.addAll(Countries.names(5));
		System.out.println(c);
		c.clear();
		System.out.println("After clear() = " + c);

	}

}
