package home.blackharold.thread;

import java.io.File;

public class Main {
    public static void main(String[] args) {

//		Thread t1 = new Thread(new FactorialThread(2000));
//		Thread t2 = new Thread(new FactorialThread(2000));
//		Thread t3 = new Thread(new FactorialThread(2000));
//		t1.start();
//		t2.start();
//		t3.start();
//		System.out.println("main stop");

//		Thread t = new Thread(new ThreadKiller());
//		t.start();

        File folder = new File(".");
        Thread t = new Thread(new FileWatcher(folder));
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();

    }
}
