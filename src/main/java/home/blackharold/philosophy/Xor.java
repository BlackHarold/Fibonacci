package home.blackharold.philosophy;

public class Xor {

	public static void main(String[] args) {

		int a = 255;
		String bytecode = Integer.toBinaryString(a);
		System.out.println(bytecode + "\n-------------\n");

		int b = 0;
		char c;
		int increment = 1;

		for (int i = bytecode.length() - 1; i >= 0; i--) {

			b = Integer.parseInt(String.valueOf(bytecode.charAt(i)));
//			c = (char)bytecode.charAt(i);
			if (i != bytecode.length() - 1) {
				increment *= 2;
			}
			System.out.println(b + " x " + increment + " = " + b * increment);
		}
	}
}