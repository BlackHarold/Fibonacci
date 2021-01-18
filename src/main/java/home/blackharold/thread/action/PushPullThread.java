package home.blackharold.thread.action;

public class PushPullThread implements Runnable {

	private String text;
	private Action a;
	private boolean turn;

	public PushPullThread(String text, Action a, boolean turn) {
		super();
		this.text = text;
		this.a = a;
		this.turn = turn;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			a.getText(text, turn);
		}
	}

}
