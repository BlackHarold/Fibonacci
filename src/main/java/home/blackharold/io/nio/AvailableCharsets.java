package home.blackharold.io.nio;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class AvailableCharsets {

	public static void main(String[] args) {
		SortedMap<String, Charset> charSets = Charset.availableCharsets();

		Iterator<String> iterator = charSets.keySet().iterator();

		while (iterator.hasNext()) {
			String csName = iterator.next();
			System.out.print(csName);
			Iterator aliases = charSets.get(csName).aliases().iterator();
			if (aliases.hasNext()) {
				System.out.print(": ");
				while (aliases.hasNext()) {
					System.out.print(aliases.next());
					if (aliases.hasNext()) {
						System.out.print(", ");
					}
				}
			}
			System.out.println();
		}

	}

}
