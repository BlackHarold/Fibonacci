package home.blackharold.exceptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Cleanup {

	public static void main(String[] args) {

//		Path path = Paths.get("E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\exceptions\\Cleanup.java");
		Path path = Paths.get("E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\exceptions\\WithError_Cleanup.java");
		InputFile in = null;
		
		System.out.println(path + "\n------------------------------------------------------------------------------------------");
		
		try {
//			in = new InputFile("E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\resources\\text.txt");
//			in = new InputFile("E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\exceptions\\Cleanup.java");
//			in = new InputFile(new File("src\\home\\blackharold\\exceptions\\Cleanup.java").getAbsolutePath());
//			in = new InputFile(new File("src\\\\home\\\\blackharold\\\\exceptions\\\\Cleanup.java").getPath());
			in = new InputFile(path.toString());
			String s;
			int i = 1;
			while ((s = in.getLine()) != null);

		} catch (Exception e) {
			System.out.println("Exception in main");
			e.printStackTrace(System.out);
		} finally {
			in.dispose();
		}
	}

}
