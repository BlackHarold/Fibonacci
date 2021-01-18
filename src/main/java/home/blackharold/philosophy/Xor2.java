package home.blackharold.philosophy;

public class Xor2 {

	public static void main(String[] args) {

int a=0;
int b=1;

boolean c=true;
boolean d=false;

System.out.println(Integer.toBinaryString(a));
System.out.println(Integer.toBinaryString(b));
System.out.println("только если A и B == 1:             " + Integer.toBinaryString(a&b));
System.out.println("если A или B == 1:                  " + Integer.toBinaryString(a|b));
System.out.println("только если A != B:                 " + Integer.toBinaryString(a^b));
System.out.println(Integer.toBinaryString(~a));
System.out.println(Integer.toBinaryString(~b));

System.out.println();

System.out.println(c&d);
System.out.println(c|d);
System.out.println(c^d);
System.out.println(!c);
System.out.println(!d);

	}
}