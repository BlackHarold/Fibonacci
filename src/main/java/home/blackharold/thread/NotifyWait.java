package home.blackharold.thread;

import java.util.Scanner;

public class NotifyWait {

    public static void main(String[] args) {
        WaitAndNotify wan = new WaitAndNotify();

        Thread th1 = new Thread(() -> wan.produce());
        Thread th2 = new Thread(() -> wan.consume());

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WaitAndNotify {

    public void produce() {
        synchronized (this) {
            System.out.println("Producer thread started...");
            try {
                wait(); // 1 - intrinsic lock, 2 - wait when notify() calling.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();

            notify();
//			notifyAll();
            scanner.close();
        }
    }
}
