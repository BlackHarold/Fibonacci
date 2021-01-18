package home.blackharold.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EightWaysToIterate {

	public static void main(String[] args) {

		List<String> colorList = Arrays.asList("red", "blue", "green", "yellow", "brown", "white", "black");
		List<String> list = Arrays.asList(new String[]{"","",""});

		//for loop
		for (int i = 0; i < colorList.size(); i++)
			System.out.print(colorList.get(i) + " ");
		System.out.println();

		//foreach
		for (String color : colorList)
			System.out.print(color + " ");
		System.out.println();

		//for loop with iterator
		for (Iterator iterator = colorList.iterator(); iterator.hasNext();)
			System.out.print(iterator.next() + " ");
		System.out.println();

		//iterator with while
		Iterator<String> iterator = colorList.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();

		//Java 8 stream lambda expression
		colorList.stream().forEach(color -> System.out.print(color + " "));
		System.out.println();

		//Java 8 stream method
		colorList.stream().forEach(System.out::print);
		System.out.println();

		//Java 8 foreach lambda
		colorList.forEach(color -> System.out.print(color + " "));
		System.out.println();

		//Java 8 foreach
		colorList.forEach(System.out::print);
		System.out.println();
	}

}
