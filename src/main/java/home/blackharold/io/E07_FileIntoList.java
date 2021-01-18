package home.blackharold.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class E07_FileIntoList {

	public static List<String> read(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String str;
		List<String> list = new LinkedList<>();

		while ((str = br.readLine()) != null) {
			list.add(str);
		}

		br.close();
		return list;

	}

	public static void main(String[] args) throws IOException {
		List<String> list = read("philosophy_java\\src\\home\\blackharold\\io\\E07_FileIntoList.java");

		for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
			System.out.println(it.previous());
		}
	}

}
