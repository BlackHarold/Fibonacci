package home.blackharold.generics;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	private int n;

	public IterableFibonacci(int i) {
		n = i;
	}

	@Override
	public Iterator<Integer> iterator() {

		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}

			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
		};
	}

	public static void main(String[] args) {
		for (int i : new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}

	}

}

class Fibonacci implements Generator<Integer> {

	private int count = 0;

	@Override
	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

}