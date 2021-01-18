package home.blackharold.type;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

	private static List<Class<? extends Pet>> types = new ArrayList<>();

	private static String[] typeNames = { "home.blackharold.type.Dog", "home.blackharold.type.Cat",
			"home.blackharold.type.Mouse", "home.blackharold.type.Manx" };

	private static void loader() {
		try {
			for (String name : typeNames) {
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	static {
		loader();
	}

	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}

}
