package home.blackharold.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations3 {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		Collections.addAll(set1, "HIJKL".split(""));
		Collections.addAll(set2, "HIJKL".split(""));
		System.out.println("set1: " + set1);
		System.out.println("set2: " + set2);		
		System.out.println("set2 in set1: " + set1.containsAll(set2));
		
		Collections.addAll(set1, "XYZ".split(""));
		System.out.println("X Y Z added to set1: " + set1);
	}

}
