package home.blackharold.utils;

import java.util.ArrayList;

public class Light implements LightPrivate {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        int x = 1, y = 0;

        try {
            System.out.println(x / y);

        } catch (ArithmeticException e) {
            System.out.println("Поделить на нуль нельзя!");            // TODO: handle exception
            e.getMessage();
            e.printStackTrace();
            e.getLocalizedMessage();
            e.fillInStackTrace();
        }

        String string = "Строка";
        str.add(string);

        for (String object : str) {
            System.out.println(object);
        }

        Object o = new Object();

        System.out.println(o.getClass());

        Light l = new Light();

        string.length();
        String line = (String) str.get(0);
        System.out.println(str.get(0).equals(line));
        System.out.println(str.get(0) == line);
        System.out.println();
    }
}
