package home.blackharold.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class RecoverCADState {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("philosophy_java/src/home/blackharold/serialize/CADState.out"));


        List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>) ois.readObject();

        Line.deserializableStaticState(ois);
        Circle.deserializableStaticState(ois);
        Square.deserializableStaticState(ois);

        List<Shape> shapes = (List<Shape>) ois.readObject();

        System.out.println(shapes);
    }

}
