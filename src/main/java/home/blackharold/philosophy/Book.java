package home.blackharold.philosophy;

class Book {

	boolean checkOut = false;

	Book(boolean checkOut) {
		super();
		this.checkOut = checkOut;
	}

	void checkIn() {
		checkOut = false;
	}

	protected void finalize() {
		if(checkOut)System.out.println("error");
	}
	
	void printInfo() {
		System.out.println("I'm alive!");
	}

	public static class TerminationCOndition {
		public static void main(String[] args) {
			Book novel = new Book(true);
			
			novel.checkIn();
			new Book(true);
			System.out.println("Первый запуск сборщика мусора: ");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			System.out.println("Повторный запуск сборщика мусора");
			System.gc();
			novel.printInfo();
		}
	}
}