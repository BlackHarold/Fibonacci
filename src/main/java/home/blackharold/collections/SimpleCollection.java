package home.blackharold.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class SimpleCollection {

	public static void main(String[] args) {
		
		long m = System.currentTimeMillis();
//		System.out.println(m);
		// 
		Collection<Integer> s = new ArrayList();
//		Collection<Integer> s = new HashSet();

//		s.add(5);
//		s.add(1);
//		s.add(9);

		Integer[] moreInts = new Integer[1000];
		for (int i = 0; i < 1000; i++) {
		moreInts[i]=i;}
//		Collections.addAll(s, 100,102,111);
//		Collections.addAll(s);
//			s.add(i); 									// 0.047ms
//		s.addAll(Arrays.asList(i)); 					// 0.100ms
//		Collections.addAll(s, i); 						// 0.075ms
		Collections.addAll(s,moreInts); 				// 0.08ms
//		Collections.addAll(Arrays.asList(moreInts)); 	// 0.02ms

		for (Integer i : s)
			System.out.print(i + ", ");
		System.out.println("\n");
		System.out.println((System.currentTimeMillis()-m)/1000f + " ms");
	}

}