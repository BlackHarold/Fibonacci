package home.blackharold.set;

import java.util.HashSet;
import java.util.Set;

public class SetTheory {

    public static void main(String[] args) {

        Set<Integer> exampleSet1 = new HashSet<>();
        Set<Integer> exampleSet2 = new HashSet<>();

        for (int i = 0; i < 10; i++)
            exampleSet1.add(i);
        System.out.println("exampleSet1" + exampleSet1);

        for (int i = 5; i < 15; i++)
            exampleSet2.add(i);
        System.out.println("exampleSet2" + exampleSet1);


        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> difference = new HashSet<>();

        //union
        union.addAll(exampleSet1);
        union.addAll(exampleSet2);
        System.out.println(union);

        //intersection
        intersection.addAll(exampleSet1);
        intersection.retainAll(exampleSet2);
        System.out.println(intersection);

        // difference
        difference.addAll(exampleSet1);
        difference.removeAll(exampleSet2);
        System.out.println(difference);
    }

}
