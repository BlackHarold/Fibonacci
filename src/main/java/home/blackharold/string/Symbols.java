package home.blackharold.string;

public class Symbols {

	public static void main(String[] args) {
		int s=0;
		
		
		for (int i = 0; i < 2000; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%-2c", s);
				s++;
			}
			System.out.println(s);
		}

	}

}
