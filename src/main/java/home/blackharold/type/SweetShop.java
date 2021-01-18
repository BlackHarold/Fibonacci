package home.blackharold.type;

public class SweetShop {

	public static void main(String[] args) {

		new Candy();
		
		try {
			Class.forName("home.blackharold.type.Gum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new Cookie();
	}
}

class Candy {
	static {
		System.out.println(Candy.class.getSimpleName());
	}
}

class Cookie {
	static {
		System.out.println(Cookie.class.getSimpleName());
	}
}

class Gum {
	static {
		System.out.println(Gum.class.getSimpleName());
	}
}