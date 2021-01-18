package home.blackharold.enumerated;

public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		super();
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Burrito is " + degree;
	}

	public static void main(String[] args) {
		System.out.println(new Burrito(Spiciness.NOT));
		System.out.println(new Burrito(Spiciness.MEDIUM));
		System.out.println(new Burrito(Spiciness.HOT));
	}

}

enum Spiciness {
	NOT, MILD, MEDIUM, HOT, FLAMING
}
/*Output:
 * Burrito is NOT 
 * Burrito is MEDIUM 
 * Burrito is HOT
 *///:~