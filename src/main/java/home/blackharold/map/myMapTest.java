package home.blackharold.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class myMapTest {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();

		myMap.put(15, "First");
		myMap.put(3, "Second");
		myMap.put(2, "Third");
		myMap.put(4, "Fouth");
		myMap.put(1, "Fives");
		myMap.put(1, "Six");

		System.out.println(myMap);
		
		Map<Integer, String> myLinkedMap = new LinkedHashMap<>();
		myLinkedMap.putAll(myMap); 
		myMap.clear();
		System.out.println(myMap);
		System.out.println(myLinkedMap);
	}
}
