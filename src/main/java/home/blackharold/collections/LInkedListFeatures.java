package home.blackharold.collections;

import java.util.LinkedList;

public class LInkedListFeatures {

	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));

		System.out.println(pets);
//		выбор первого элемента
		System.out.println(pets.getFirst());
		System.out.println(pets.element());
//		выбор последнего элемента
		System.out.println(pets.getLast());
		System.out.println(pets.peek());
//		удаление первого эл-та
		System.out.println(pets.remove());
		System.out.println(pets.removeFirst());
		System.out.println(pets.poll());

		System.out.println(pets);
		pets.addFirst(new Rat());
		System.out.println("После addFirst(): " + pets);
		pets.offer(Pets.randomPet(3));
		System.out.println("После add(): " + pets);
		pets.addLast(new Hamster());
		System.out.println("После addLast(): " + pets);
		System.out.println("pets.removeLast(): " + pets.removeLast());
	}

}
