package home.blackharold.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead {

	static String s = "Sir Robert of Camelot\n22 1.61803";

	public static BufferedReader br = new BufferedReader(new StringReader(s));

	public static void main(String[] args) {
		try {
			System.out.println("What is your name?");
			System.out.println(br.readLine());
			System.out.println("How old are you and what is your favorite double number?");
			String[] s = br.readLine().split(" ");
			System.out.printf("%d %f\n", Integer.parseInt(s[0]), Float.parseFloat(s[1]));
			throw new IOException();
		} catch (IOException e) {
			System.err.println("I/O exception");
		}

	}

}
