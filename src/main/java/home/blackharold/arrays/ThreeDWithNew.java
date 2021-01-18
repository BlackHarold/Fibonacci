package home.blackharold.arrays;

import java.util.Arrays;

public class ThreeDWithNew {

	private static int count = 1;

	public static void main(String[] args) {
		int[][][] a = new int[2][2][4];
		System.out.println(a.length);
		for (int i = 0; i <= 3; i++) {
			a[0][0][i] = count++;
		}
		System.out.println(Arrays.deepToString(a));
		for (int i = 0; i <= 3; i++) {
			a[0][1][i] = count++;
		}
		System.out.println(Arrays.deepToString(a));
		for (int i = 0; i <= 3; i++) {
			a[1][0][i] = count++;
		}
//		System.out.println(Arrays.toString(a));
//		Out: [[[I@6d06d69c, [[I@7852e922]
		System.out.println(Arrays.deepToString(a));

		System.out.println(Arrays.deepToString(a));
		for (int i = 0; i <= 3; i++) {
			a[1][1][i] = count++;
		}
		System.out.println(Arrays.deepToString(a));
	}

}
