package home.blackharold.io.nio;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompress {

	public static void main(String[] args) throws IOException {

		if (args.length == 0) {
			System.err.println("Usage: \nGZIPcompress file\n\tUses GZIP compression to compress the file to test.gz");
			System.exit(1);
		}

		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BufferedOutputStream out = new BufferedOutputStream(
				new GZIPOutputStream(new FileOutputStream("philosophy_java/src/home/blackharold/io/nio/test.gz")));
		System.out.println("Writing file");
		int c;

		while ((c = in.read()) != -1) {
			out.write(c);
		}

		in.close();
		out.close();
		System.out.println("Reading file");
		BufferedReader in2 = new BufferedReader(new InputStreamReader(
				new GZIPInputStream(new FileInputStream("philosophy_java/src/home/blackharold/io/nio/test.gz"))));
		String s;

		while ((s = in2.readLine()) != null) {
			System.out.println(s);
		}
	}
} /* Execute to see output. Do not forget give arguments */// :~*/