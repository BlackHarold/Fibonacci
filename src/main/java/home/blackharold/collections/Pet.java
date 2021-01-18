package home.blackharold.collections;

public class Pet {

	static int count = 0;
	int id;
	String name;

	public int getId() {
		return id;
	}

	public Pet() {
		id=count;
		count++;
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
//		return this.id + ":" + this.getClass().getSimpleName();
		return getClass().getSimpleName();
	}

}

class Hamster extends Pet {

	public Hamster() {

	}

}

class Rat extends Pet {
	public Rat() {
	}

	public Rat(String name) {
		super(name);
	}

}

class Cymric extends Pet {

	public Cymric() {

	}

	public Cymric(String string) {
		super(string);
	}

}

class Mutt extends Pet {

	public Mutt() {

	}

	public Mutt(String string) {
		super(string);
	}

}

class Mouse extends Pet {

	public Mouse() {

	}

	public Mouse(String name) {
		super(name);
	}

}

class Dog extends Pet {
	public Dog() {

	}

	public Dog(String name) {
		super(name);
	}
}

class Cat extends Pet {
	public Cat() {

	}

	public Cat(String name) {
		super(name);
	}
}
