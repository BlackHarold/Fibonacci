package home.blackharold.io.nio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompress {

	public static void main(String[] args) throws IOException {

		/** FOS */
		FileOutputStream fos = new FileOutputStream("philosophy_java/src/home/blackharold/io/nio/test_zip.zip");
		CheckedOutputStream csum = new CheckedOutputStream(fos, new Adler32());
		ZipOutputStream zos = new ZipOutputStream(csum);
		BufferedOutputStream bos = new BufferedOutputStream(zos);
		zos.setComment("A test of Java Zipping");

		System.out.println("Writing files:\n-------------------");
		for (String string : args) {
			System.out.println("file: " + string);
			BufferedReader in = new BufferedReader(new FileReader(string));
			zos.putNextEntry(new ZipEntry(string));
			int x;

			while ((x = in.read()) != -1) {
				bos.write(x);
			}
			in.close();
			bos.flush();
		}
		bos.close();

		System.out.println("\nChecksum: " + csum.getChecksum().getValue() + "\n-------------------");
		System.out.println("Reading files:\n-------------------");

		/** FIS */
		FileInputStream fis = new FileInputStream("philosophy_java/src/home/blackharold/io/nio/test_zip.zip");
		CheckedInputStream csumi = new CheckedInputStream(fis, new Adler32());
		ZipInputStream zis = new ZipInputStream(csumi);
		BufferedInputStream bis = new BufferedInputStream(zis);
		ZipEntry ze;

		while ((ze = zis.getNextEntry()) != null) {
			System.out.println("file: " + ze);
			int c;
			while ((c = bis.read()) != -1) {
				System.out.println(c);
			}
		}

		System.out.println("\nChecksum: " + csumi.getChecksum().getValue() + "\n-------------------");
		bis.close();

		/** Alternative method to open&read ZIP-files */
		ZipFile zf = new ZipFile("philosophy_java/src/home/blackharold/io/nio/test_zip.zip");
		Enumeration e = zf.entries();
		while (e.hasMoreElements()) {
			ZipEntry ze2 = (ZipEntry) e.nextElement();
			System.out.println("file: " + ze2);
		}
	}
}
