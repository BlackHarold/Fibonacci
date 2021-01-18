package home.blackharold.stream;

import java.io.ByteArrayInputStream;

public class SimpleByteArray {

    public static void main(String[] args) {

        String str = "Hello world!";
        byte[] mas = str.getBytes();

        ByteArrayInputStream b = new ByteArrayInputStream(mas);
        int c = 0;

        while (c != -1) {
            c = b.read();
            if (c != -1) {

                System.out.println((char) c + " " + c);
            }
        }
    }
}
