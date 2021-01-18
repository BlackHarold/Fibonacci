package home.blackharold.philosophy;

public class Label {

	public static void main(String[] args) {

		anylabel: while (true) {
			System.out.println("continue label");
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				continue anylabel;
			}
		}

	}

}
