package home.blackharold.type;

public class Pet extends Individual {
	public Pet(String name) {
		super(name);
	}

	public Pet() {
		super();
	}
}

class Dog extends Pet {
}

class Mutt extends Dog {
}

class Pug extends Dog {
}

class Cat extends Pet {
}

class EgyptianMau extends Cat {
}

class Manx extends Cat {
}

class Cymric extends Manx {
}

class Rodent extends Pet {
}

class Rat extends Rodent {
}

class Mouse extends Rodent {
}

class Hamster extends Rodent {
}
