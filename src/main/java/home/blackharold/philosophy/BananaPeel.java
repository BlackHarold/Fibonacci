package home.blackharold.philosophy;

class Banana {

	void peel(int i) {
		/* .......... */
	}
}

public class BananaPeel {

	public static void main(String[] args) {
//		Banana a = new Banana(), b = new Banana();
//		a.peel(1);
//		b.peel(2);
		
//		Leaf l = new Leaf();
//		l.increment().increment().increment().increment().increment().increment().print();;
		
		new Person().eat(new Apple());
	}
}


class Apricot {
	void pick() {}
	void pit() {
		pick();
	}
}


class Leaf{
	int i = 0;
	Leaf increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " + i);
	}
}

class Person {
	void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy!");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		return apple;
	}
}

class Apple{
	Apple getPeeled(){
		return Peeler.peel(this);
	}
}
