package home.blackharold.thread;

import java.math.BigInteger;

public class FactorialThread implements Runnable {

    private int number;

    public FactorialThread(int n) {
        super();
        number = n;
    }

    @Override
    public void run() {
        Thread t = new Thread().currentThread();
        System.out.println(t.getName() + " factorial " + number + "!= " + calculateFactorial(number));
    }

    public int getNumber() {
        return number;
    }

    private BigInteger calculateFactorial(int number) {
        BigInteger fact = new BigInteger("1");

        for (int i = 2; i <= number; i += 1) {
            fact = fact.multiply(new BigInteger("" + i));
//			System.out.println(Thread.currentThread().getName() +" " + fact);
        }
        return fact;
    }

}
