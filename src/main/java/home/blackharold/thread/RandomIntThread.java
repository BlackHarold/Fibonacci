package home.blackharold.thread;

import java.util.Random;

public class RandomIntThread {

	public static void main(String[] args) {
		Action action = new Action();
		Reciever reciever = new Reciever(action);
		Provider provider = new Provider(action);

		Thread t1 = new Thread(reciever);
		Thread t2 = new Thread(provider);

		t1.start();
		t2.start();
	}

}

class Action {
	private int value;

	private boolean turn;
	private boolean stop;

	public Action() {
		super();
	}

	public synchronized int getValue() {
		while (!turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println("Ошибка getValue");
			}
		}
		int temp = this.value;
		notifyAll();
		System.out.println("get value -----> " + this.value);
		turn = false;
		return temp;
	}

	public synchronized void setValue(int value) {
		while (turn) {
			try {
				wait();

			} catch (InterruptedException e) {
				System.err.println("Ошибка setValue");
			}
		}
		this.value = value;
		turn = true;
		System.out.println("set value -> " + this.value);
		notifyAll();
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

class Reciever implements Runnable {
	Action action;

	public Reciever(Action action) {
		super();
		this.action = action;
	}

	@Override
	public void run() {
		for (; !action.isStop();) {
			action.getValue();
		}
	}
}

class Provider implements Runnable {
	Action action;
	Random random = new Random();
	int randomCount;

	public Provider(Action action) {
		super();
		this.action = action;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			randomCount = random.nextInt(100);
			// System.out.println(i + " count " + randomCount);
			action.setValue(randomCount);
		}
		action.setStop(true);
	}

}
