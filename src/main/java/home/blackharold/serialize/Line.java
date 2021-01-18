package home.blackharold.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Line extends Shape {

	private static int color = RED;

	public Line(int xPos, int yPos, int dimension) {
		super(xPos, yPos, dimension);
	}
	
	public static void serializeStaticState(ObjectOutputStream oos) throws IOException {
		oos.writeInt(color);
	}
	
	
	public static void deserializableStaticState(ObjectInputStream ois) throws IOException {
		color=ois.readInt();
	}

	@Override
	public void setColor(int newColor) {
		color = newColor;
	}

	public int getColor() {
		return color;
	}

}
