package home.blackharold.string;

import java.util.Formatter;

public class FormaFormatter {

	private String line = "------------------------------------------------";
	private Formatter f = new Formatter(System.out);

	public void getTable() {
		System.out.printf("\n" + "%25s\n", "Символы преобразования");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "d", "|", "Целое число (десятичное)");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "c", "|", "Символ юникода)");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "b", "|", "Логическое значение");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "s", "|", "Строка");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "f", "|", "Вещественное число (в десятичной записи");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "e", "|", "Вещественное число (в экспоненциальной записи");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "x", "|", "Целое число (шеснадцатеричное)");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "h", "|", "Хеш-код (в шеснадцатеричной записи");
		System.out.println(line);
		f.format("%-5s %s %5s\n", "%", "|", "Литерал <<%>>");
		System.out.println(line);
	}

	public static void main(String[] args) {
		FormaFormatter ff = new FormaFormatter();
		ff.getTable();

	}

}
