package home.blackharold.serialize;

import java.io.Serializable;
import java.util.Random;

public abstract class Shape implements Serializable {

	public static final int RED = 1, BLUE = 2, GREEN = 3;
	private int xPos, yPos, dimension;
	private static Random rand = new Random();
	private static int counter = 0;

	public abstract void setColor(int newColor);

	public abstract int getColor();

	public Shape(int xPos, int yPos, int dimension) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "color [" + getColor() + "] xPos=[" + xPos + "] yPos[" + yPos
				+ "] dimension[" + dimension + "]\n";
	}

	public static Shape randomFactory() {
		int xVal = rand.nextInt(100);
		int yVal = rand.nextInt(100);
		int dim = rand.nextInt(100);

		System.out.println(counter++ % 3);
		switch (counter++ % 3) {
		default:
		case 0:
			return new Circle(xVal, yVal, dim);
		case 1:
			return new Square(xVal, yVal, dim);
		case 2:
			return new Line(xVal, yVal, dim);
		}
	}
}
