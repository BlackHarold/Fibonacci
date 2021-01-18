package home.blackharold.string;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Splitting {

	public static String knights = "Then, when you have found the shrubbery, you must "
			+ "cut  down the mightiest tree in the forest... with... a herring!.";

	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	public static void check1() {
		System.out.println(knights.matches("[A-Z].*\\."));
	}
	
	public static void check2() {
		System.out.println(knights.matches("\\p{javaUpperCase}.*\\."));
	}
	
	public static void replace() {
		System.out.println(knights.replaceAll("[aeuio]", "_"));
	}
	
	public static void splitthis() {
		System.out.println(Arrays.toString(knights.split("the|you")));
	}
	
	public static void main(String[] args) {
		splitthis();
//		replace();
//		check1();
//		check2();
//split(" ");
//split("\\W+");
//split("n\\W+");

	}

}
