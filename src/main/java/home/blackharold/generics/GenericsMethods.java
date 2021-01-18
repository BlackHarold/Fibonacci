package home.blackharold.generics;

public class GenericsMethods {

	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		GenericsMethods gm = new GenericsMethods();

		gm.f("");
		gm.f(1);
		gm.f(1f);
		gm.f(1.0);
		gm.f('a');
		gm.f(gm);

	}

}

// java.lang.String
// java.lang.Integer
// java.lang.Float
// java.lang.Double
// java.lang.Character
// GenericsMethods
