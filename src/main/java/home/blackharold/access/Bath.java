package home.blackharold.access;

public class Bath {
    public static void main(String[] args) {
        Soap soap = new Soap();
        System.out.println(soap.toString());
    }
}

class Soap {
    private String s;

    public String toString() {
        s = "Well done!";
        return s;
    }
}
