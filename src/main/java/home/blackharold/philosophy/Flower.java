package home.blackharold.philosophy;

public class Flower {
	int petalCount = 0;
	String s = "initial value";

	Flower(int petals) {
		petalCount = petals;
		System.out.println("Конструктор с параметром " + petalCount);
	}


	Flower(String string) {
		s = string;
	}

	Flower(int petals, String string) {
		this(petals);
//		this(string); <-- повторный вызов конструктора запрещен
		this.s=string;
	}
	
	public Flower() {
		this(5, "romashka");
	}
	
	void printPetalCount() {
//		this(11); вызов конструктора только из конструктора
		System.out.println(petalCount + " " + s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
