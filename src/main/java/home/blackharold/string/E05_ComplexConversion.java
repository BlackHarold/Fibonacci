package home.blackharold.string;

import java.math.BigInteger;
import java.util.Formatter;
import java.util.Locale;

public class E05_ComplexConversion {
	static Formatter f;

	public static void main(String[] args) {
		f = new Formatter(System.out, Locale.US);
		
		char u = 'a';
		System.out.println("\nu = 'a'");
		f.format("s: %1$-10s\n", u);
		f.format("c: %1$-10c\n", u);
		f.format("b: %1$-10.10b\n", u);
		f.format("h: %1$-10.10h\n", u);

		int v = 1000;
		System.out.println("\nv=1000");
		f.format("d 1: %1$(,0+10d\n", v);
		f.format("d 2: %1$-(, 10d\n", v);
		f.format("d 3, v = -v: %1$-(, 10d\n", -v);
		f.format("c, v = 121: %1$-10c\n", 121);
		f.format("b: %1$-10.10b\n", v);
		f.format("s: %1$-10.10s\n", v);
		f.format("x: %1$-#10x\n", v);
		f.format("h: %1$-10.10h\n", v);

		BigInteger w = new BigInteger("50000000000000");
		System.out.println("\nw = new BigInteger(\"50000000000000\")");
		f.format("d 1: %1$(,0+10d\n", w);
		f.format("d 2: %1$-(, 10d\n", w);

	}
}
