package home.blackharold.philosophy;

import java.util.Arrays;
import java.util.HashSet;

public class Vampire {

    static void printVampire(int n1, int n2, int n3) {
        if (n1 * n2 == n3) {
            System.out.println(n1 + " x " + n2 + " = " + n3);
        }
    }

    public static void main(String[] args) {
        HashSet<Integer> found = new HashSet<>();
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                int k = i * j;
                if (!found.contains(k)) {
                    char[] arrayA = ((Integer.valueOf(i)).toString() + (Integer.valueOf(j)).toString()).toCharArray();
                    char[] arrayB = (Integer.valueOf(k)).toString().toCharArray();
                    Arrays.sort(arrayA);
                    Arrays.sort(arrayB);
                    if (Arrays.equals(arrayA, arrayB)) {
                        found.add(k);
                        printVampire(i, j, k);
                    }
                }
            }
        }

    }

}
