package home.blackharold.io;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

public class E08_CommandLine {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Необходимо передать имя файла параметром при запуске");
			return;
		}

		try {
			List<String> list = E07_FileIntoList.read(args[0]);
			for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
				System.out.println(it.previous());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
