package home.blackharold.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted;

        sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        sorted.forEach(System.out::printf);
        System.out.println();
        //~ aislistofstringsthis

        sorted = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        sorted.forEach((x) -> System.out.printf("%1s ", x));
        //~ a is list of strings this
        System.out.println();

        strings.stream().map(String::length).forEach((x) -> System.out.print(x + " "));
        //~ 421427

        System.out.printf("%n%6d%n%6d%n%6d%n%6d%n%6d%n%6d%n", 666666,55555,4444,333,22,1);

    }
}