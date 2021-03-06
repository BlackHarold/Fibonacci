package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Unsupported {

	static void test(String msg, List<String> list) {
		System.out.println("--- " + msg + " ---");
		Collection<String> c = list;
		Collection<String> subList = list.subList(1, 8);
		Collection<String> c2 = new ArrayList<>(subList);

		try {
			c.retainAll(c2);
		} catch (Exception e) {
			System.out.println("removeAll(): " + e);
		}

		try {
			c.clear();
		} catch (Exception e) {
			System.out.println("clear: " + e);
		}

		try {
			c.removeAll(c2);
		} catch (Exception e) {
			System.out.println("removeAll: " + e);
		}

		try {
			c.add("X");
		} catch (Exception e) {
			System.out.println("add(): " + e);
		}
		try {
			c.addAll(c2);
		} catch (Exception e) {
			System.out.println("addAll(): " + e);
		}
		try {
			c.remove("C");
		} catch (Exception e) {
			System.out.println("remove(): " + e);
		}
		try {
			list.set(0, "X");
		} catch (Exception e) {
			System.out.println("List.set(): " + e);
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		test("Modifiable Copy", new ArrayList<String>(list));
		test("Arrays.asList()", list);
		test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));

	}

}
