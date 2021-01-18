package home.blackharold.generics;

public class Heroes {
	private static int count = 0;
	private int id = count++;

	@Override
	public String toString() {
		return id + " " + getClass().getSimpleName();
	}
}



class Positive extends Heroes{
	
}

class Negative extends Heroes{
	
}
