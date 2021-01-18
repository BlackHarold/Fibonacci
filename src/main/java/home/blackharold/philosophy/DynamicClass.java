package home.blackharold.philosophy;

public class DynamicClass {
public static void main(String[] args) {
	
	Other[] o = new Other[10];
	
	for (Other other : o) {
		System.out.println(other);
	}
	
	int i = 0;
	for (Other other : o) {
		String s = Integer.toString(i);
		other = new Other(s);
		i++;
	}
	
}
}



class Other{
	public Other(String s) {
		System.out.println("Other " + s);
	}
}


