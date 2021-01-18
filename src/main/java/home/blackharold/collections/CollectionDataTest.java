package home.blackharold.collections;

import java.util.LinkedHashSet;
import java.util.Set;

import home.blackharold.generics.Generator;

public class CollectionDataTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 15));
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}

class Government implements Generator<String> {
	String[] foundation = ("strange woman lying in ponds distributing swords is no basic for a system of government")
			.split(" ");
	private int index;

	@Override
	public String next() {
		return foundation[index++];
	}
}
