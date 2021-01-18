package home.blackharold.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class SimpleStreamOf {

    public static void main(String[] args) {
        Stream.of(3, 1, 4, 1, 5, 9).forEach(x -> System.out.print(x));
        System.out.println();
        Stream.of(3, 1, 4, 1, 5, 9).forEach(System.out::print);
        System.out.println();
        Consumer<Integer> printer = System.out::print;
        Stream.of(3, 1, 4, 1, 5, 9).forEach(printer);
        System.out.println();
        Stream.generate(Math::random).limit(10).forEach(System.out::print);
    }
}
