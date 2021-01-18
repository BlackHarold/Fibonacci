package home.blackharold.utils;

public class While {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();

		int a, b=0;
		for (int j = 0; j < 26; j++) {
			a = (int) (Math.random() * 100);
			if (b!=0) {				
				System.out.print(a);
				if (a > b) {
					System.out.print(" > ");
				} else if (a < b) {
					System.out.print(" < ");				
				} else{
					System.out.print(" = ");		
				}
				System.out.println(b + " round " + j);
				
			}
			b=a;
		}

	}
}
