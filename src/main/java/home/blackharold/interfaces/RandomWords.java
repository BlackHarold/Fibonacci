package home.blackharold.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class RandomWords implements Readable {

	private static Random r = new Random();
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghjklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;

	public RandomWords(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) return -1;
		
		cb.append(capitals[r.nextInt(capitals.length)]);

		for (int i = 0; i < 4; i++) {
			//System.out.println(r.nextInt());
			cb.append(vowels[r.nextInt(vowels.length)]);
			cb.append(lowers[r.nextInt(lowers.length)]);
		}

		cb.append(" ");
		return 10;
	}

	public void getRandomString() {
		String s = "";

		s += capitals[r.nextInt(capitals.length)];
		for (int i = 0; i < 4; i++) {
			// System.out.println(r.nextInt());
			s += vowels[r.nextInt(vowels.length)];
			s += lowers[r.nextInt(lowers.length)];
		}

		s += " ";
		System.out.println(s);
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(new RandomWords(10));
//		while (scanner.hasNext()) {
//			System.out.println(scanner.next());
//		}
		RandomWords rw = new RandomWords(10);
		for (int i = 0; i < rw.count; i++) {
			rw.getRandomString();
		}

	}

}
