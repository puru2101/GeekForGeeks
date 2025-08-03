package com.p1;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class NumberPrinter implements Runnable {
    private String threadName;
    private int start;
    private int step;
    private static int counter = 1;
    private CyclicBarrier barrier;

    public NumberPrinter(String threadName, int start, int step, CyclicBarrier barrier) {
        this.threadName = threadName;
        this.start = start;
        this.step = step;
        this.barrier = barrier;
    }

    public void run() {
        while (counter <= 10) {
            synchronized (NumberPrinter.class) {
                if (threadName.equals("t" + counter % 3)) {
                    System.out.println("Thread " + threadName + "\t" + counter++);
                }
            }
            try {
                barrier.await(); // Wait for other threads to reach the barrier
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Cyclicbarrier {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Thread t1 = new Thread(new NumberPrinter("t1", 1, 3, barrier));
        Thread t2 = new Thread(new NumberPrinter("t2", 2, 3, barrier));
        Thread t3 = new Thread(new NumberPrinter("t3", 3, 3, barrier));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
