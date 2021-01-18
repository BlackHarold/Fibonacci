package home.blackharold.philosophy;

public class VarArgs {

	static void staticString(String... args) {
		for (String string : args) {
			System.out.print(string);
		}
		System.out.println();
	}

	static void printArray(Object... args) {
		for (Object object : args) {
			System.out.print(object + " : ");
		}
		System.out.println();
	}

	public static void main(String... args) {
//		printArray(new Object[] { new A(), new A(), new A() });
//		printArray(new Object[] { "1", "2", "3" });
//		printArray(new Object[] { new Integer(1), new Float(2), new Double(3), new String("4") });

//		printArray(new A(), new A(), new A());
//		printArray("1", "2", "3");
//		printArray(new Integer(1), new Float(2), new Double(3), new String("4"));

		staticString("string1 ", "string2 ");
//		String[] s = new String[5];
		String[] s = { "1", "2", "3", "4", "5" };
		int i = 0;
//		for (int j = 0; j < s.length; j++) {
//			s[j]=Integer.toString(i);
//			i++;
//		}
		staticString(s);
		
		System.out.println(args.toString());
	}

}

class A {
	int i;
}
