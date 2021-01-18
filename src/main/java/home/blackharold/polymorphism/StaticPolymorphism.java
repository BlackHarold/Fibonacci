package home.blackharold.polymorphism;

public class StaticPolymorphism {

	public static void main(String[] args) {
//		StaticSuper ss = new StaticSuper(); // 	all StaticSuper
		StaticSuper ss = new StaticSub(); // 	static StaticSuper dynamic StaticSub
//		StaticSub ss = new StaticSub(); // 		all StaticSub
		
		System.out.println(ss.staticGet());
		System.out.println(ss.dynamicGet());

	}

}

class StaticSuper {
	static String staticGet() {
		return "static 	Базовая версия";
	}

	String dynamicGet() {
		return "dynamic Базовая версия";
	}
}

class StaticSub extends StaticSuper {
	
	static String staticGet() {
		return "static Производная версия";
	}

	String dynamicGet() {
		return "dynamic Производная версия";
	}
}
