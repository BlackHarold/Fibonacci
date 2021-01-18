package home.blackharold.enumerated;

public class EnumClass {
	public static void main(String[] args) {
		for (Shrubbery shrubbery : Shrubbery.values()) {
			System.out.println(shrubbery + " ordinal: " + shrubbery.ordinal());
			System.out
					.print(shrubbery.compareTo(Shrubbery.CRAWLING) + " " + shrubbery.equals(Shrubbery.CRAWLING) + " ");
			System.out.println(shrubbery == Shrubbery.CRAWLING);
			System.out.println("class: " + shrubbery.getDeclaringClass().getSimpleName());
			System.out.println(shrubbery.name() + "\n----------------");

		}
	}
}

enum Shrubbery {
	GROUND, CRAWLING, HANGING
}