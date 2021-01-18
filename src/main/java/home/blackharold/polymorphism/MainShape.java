package home.blackharold.polymorphism;

//Философия Java Б. Эккель
//стр. 243, Глава 8, Полиморфизм

public class MainShape {
	private static RandomShapeGenerator rsg = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];
		
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = rsg.getShape();
		}
		
		
		for (Shape shape : shapes) {
			shape.draw();
		}

	}

}
