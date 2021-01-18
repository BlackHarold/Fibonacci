package home.blackharold.interfaces;

public class Factories {

	public static void serviceConsumer(ServiceFactory sf) {
		Service s = sf.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new ImplementationFactory1());
		serviceConsumer(new ImplementationFactory2());
	}
}

interface ServiceFactory {
	Service getService();
}

interface Service {
	void method1();

	void method2();
}

class Implementation1 implements Service {

	@Override
	public void method1() {
		System.out.println("Impl_1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Impl_1 method2");
	}
}

class ImplementationFactory1 implements ServiceFactory {
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {

	@Override
	public void method1() {
		System.out.println("Impl_2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Impl_2 method2");
	}
}

class ImplementationFactory2 implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}
