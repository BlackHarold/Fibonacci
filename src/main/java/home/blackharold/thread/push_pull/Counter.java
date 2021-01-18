package home.blackharold.thread.push_pull;

public class Counter {
	private static int count;

	boolean turn, stop;

	public int getCount() {
		return count;
	}

	public synchronized int setCount() {

		for (; turn == true;) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.print("getCounter error");
			}
		}
		turn = true;
		notifyAll();
		System.out.print("push ");
		return count++;
	}

	public synchronized void setFlag() {

		for (; turn == false;) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.print("getCounter error");
			}
		}
		turn = false;
		System.out.print("pull ");
		notifyAll();
	}

	void setStop() {
		stop = true;
	}

	public boolean isStop() {
		return stop;
	}

}
