package home.blackharold.generics;

public class Coffee {

	private static long counter = 0;
	private final long id = counter++;

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}

class Mocha extends Coffee {
}

class Latte extends Coffee {
}

class Cappuccino extends Coffee {
}

class Americana extends Coffee {
}

class Breve extends Coffee {
}