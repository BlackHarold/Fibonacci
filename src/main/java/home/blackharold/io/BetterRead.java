package home.blackharold.io;

import java.util.Scanner;

public class BetterRead {

    public static void main(String[] args) {
        Scanner sc = new Scanner(SimpleRead.br);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

}
