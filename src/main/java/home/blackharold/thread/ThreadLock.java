package home.blackharold.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ThreadLock {
	public static void main(String[] args) throws InterruptedException {
		new SubClass().startWork();
	}
	
}

class SubClass{

	Random random = new Random();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();

	Object lock1 = new Object();
	Object lock2 = new Object();

	Thread t1 = new Thread(() -> work());
	Thread t2 = new Thread(() -> work());

	public void startWork() throws InterruptedException {
		long before = System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("List1 " + list1.size());
		System.out.println("List2 " + list2.size());
		long after = System.currentTimeMillis();
		System.out.printf("Time to go : %d ms", after - before);
	}

	private void work() {
		for (int i = 0; i < 1000000; i++) {
			addToList1();
			addToList2();
		}

		
	}

	private void addToList1() {
		 synchronized (lock1) {
		list1.add(random.nextInt(100));
		 }
	}
	
	private void addToList2() {
		 synchronized (lock2) {
		list2.add(random.nextInt(100));
		 }
	}
}
