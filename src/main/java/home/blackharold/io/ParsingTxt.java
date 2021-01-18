package home.blackharold.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class ParsingTxt {

	private static final String FILE_PATH = "E:\\Development\\Projects\\Fibonacci\\philosophy_java"
			+ "\\src\\home\\blackharold\\resources\\countries.txt";

	static Map<String, String> mapFromFile;

	public static Map<String, String> getCountries(String file) {

		FileInputStream fis = null;
		BufferedReader br = null;
		String line;

		try {
			fis = new FileInputStream(new File(file));
			br = new BufferedReader(new InputStreamReader(fis), 4096);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Map<String, String> mapFromFile = new TreeMap<>();
		try {

			while ((line = br.readLine()) != null) {
				String[] splitter = line.split("\\s-\\s");
				mapFromFile.put(splitter[0], splitter[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fis.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(mapFromFile);
		return mapFromFile;
	}

	public static Map<String, String> getCountries() {

		FileInputStream fis = null;
		BufferedReader br = null;
		String line;

		try {
			fis = new FileInputStream(new File(FILE_PATH));
			br = new BufferedReader(new InputStreamReader(fis), 4096);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Map<String, String> mapFromFile = new TreeMap<>();

		try {

			while ((line = br.readLine()) != null) {
				String[] splitter = line.split("\\s-\\s", 2);
				mapFromFile.put(splitter[0], splitter[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fis.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(mapFromFile);
		return mapFromFile;
	}

	public static void main(String[] args) throws IOException {
		getCountries(FILE_PATH);
	}
}