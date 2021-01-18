package home.blackharold.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

	
		Set<String> getHashSet() throws Exception{
		BufferedReader r=new BufferedReader(new FileReader("E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\"
				+ "home\\blackharold\\resources\\text.txt"));
		Set<String> words = new TreeSet<>();
		
		while (r.readLine() != null) {
			String s = r.readLine();
			Collections.addAll(words, s.split("\t"));
		}
		System.out.println(words);

		return words;
		}
}
