package home.blackharold.io.nio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Endians {

	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
		print(bb);
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		print(bb);
		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		print(bb);
	}

	static void print(ByteBuffer bb) {
		bb.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(bb.array()));
	}
}
