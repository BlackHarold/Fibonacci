package home.blackharold.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		int sum = 0;
		String string;
		String[] splitter = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> unique = new LinkedHashSet<>();

		try {
			if ((string = br.readLine()) != null) {
				splitter = string.split(" ", p);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		for (String str : splitter) {
			list.add(Integer.parseInt(str));
		}

		unique.addAll(list);

		for (int uNum : unique) {
			sum = sum + uNum;
		}

		System.out.println(sum);

	}
}
