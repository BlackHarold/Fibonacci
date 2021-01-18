package home.blackharold.philosophy;

public class Burrito {

	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	void describe() {
		switch (degree) {
		case NOT:
			System.out.println("Not spicy");
			break;
		case MILD:
		case MEDIIUM:
			System.out.println("A little hot");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("Maybe too HOT!");
			break;
		}
	}

	public static void main(String[] args) {

		Burrito light = new Burrito(Spiciness.NOT);
		Burrito hot = new Burrito(Spiciness.MEDIIUM);
		Burrito flame = new Burrito(Spiciness.FLAMING);
		
		light.describe();
		hot.describe();
		flame.describe();
	}

}

enum Spiciness {
	NOT, MILD, MEDIIUM, HOT, FLAMING
}
