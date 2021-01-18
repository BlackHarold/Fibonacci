package home.blackharold.interfaces;

import java.util.Random;

public class WheelOfFortune {

	static int count;
	public static Random r = new Random();

	public static void getFactory(WheelUnitFactory uf) {
		Unit u = uf.getCoin();
		System.out.println(u.flip());
	}

	public static void main(String[] args) {
		getFactory(new ImplCoinFactory());
		getFactory(new ImplCubeFactory());
	}
}

interface Unit {
	Random r = new Random();

	String flip();
}

interface WheelUnitFactory {
	Unit getCoin();
}

class Coin implements Unit {
	int i;

	@Override
	public String flip() {
//		Random r = new Random();
		i = r.nextInt(2);

		switch (i % 2) {
		case 0:
			return "head";
		case 1:
			return "tail";
//		default:
//			return "Error. Try again!";
		}
		return null;
	}
}

class ImplCoinFactory implements WheelUnitFactory {
	@Override
	public Unit getCoin() {
		// 
		return new Coin();
	}
}

class Cube implements Unit {
	int i;

	@Override
	public String flip() {
		i = r.nextInt(6) + 1;
		switch (i) {
		case 1:
			return "\n * ";
			case 2: return "\n* *";
			case 3: return "\n* * *";
			case 4: return "* *\n* *";
			case 5: return "* *\n * \n* *";
			case 6: return "* * *\n* * *";

		}
		return null;
	}
}

class ImplCubeFactory implements WheelUnitFactory {

	@Override
	public Unit getCoin() {
		// 
		return new Cube();
	}

}
