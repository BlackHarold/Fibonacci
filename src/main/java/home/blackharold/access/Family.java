package home.blackharold.access;

//Задание 13, страница 221
public class Family {

    String[] s;

    Family(String... args) {
        if (args.length != 0) {
            s = new String[args.length];
            int i = 0;
            for (String string : args) {
                s[i] = string;
                System.out.print(s[i] + " ");
                i++;
            }
        }
        System.out.println();
    }

    public String goToPark(String name) {
        System.out.println(name + ", going to park!");
        return name + " going to park!";
    }

    void goToPark(float i, String name) {
        System.out.println(i + " " + name + " float going to park!");
    }

    public String toString() {
        for (String string : s) {
            System.out.println(string);
        }
        return null;
    }

    public static void main(String[] args) {

        Family family = new Family("name1", "name2", "name3");
        System.out.println(family);
        Father father = new Father();

        father.goToPark(1);
        father.goToPark("FATHER");
        father.goToPark(1f, "FATHER?");
    }
}

class Father extends Family {

    void goToPark(int i) {
        System.out.println(i + " int going to park");
    }

}
