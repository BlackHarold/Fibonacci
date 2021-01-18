package home.blackharold.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		Collections.addAll(set1, "ABCDEGHIJKL".split(""));
		set1.add("M");
		System.out.println("set1: " + set1);
		System.out.println("H: " + set1.contains("H"));
		System.out.println("N: " + set1.contains("N"));
		
		Collections.addAll(set2, "HIJKL".split(""));
		System.out.println("set2: " + set2);		
		System.out.println("set2 in set1: " + set1.containsAll(set2));
		
		set1.remove("H");
		System.out.println("set1 without \"H\": " + set1);
		
		System.out.println("set2 in set1: " + set1.containsAll(set2));
		set1.removeAll(set2);
		System.out.println("set2 removed from set1: " + set1);
		Collections.addAll(set1, "XYZ".split(""));
		System.out.println("X Y Z added to set1: " + set1);
	}

}
