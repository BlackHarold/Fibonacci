package home.blackharold.extend;

public class Beetle extends Insect {

	private int k = printInit("Поле beetle.k = ");
	
	private static int x2 = printInit("Поле static Beetle.x2 = ");

	public Beetle() {
//		super();
		prt("prt k = " + k);
		prt("prt j = " + j);
	}

	public static void main(String[] args) {
		System.out.println("Start main()");
		Beetle b = new Beetle();
		Beetle c = new Beetle();
	}

}

class Insect {
	
	private int i = 9;
	protected int j;
	
	private static int x1 = printInit("Поле static Insect.x1 = ");

	public Insect() {
		System.out.println("Конструктор Insect i: " + i + " j: " + j);
		j = 39;
	}

	static int printInit(String s) {
		System.out.println("static printInit (" + s + ")");
		return 47;
	}

	void prt(String s) {
		System.out.println("prt (" + s + ")");
	}
}
