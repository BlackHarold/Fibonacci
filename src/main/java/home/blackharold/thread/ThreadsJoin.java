package home.blackharold.thread;

public class ThreadsJoin {

	private int count;

	public static void main(String[] args) {
		ThreadsJoin tj = new ThreadsJoin();

		try {
			tj.doWork();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void doWork() throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++)
				countPlus();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++)
				countPlus();
		});

			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println(count);
	}
	
	private void countPlus() {
		synchronized (this) {
			count++;			
		}
	}
}
