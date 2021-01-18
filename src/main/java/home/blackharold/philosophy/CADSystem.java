package home.blackharold.philosophy;

public class CADSystem extends Shape {

	CADSystem(int i) {
		super(i);
	}

	public static void main(String[] args) {
		CADSystem cadSystem = new CADSystem(50);
Shape sh = new Circle(10);

sh.dispose();
		cadSystem.dispose();

	}

}

class Shape {
	private int i;
	
	Shape(int i) {
		this.i=i;
		System.out.println("construct Shape");
	}

	void dispose() {
		System.out.println("remove any shape " + i);
	}
}

class Circle extends Shape {

	Circle(int i) {
		super(i);
		System.out.println("construct Circle");
	}

	void dispose() {
		super.dispose();
		System.out.println("remove Circle");
	}
}

class Line extends Shape {
	private int start, end;

	Line(int start, int end) {
		super(start);

		this.start = start;
		this.end = end;
		System.out.println("Line " + start + " " + end);
	}
}