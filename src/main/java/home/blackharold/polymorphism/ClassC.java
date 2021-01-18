package home.blackharold.polymorphism;

public class ClassC extends B {
	public ClassC() {
		super(5);
		System.out.println("Конструктор по умолчанию С");
	}

	public static void main(String[] args) {
		new ClassC();
		new B(10);
//		A a = new C();
//		B b = new C();
	}
}

class B extends A {
	public B(int i) {
		super(i);
		System.out.println("Конструктор по умолчанию В");
	}
}

class A {
	public A(int i) {
		System.out.println("Конструктор по умолчанию А" + i);
	}
}