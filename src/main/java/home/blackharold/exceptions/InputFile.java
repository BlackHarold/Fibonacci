package home.blackharold.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {

	private BufferedReader in;

	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
//			System.out.println("Could not open " + fname);
			throw e;
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException e2) {
				System.out.println("Error in run in.close()");
			}
			throw e;
		} finally {

		}
	}

	public String getLine() {
		String s;

		try {
			s = in.readLine();
			if (s != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			throw new RuntimeException("error on running readLine");
		}
		return s;
	}

	public void dispose() {
		try {
			in.close();
			System.out.println("dispose O.K.");
		} catch (IOException e) {
			throw new RuntimeException("error on running in.close()");
		}
	}
}
