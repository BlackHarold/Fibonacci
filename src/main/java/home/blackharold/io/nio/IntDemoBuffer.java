package home.blackharold.io.nio;

import java.nio.*;

public class IntDemoBuffer {

	private static final int BSIZE = 1024;

	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[] { 11, 42, 47, 99, 143, 811, 1016, 2012 });
		System.out.println("ib.get(3) is" + ib.get(3));
		ib.put(3, 1181);
		
		ib.flip();

		while (ib.hasRemaining()) {
			int i = ib.get();
			System.out.println(i);
		}
	}
}
