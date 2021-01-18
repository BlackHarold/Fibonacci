package home.blackharold.thread.action;

public class Main {

	public static void main(String[] args) {

		Action action = new Action();

		PushPullThread ppt1 = new PushPullThread("Push", action, true);
		PushPullThread ppt2 = new PushPullThread("Pull", action, false);

		Thread t1 = new Thread(ppt1);
		Thread t2 = new Thread(ppt2);

		t1.start();
		t2.start();

	}

}
