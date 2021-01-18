package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Random;

public class Pets {

	public static ArrayList<Pet> arrayList(int i) {
		Random random = new Random();
		ArrayList<Pet> petsArray = new ArrayList<>();

		while (i>0) {
			petsArray.add(randomPet(random.nextInt(4)+1));
			i--;
		}
		
//		for (int j = 0; j < i; j++) {
//			petsArray.add(randomPet(random.nextInt(5)));
//		}
		return petsArray;
	}

	public static Pet randomPet(int random) {

		switch (random) {
		case 1:
			return new Rat();
		case 2:
			return new Mouse();
		case 3:
			return new Dog();
		case 4:
			return new Mutt();
		default:
			return new Pet();
		}
	}
}
