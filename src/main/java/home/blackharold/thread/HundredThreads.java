package home.blackharold.thread;

public class HundredThreads {

    public HundredThreads(int nOfThreads) {
        super();
        Thread[] ths = new Thread[nOfThreads + 1];

        for (int i = 1; i < ths.length; i++) {

            ths[i] = new Thread(new FactorialThread(i), "" + i);
        }

        for (int i = 1; i < ths.length; i++) {
            ths[i].start();
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
        }
    }

    public static void main(String[] args) {
        new HundredThreads(100);
//		System.out.println(Thread.currentThread().getName() + " stopped");
    }
}
