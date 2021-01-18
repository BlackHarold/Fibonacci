package home.blackharold.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StoreCADState {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Class<? extends Shape>> shapeTypes = new ArrayList<Class<? extends Shape>>();

		shapeTypes.add(Circle.class);
		shapeTypes.add(Square.class);
		shapeTypes.add(Line.class);

		List<Shape> shapes = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			shapes.add(Shape.randomFactory());
		}

		for (int i = 0; i < 10; i++) {
			((Shape) shapes.get(i)).setColor(Shape.GREEN);
		}

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("philosophy_java/src/home/blackharold/serialize/CADState.out"));

		oos.writeObject(shapeTypes);
		Line.serializeStaticState(oos);
		Circle.serializeStaticState(oos);
		Square.serializeStaticState(oos);
		oos.writeObject(shapes);
		System.out.println(shapes);
	}

}
