package home.blackharold.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfLIst {

	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

	static {
		petPeople.put(new Person("Dave"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot"), new Dog("Bobick")));
		petPeople.put(new Person("Marrye"),
				Arrays.asList(new Mouse("Krisya"), new Cat("Skeleton"), new Dog("Ovcharick")));
	}

	public static void main(String[] args) {
		System.out.println("People: " + petPeople.keySet());
		System.out.println("Pets: " + petPeople.values());

		for (Person person : petPeople.keySet()) {
			System.out.println(person.name + " has:");
			for (Pet pet : petPeople.get(person)) {
				System.out.print(" " + pet.name);
			}
			System.out.println();
		}
	}

}

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}
