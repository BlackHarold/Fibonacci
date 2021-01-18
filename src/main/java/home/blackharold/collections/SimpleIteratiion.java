package home.blackharold.collections;

import java.util.Iterator;
import java.util.List;

public class SimpleIteratiion {

	static Iterator<Pet> it;
	
	public static void main(String[] args) {
		
		List<Pet> pets = Pets.arrayList(12);
		
		it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.println(p);
		}
		System.out.println();

//		Обновляем итератор
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next(); // Переводим курсор на следующую запись
			it.remove(); // Удаляем запись
		}
		System.out.println(pets);
	}

}
