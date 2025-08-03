package com.p1;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        int numWorkers = 3;
        CountDownLatch latch = new CountDownLatch(6);
        
        // Create and start worker threads
        for (int i = 0; i < numWorkers; i++) {
            Thread worker = new Thread(new Worker(i, latch));
            worker.start();
            System.out.println(worker.getThreadGroup().getName()+" "+i);
        }
        
        // Main thread waits for all workers to finish
        latch.await();
        
        System.out.println("All workers have completed. Main thread continues.");
    }
}

class Worker implements Runnable {
    private final int id;
    private final CountDownLatch latch;
    
    public Worker(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }
    
    @Override
    public void run() {
        System.out.println("Worker " + id + " is doing some work...");
        latch.countDown();
        try {
            Thread.sleep(2000); // Simulating work with sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        System.out.println("Worker " + id + " has completed its work.");
        latch.countDown();// Decrease the latch count
        
    }
}
