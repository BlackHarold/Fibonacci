package home.blackharold.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainRLE {

	public static void main(String[] args) {
		String string = null;
		String[] splitter = null;
		String s = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			if ((string = br.readLine()) != null) {
				s = code(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(s);
		s = decode(s);
		System.out.println(s);
	}

	private static String code(String s) {
		StringBuilder temp = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				continue;
			}
			temp.append(s.charAt(i)).append(count).append(" ");
			count = 1;
		}
		temp.append(s.charAt(s.length() - 1)).append(count);
		return temp.toString();
	}

	private static String decode(String s) {
		StringBuilder temp = new StringBuilder();
		String[] items = s.split(" ");
		for (String item : items) {
			int count = Integer.parseInt(item.substring(1));
			for (int j = 0; j < count; j++) {
				temp.append(item.charAt(0));
			}
		}
		return temp.toString();
	}
}
