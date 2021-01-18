package home.blackharold.thread.action;

public class Action {
	private boolean turn;

	public Action(boolean turn) {
		super();
		this.turn = turn;
	}

	public Action() {
		super();
	}

	public synchronized void getText(String text, boolean turn) {
		if (this.turn==turn) {
			try {
				wait();
			}catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println(text + " ");
		this.turn=!this.turn;
		notifyAll();
	}

}
