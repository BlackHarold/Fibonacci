package home.blackharold.string;

public class SimpleString {

	public static void main(String[] args) {
		String s = "asdfg";
		String x = Immutable.upcase(s);
		System.out.println(s);
		System.out.println(x);

	}

}

class Immutable{
	public static String upcase(String s) {
		return s.toUpperCase();
	}
}
