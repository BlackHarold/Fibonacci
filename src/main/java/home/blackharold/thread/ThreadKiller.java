package home.blackharold.thread;

public class ThreadKiller implements Runnable {

	@Override
	public void run() {
		Thread t = new Thread(new ClockThread());
		t.start();

		int a = (int) (Math.random() * 10);

		for (; a != 5;) {
			System.out.println(a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a = (int) (Math.random() * 10);
		}

		t.interrupt();
		System.out.println("Killer thread stop is interrupt at a=" + a);
	}
}
