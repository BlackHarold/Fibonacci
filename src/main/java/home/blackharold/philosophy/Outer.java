package home.blackharold.philosophy;

public class Outer {

	void createInstance() {
		InnerClass iClass = new InnerClass(9);
	}

	public static void main(String[] args) {

		new Outer().createInstance();
		
//		Создание экземпляра класса только через нестатический метод, либо через instance внешнего класса
//		InnerClass ic = new Outer().new InnerClass(1);
	}

	class InnerClass {
		public InnerClass(int i) {
			System.out.println("Привет из недр!" + 1);
		}
	}
}
