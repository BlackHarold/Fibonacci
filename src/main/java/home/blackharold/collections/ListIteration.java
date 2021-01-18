package home.blackharold.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//СТраница 340, Задание 12 ListIterator
public class ListIteration {

	public static void main(String[] args) {

		List<Pet> pets = Pets.arrayList(8);
		List<Pet> step = new ArrayList<>();

		ListIterator<Pet> it = pets.listIterator(pets.size());

		while (it.hasPrevious()) {
			step.add(it.previous());
		}

		System.out.println(pets);
		System.out.println(step);
	}
}