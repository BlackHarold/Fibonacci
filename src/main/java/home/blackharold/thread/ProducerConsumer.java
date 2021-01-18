package home.blackharold.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		ProduceAndConsume pc = new ProduceAndConsume();

		Thread th1 = new Thread(() -> pc.produce());
		Thread th2 = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		th1.start();
		th2.start();

		th1.join();
		th2.join();
	}
}

class ProduceAndConsume {
	private Queue<Integer> queue = new LinkedList<>();
	private final int LIMIT = 10;
	private final Object lock = new Object();

	public void produce() {
		int value = 0;

		while (true) {
			synchronized (lock) {
				while (queue.size() == LIMIT) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				lock.notify();
				queue.offer(value++);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (lock) {
				Thread.sleep(2000);
				while (queue.size() == 0) {
					lock.wait();
				}
				int value = queue.poll();
				System.out.println(value);
				System.out.println("queue size is " + queue.size());
				lock.notify();
			}
		}
	}
}
