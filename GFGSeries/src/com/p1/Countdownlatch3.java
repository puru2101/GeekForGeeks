package com.p1;

import java.util.concurrent.CountDownLatch;

public class Countdownlatch3 {
    public static void main(String[] args) throws InterruptedException {
        int numWorkers = 3;
        CountDownLatch latch = new CountDownLatch(4); // Initialize latch with 4
        
        // Create and start worker threads
        Worker1[] workers = new Worker1[numWorkers];
        Thread[] threads = new Thread[numWorkers];
        
        for (int i = 0; i < numWorkers; i++) {
            workers[i] = new Worker1(latch, "Worker-" + (i + 1));
            threads[i] = new Thread(workers[i]);
            threads[i].start();
        }
        
        // Main thread waits for all worker threads to finish
        latch.await(); // Main thread will wait until count reaches zero
        
        System.out.println("All worker threads have completed their tasks.");
    }
}

class Worker1 implements Runnable {
    private final CountDownLatch latch;
    private final String name;
    
    public Worker1(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }
    
    @Override
    public void run() {
        try {
            // Simulate some work
            Thread.sleep((long) (Math.random() * 3000));
            System.out.println(name + " has completed its task.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); // Signal completion to the latch
        }
    }
}

