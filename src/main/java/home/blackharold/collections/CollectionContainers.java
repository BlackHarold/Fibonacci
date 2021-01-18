package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionContainers {

	static Collection fill(Collection<String> collection) {

		collection.add("крыса");
		collection.add("кошка");
		collection.add("хомяк");
		collection.add("собака");
		collection.add("собака");

		return collection;
	}

	static Map fill(Map<String, String> map) {
		map.put("жираф", "Анфиса");
		map.put("бегемот", "Мурка");
		map.put("крокодил", "Шарик");
		map.put("крокодил", "Бобик");
		map.put("страус", "Кеша");
		return map;
	}

//	System.out.println(fill(new ArrayList<String>()));
//	System.out.println(fill(new LinkedList<String>()));
//	System.out.println(fill(new HashSet<String>()));
//	System.out.println(fill(new TreeSet<>()));
//	System.out.println(fill(new LinkedHashSet<>()));
//	System.out.println(fill(new HashMap<String,String>()));
//	System.out.println(fill(new TreeMap<String,String>()));
//	System.out.println(fill(new LinkedHashMap<String,String>()));

	public static void main(String[] args) {
//		реализации List
		System.out.println("=========Interface List<E>===========");
		System.out.println("ArrayList: " + fill((Map<String, String>) new ArrayList<>()));
		System.out.println("LinkedList: " + fill((Map<String, String>) new LinkedList<>()));
//		реализации Set
		System.out.println("=========Interface Set<E>===========");
		System.out.println("HashSet: " + fill((Map<String, String>) new HashSet<>()));
		System.out.println("TreeSet: " + fill((Map<String, String>) new TreeSet<>()));
		System.out.println("LinkedHashSet: " + fill((Map<String, String>) new LinkedHashSet<>()));
		
		
//		реализации Map
		System.out.println("=========Interface Map<K,V>===========");
		System.out.println("HashMap: " + fill((Collection<String>) new HashMap<>()));
		System.out.println("TreeMap: " + fill((Collection<String>) new TreeMap<>()));
		System.out.println("LinkedHashMap: " + fill((Collection<String>) new LinkedHashMap<>()));

	}

}
