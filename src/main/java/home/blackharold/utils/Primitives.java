package home.blackharold.utils;

public class Primitives {

    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(47);
        Integer n2 = Integer.valueOf(47);

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        n1 = n2;

        System.out.println(n1 == n2);

    }

}
