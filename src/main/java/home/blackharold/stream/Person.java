package home.blackharold.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person person) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// методы equals, hashCode и toString methods ...

    public static void ListOfPersonsName() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Piter"));
        people.add(new Person("Nikola"));
        people.add(new Person("Sergey"));
        people.add(new Person("Pavel"));

        List<String> names;
        names = people.stream().map(person -> person.getName()).collect(Collectors.toList());
        names.stream().forEach((x) -> System.out.print(x + " "));
        System.out.println();
//        или
        names = people.stream().map(Person::getName).collect(Collectors.toList());
        names.stream().forEach((x) -> System.out.print(x + " "));
    }

    public static void ListOfNamesToPersons() {
        List<String> names = Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace", "Karen Sparck Jones");

        List<Person> people;

        people = names.stream().map(name -> new Person(name)).collect(Collectors.toList());
//        people.stream().forEach((x) -> System.out.print(x.getName() + " "));
        people.stream().forEach(x -> System.out.print(x.getName()+" "));
        System.out.println();
//        или
        people = names.stream().map(Person::new).collect(Collectors.toList());
        people.stream().forEach((x) -> System.out.print(x.getName() + " "));

    }

    public static void main(String[] args) {
//        ListOfPersonsName();
        ListOfNamesToPersons();


    }
}
