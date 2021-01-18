package home.blackharold.polymorphism;

import java.util.Random;

import home.blackharold.generics.Generator;

public class RandomShapeGenerator {

	private Random random = new Random();

	public Shape getShape() {
		switch (random.nextInt(3)) {
		case 0:
			return new Circle();
		case 1:
			return new Triangle();
		case 2:
		default:
			return new Square();
		}
	}

	public Generator String(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
