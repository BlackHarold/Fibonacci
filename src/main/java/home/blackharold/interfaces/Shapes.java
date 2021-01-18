package home.blackharold.interfaces;

public class Shapes {

	public static void goFactories(UnitFactory uf) {
		Cycle c = uf.getUnit();
		c.move();
		c.brake();
	}

	public static void main(String[] args) {
		goFactories(new UnitcycleFactory());
		goFactories(new TricycleFactory());
		goFactories(new BicycleFactory());
	}

}

interface Cycle {
	void move();

	void brake();
}

interface UnitFactory {
	Cycle getUnit();
}

class Unicycle implements Cycle {

	@Override
	public void move() {
		System.out.println(getClass().getSimpleName() + " move");

	}

	@Override
	public void brake() {
		System.out.println(getClass().getSimpleName() + " break");

	}

}

class Bicycle implements Cycle {

	@Override
	public void move() {
		System.out.println(getClass().getSimpleName() + " move");

	}

	@Override
	public void brake() {
		System.out.println(getClass().getSimpleName() + " break");

	}

}

class Tricycle implements Cycle {
	@Override
	public void move() {
		System.out.println(getClass().getSimpleName() + " move");
	}

	@Override
	public void brake() {
		System.out.println(getClass().getSimpleName() + " break");

	}
}

//FACTORIES FOR EACH OTHER TYPES
class BicycleFactory implements UnitFactory {
	@Override
	public Cycle getUnit() {
		return new Bicycle();
	}
}

class UnitcycleFactory implements UnitFactory {
	@Override
	public Cycle getUnit() {
		return new Unicycle();
	}
}

class TricycleFactory implements UnitFactory {
	@Override
	public Cycle getUnit() {
		return new Tricycle();
	}

}
