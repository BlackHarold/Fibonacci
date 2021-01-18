package home.blackharold.philosophy;

public class InitialRef {
	
	boolean bo;
	char ch;
	byte bt;
	short sh;
	int i;
	long l;
	float fl;
	double dbl;
	
	void printRefs() {
		System.out.println(": "+bo);
		System.out.println(": "+ch);
		System.out.println(": "+bt);
		System.out.println(": "+sh);
		System.out.println(": "+i);
		System.out.println(": "+l);
		System.out.println(": "+fl);
		System.out.println(": "+dbl);
	}

	public static void main(String[] args) {
		InitialRef initialRef = new InitialRef();
		new InitialRef().printRefs();
		initialRef.printRefs();

	}

}
