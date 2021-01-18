package home.blackharold.philosophy;

public class OrderOfInitialization {

	public static void main(String[] args) {
		House house = new House();
	}
}

class House {
	Window w1 = new Window(1);
	Window w2 = new Window(2);

	House() {
		System.out.println("House()");
		w3 = new Window(33);
	}

	void f() {
		System.out.println("f()");
	}

	Window w3 = new Window(3);
}

class Window {
	Window(int marker) {
		System.out.println("Windows(" + marker + ")");
	}
}
