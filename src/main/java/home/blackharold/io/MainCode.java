package home.blackharold.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCode {

	public static void main(String[] args) {
		String string = null;
		String[] splitter = null;
		int s = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			if ((string = br.readLine()) != null) {
				s = code(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(s);
	}

	private static int code(String s) {
		StringBuilder temp = new StringBuilder();
		int count = 1;
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				continue;
			}
//			temp.append(s.charAt(i)).append(count).append("");
			sum=sum+count;
			count = 1;
		}
//		temp.append(s.charAt(s.length() - 1)).append(count);
//		return temp.toString();
		return sum;
	}
}
