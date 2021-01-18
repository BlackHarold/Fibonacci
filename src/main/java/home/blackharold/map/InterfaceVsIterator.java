package home.blackharold.map;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import home.blackharold.collections.Pet;
import home.blackharold.collections.Pets;

public class InterfaceVsIterator {

	public static void display(Iterator<Pet> it) {
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.getId() + ":" + p + " ");
		}
		System.out.println();
	}

	public static void display(Collection<Pet> pets) {
		for (Pet pet : pets) {
			System.out.print(pet.getId() + ":" + pet + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Pet> petList = Pets.arrayList(8);
		System.out.println("List: " + petList);
		Set<Pet> petSet = new HashSet<>(petList);
		System.out.println("Set: " + petSet);
		Map<String, Pet> petMap = new LinkedHashMap<>();
		String[] names = ("Ralph, Eric, Robin, Lacey, Brithney, Sam, Spot, Fluffy, Dave").split(", ");

		for (int i = 0; i < names.length - 1; i++)
			petMap.put(names[i], petList.get(i));
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.println("=================\n" + petMap + "\n================");
		System.out.print(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
	}
}
