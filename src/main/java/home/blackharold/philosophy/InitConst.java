package home.blackharold.philosophy;

public class InitConst {

	String str;
	int i;

	public static void main(String[] args) {
		InitConst ic = new InitConst();
		ic.info("строка", 1);
		ic.info(1, "строка");
//		System.out.println(new InitWithParam(null).str);
	}

	void info(String s, int i) {
		this.str = s;
		this.i = i;
		System.out.println(i + " " + str);
	}

	void info(int i, String s) {
		this.str = s;
		this.i = i;
		System.out.println(i + " " + str);
	}
}

class InitWithParam {

	String str;

	public InitWithParam(String str) {
		this.str = str;
	}
}
