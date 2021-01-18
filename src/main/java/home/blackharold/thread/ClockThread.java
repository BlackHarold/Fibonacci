package home.blackharold.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread implements Runnable {

    private SimpleDateFormat sdf;

    public ClockThread() {
        super();
        sdf = new SimpleDateFormat("HH:mm:ss");
    }

    public ClockThread(String format) {
        super();
        sdf = new SimpleDateFormat(format);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (; !t.isInterrupted(); ) {
            System.out.println(sdf.format(new Date()));
            try {
                t.sleep(250);
            } catch (InterruptedException e) {
                break;
            }

        }

        System.out.println("Clock Thread is stopped!");

    }

}
