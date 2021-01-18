package home.blackharold.io;

import java.io.File;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) {

		File fl = new File(".//src//home//blackharold//resources");
		File fl1 = new File(".//src//home//blackharold//resources//a.txt");
		File fl2 = new File(".//src//home//blackharold//resources//A");
		fl2.mkdir();

		File fl3 = new File(fl2, "a1.txt");

		try {
			fl1.createNewFile();
			fl3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File[] fileArray = fl.listFiles();
		for (File file : fileArray) {
			System.out.println(file.getName() + " " + (file.isFile() ? "file " : "/folder... ") + file.length());
		}
		
		fl3.delete();
		fl2.delete();

		System.out.println();
		for (File file : fl.listFiles()) {
			System.out.println(file.getName() + " " + (file.isFile() ? "file " : "/folder... ") + file.length());
		}
	}
}
