package home.blackharold.io.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileOutputStream fos = new FileOutputStream("philosophy_java\\src\\home\\blackharold\\io\\file.txt");
		FileLock fl = fos.getChannel().tryLock();
		
		if (fl !=null) {
			System.out.println("Locked File!");
			TimeUnit.MILLISECONDS.sleep(1000);
			fl.release();
			System.out.println("Released lock");
		}
		fos.close();
	}
} 
/* Output:
 * Locked File!
 * Released lock
 *///:~
