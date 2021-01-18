package home.blackharold.utils;

public class Dog {

	void go() {
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		Dog tichon;
		tichon = spot;
		System.out.println(tichon == spot);
		System.out.println(tichon.equals(spot));
		System.out.println(scruffy == spot);
		System.out.println(scruffy.equals(spot));
	}

	public static void main(String[] args) {
		new Dog().go();
	}

}
