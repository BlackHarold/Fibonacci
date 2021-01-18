package home.blackharold.io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockingMappedFiles {

	static final int LENGTH = 1024 * 1024; // 1MB
	static FileChannel fc;

	public static void main(String[] args) throws Exception {

		RandomAccessFile raf = new RandomAccessFile("philosophy_java/src/home/blackharold/io/nio/test.dat", "rw");

		fc = raf.getChannel();

		System.out.println("FileChannel size is " + fc.size() / 1024 / 1024 + "MB");

		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);

		for (int i = 0; i < LENGTH; i++) {
			out.put((byte) 'x');
		}

		new LockAndModify(out, 0, 0 + LENGTH / 3);
		new LockAndModify(out, LENGTH / 2, LENGTH / 2 + LENGTH / 4);
	}

	private static class LockAndModify extends Thread {
		private ByteBuffer buff;
		private int start, end;

		public LockAndModify(ByteBuffer buff, int start, int end) {
			super();
			this.start = start;
			this.end = end;

			buff.limit(end);
			buff.position(start);
			this.buff = buff.slice();
			start();
		}

		@Override
		public void run() {
			try {
				// Monopoly blocking without overlap
				FileLock fl = fc.lock(start, end, false);
				System.out.println("Locked " + start + " to " + end);

				// Modify
				while (buff.position() < buff.limit() - 1) {
					buff.put((byte) (buff.get() + 1));
				}
				fl.release();
				System.out.println("Released: " + start + " to " + end);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
} /// :~
