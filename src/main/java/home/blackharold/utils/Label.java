package home.blackharold.utils;

public class Label {

	public static void main(String[] args) {

luboylabel:
	while (true) {
		System.out.println("continue label");
		for (int i = 0;; i++) {
			System.out.println(i);
			continue luboylabel;
		}
	}

	}

}
