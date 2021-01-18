package home.blackharold.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetOfInteger {
	static Random random = new Random();

	public static void main(String[] args) {
		
		SetOfInteger soi = new SetOfInteger();
		
		System.out.println(soi.getHashSet());
		
		System.out.println(soi.getTreeSet());

	}

	//
	Set<Integer> getHashSet() {
		Set<Integer> intset = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			intset.add(random.nextInt(30));
		}
		return intset;
	}
	
	SortedSet<Integer> getTreeSet(){
		SortedSet<Integer> intset = new TreeSet<>();
		for (int i = 0; i < 100; i++) {
			intset.add(random.nextInt(30));
		}
		return intset;
	}

}
