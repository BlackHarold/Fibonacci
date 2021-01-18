package home.blackharold.type;

public class ToyTest {

	static void printInfo(Class cc) {
		System.out.println("Name of class " + cc.getName() + " is Interface [" + cc.isInterface() + "]");
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("home.blackharold.type.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		printInfo(c);

		for (Class face : c.getInterfaces()) {
			printInfo(face);
		}

		Class up = c.getSuperclass();
		printInfo(up);
		try {
			Object o = up.newInstance();
			System.out.println("O class is " + o.getClass().getSimpleName());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	public Toy() {
		// TODO Auto-generated constructor stub
	}

	Toy(int i) {

	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {

}
