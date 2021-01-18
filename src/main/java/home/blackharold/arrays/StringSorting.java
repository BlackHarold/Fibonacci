package home.blackharold.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
//        String[] sa = new String[]{"B", "C", "A", "E", "D"};
        String[][] sa = {{"05", "02", "01", "04"}, {"One", "Two", "Ten", "Six"}};
        System.out.println("Before sort: " + Arrays.deepToString(sa));
        Arrays.sort(sa);
        System.out.println("After sort: " + Arrays.deepToString(sa));
        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println("Reverse sort: " + Arrays.deepToString(sa));

        List<BerylliumSphere>[] sphere = new List[10];
        for (int i = 0; i < sphere.length; i++) {
            sphere[i] = new ArrayList<>();
        }
    }
}
