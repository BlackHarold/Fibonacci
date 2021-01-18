package home.blackharold.access;

public class Chess extends BoardGame {

	Chess() {
		super(1);
		System.out.println("Chess construct");
	}

	public static void main(String[] args) {
		new Chess();
	}
}

class Game {
	public Game() {
	System.out.println("Game construct");
	}
}

class BoardGame extends Game {

	BoardGame(int i) {
		System.out.println("BoardGame construct");
	}
}
