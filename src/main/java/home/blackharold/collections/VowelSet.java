package home.blackharold.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class VowelSet {

	static int count = 0, word = 0;

	public static void main(String[] args) {

		Set<String> vowelSet = new HashSet<>();
		Set<String> vowel = new HashSet<>();

		try {
			vowelSet = new UniqueWords().getHashSet();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Collections.addAll(vowel, "aeuio".split(""));

		for (String string : vowelSet) {
			System.out.println(string);

			for (char c : string.toCharArray()) {

				if (vowel.contains(c)) {
					count++;
				}
			}
		}	
		System.out.println(count);

	}

}
