package home.blackharold.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Generator {

	private static final Map<byte[], byte[]> cache = new HashMap<byte[], byte[]>();

	public static byte[] generate(byte[] src) {
		byte[] generated = cache.get(src); // cache is Map
		if (generated == null) {
			synchronized (cache) {
				generated = cache.get(src);
				if (generated == null) {
					generated = doGenerate(src);
					cache.put(src, generated);

				}
			}
		}
		cache.entrySet().stream().map(entry -> String.format("%s] : %s]", entry.getKey(), entry.getValue()))
				.forEach(System.out::println);

		return generated;
	}

	private static byte[] doGenerate(byte[] src) {
		byte[] src1 = { 1, 2, 3, 4 };
		return src1;
	}

	public static void main(String[] args) {
		byte[] b3 = { 5, 6, 7, 8 };
		generate(b3);
	}
}
