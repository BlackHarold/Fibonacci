package home.blackharold.io.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class RunByHand {
	static int length =1*1024*1024; // 1Mb

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("philosophy_java\\src\\home\\blackharold\\io\\nio\\test.dat", "rw");
		MappedByteBuffer out = raf.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);

		for (int i = 0; i < length; i++)
			out.put((byte) 'x');
		System.out.println("Finished writing");
		for (int i = length / 2; i < length / 2 + 6; i++) {
			System.out.println((char) out.get(i));
		}

		out.clear();
		raf.close();
		
	}
}
