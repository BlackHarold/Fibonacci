package home.blackharold.utils;

public class Fibonacci {

	public static void main(String[] args) {
		new Fibonacci().fib(100000000);
	}
	
	void fib(int n) {
		int a = 0,b=1;
		int sum;
		System.out.print(a + " " + b + " ");
		while (a<n) {
		sum=a+b;
		System.out.print(sum + " ");
			a=b;
			b=sum;
		}
	}
}
