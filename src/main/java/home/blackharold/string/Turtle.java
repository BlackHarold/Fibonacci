package home.blackharold.string;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {

	private String name;
	private Formatter f;

	public Turtle(String name, Formatter f) {
		super();
		this.name = name;
		this.f = f;
	}

	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		PrintStream outError = System.err;

		Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
		Turtle terry = new Turtle("Terry", new Formatter(outAlias));
		Turtle terror = new Turtle("Terror", new Formatter(outError));

//		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
//		Turtle terry = new Turtle("Terry", new Formatter(outAlias));
//		Turtle terror = new Turtle("Terror", new Formatter(outError));

		tommy.move(0, 0);
		terry.move(4, 8);
		terror.move(1, 1);
		tommy.move(3, 4);
		tommy.move(2, 5);
		terry.move(3, 3);
		tommy.move(3, 3);

	}

}
