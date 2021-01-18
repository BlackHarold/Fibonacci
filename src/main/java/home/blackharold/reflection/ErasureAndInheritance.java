package home.blackharold.reflection;

public class ErasureAndInheritance {

	public static void main(String[] args) {
		Derived2 derived2 = new Derived2();
		Object obj = derived2.getElement();
		derived2.setElement(obj);
		
		
		Derived1 d1 = new Derived1();
		Object obj1 = d1.getElement();
		d1.setElement(obj1);
	}
}

class GenericBase<T> {
	private T element;

	void setElement(T arg) {
		arg = element;
	}

	public T getElement() {
		return element;
	}
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2<T> extends GenericBase {
}

//Ошибка наследования
//class Derived3<T> extends GenericBase<?> {
//}
