package home.blackharold.file;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		MyFileFilter mff = new MyFileFilter("doc", "pdf");
		File folder = new File("E:\\Books\\Java");

		File[] filelist = folder.listFiles(mff);

		for (File file : filelist) {
			System.out.println(file);
		}
	}
}
