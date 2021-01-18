package home.blackharold.io;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class E09_UpperCase {
//	public class E10_FindWords{

	public static void main(String[] args) {
//		args[0]="philosophy_java\src\home\blackharold\io\E07_FileIntoList.java"
//		args[1]="import"
		if (args.length < 2) {
			System.err.println("Необходимо передать имя файла и искомое слово в параметрах при запуске");
			return;
		}

		try {
			Set<String> words = new HashSet();
			for (int i = 1; i < args.length; i++) {
				words.add(args[i]);
			}
			List<String> list = E07_FileIntoList.read(args[0]);
			for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
				String candidate = it.previous();
				for (String word : words) {
					if (candidate.indexOf(word) != -1) {
						System.out.println(candidate);
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
