package home.blackharold.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1, 100);
		
		List<Integer> aList = new LinkedList<>();
		
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(1, 100);
		
		System.out.println(list);
		System.out.println(aList);
	}
}
