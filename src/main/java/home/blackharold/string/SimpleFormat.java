package home.blackharold.string;

public class SimpleFormat {

	public static void main(String[] args) {

		int x = 5;
		double y = 5.332542;
		
		System.out.println("v1 Row println: [" + x + " " + y + "]");
		System.out.printf("v3 Row printf: [%d %f]\n", x, y);
		System.out.format("v2 Row format: [%d %f]\n", x, y);

	}

}
