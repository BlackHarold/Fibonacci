package home.blackharold.string;

import java.util.Formatter;

public class Receipt {

	/** %[аргумент_индекс$][флаги][ширина][.точность]преобразование */

	private double total = 0;
	private Formatter f = new Formatter(System.out);

	public void printTitle(int n, int q, int p) {
//		f.format("%-20s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-"+ n + "s %" + q + "s %" + p + "s\n", "Item", "Qty", "Price");
//		f.format("%-20s %5s %10s\n", "----", "---", "-----");
		f.format("%s\n", "-------------------------------------");
	}

	public void print(String name, int qty, double price) {
		f.format("%-20s %5d %10.2f\n", name, qty, price);
		total+=price;
	}
	
	public void printTotal(int tax) {
		f.format("%-20s %5s %10.2f\n", "Tax", tax + "%", total*0.18);
		f.format("%s\n", "-------------------------------------");
		f.format("%-20s %5s %10.2f\n", "", "Total", total*1.18);
	}

	public static void main(String[] args) {
Receipt receipt = new Receipt();
receipt.printTitle(20,5,10);
receipt.print("Jack Daniels, 0.5l", 4, 4.25);
receipt.print("Chesterfield, pack", 1, 1.02);
receipt.print("Condoms Durex, bl.", 10, 2.53);
receipt.printTotal(18);
	}

}
