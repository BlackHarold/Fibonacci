package home.blackharold.map;

import java.util.Map;

public class EnvironmentVartiables {

	public static void main(String[] args) {
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
	}
}