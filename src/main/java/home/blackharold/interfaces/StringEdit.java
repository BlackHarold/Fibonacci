package home.blackharold.interfaces;

public class StringEdit {

	String s;

	public static void main(String[] args) {
		new SeatChanger().process("Карлсон который живет на крыше");
	}

}

class SeatChanger extends StringEdit {
	String process(String string) {
		char[] str = string.toCharArray();
		char b = str[0];

		for (int i = 0; i < str.length; i++) {
			if (i < str.length - 1) {
				str[i] = str[i + 1];
			}
		}
		str[str.length - 1] = b;

		s = String.valueOf(str);
		System.out.print(s);
		return s;
	}
}
