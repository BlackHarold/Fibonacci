package home.blackharold.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TextFileRomanovka {

	private final String FILE_PATH = "E:\\Development\\Projects\\Fibonacci\\philosophy_java\\src\\home\\blackharold\\resources\\debs.txt";

	private static Map<Integer, CreditAccount> mapFromFile = new HashMap<>();
	private FileInputStream fis = null;
	private BufferedReader br = null;
//	private BufferedInputStream bis = null;
	private String line;
	private static String winner;
	private String[] splitter;
	private int count = 0;
	private double credit = 0;

	private static double max = 0;

	public Map<Integer, CreditAccount> getStrings() {
		tryParse(FILE_PATH);
		return mapFromFile;
	}

	public void tryParse(String file) {
		try {
			fis = new FileInputStream(new File(file));
			br = new BufferedReader(new InputStreamReader(fis), 2048);
//			bis = new BufferedInputStream(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
				while ((line = br.readLine()) != null) {
				splitter = line.split("\\s");

				for (String string : splitter) {
					string.replaceAll(" ", "");
				}
				splitter[4] = splitter[4].replaceAll(",", "");
				splitter[6] = splitter[6].replaceAll(",", ".");
				if (max < Double.parseDouble(splitter[6])) {
					max = Double.parseDouble(splitter[6]);
					winner = "поселок: " + splitter[1] + ", дом " + splitter[4] + ", кв. " + splitter[5] + ", ДОЛГ: "
							+ Double.parseDouble(splitter[6]) + "руб.";
				}
				credit = Double.parseDouble(splitter[6]);

				System.out.println("поселок: " + splitter[1] + ", дом " + splitter[4] + ", кв. " + splitter[5]
						+ ", ДОЛГ: " + Double.parseDouble(splitter[6]) + "руб.");

				mapFromFile.put(count, new CreditAccount(splitter[1], Integer.parseInt(splitter[5]),
						Integer.parseInt(splitter[5]), credit));
				count++;
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
	}

	public static void main(String[] args) throws IOException {
		new TextFileRomanovka().getStrings();
		System.out.println("Всего " + mapFromFile.size() + " записи в базе");
		System.out.println("Победителем стал: " + winner);
	}
}