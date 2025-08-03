package com.p1;

import java.util.concurrent.CountDownLatch;

public class CountdownltachExmaple {
    public static void main(String[] args) throws InterruptedException {
      
        CountDownLatch latch = new CountDownLatch(2);
        
        // Create subsystems and start initialization threads
        SubsystemA subsystemA = new SubsystemA(latch);
        SubsystemB subsystemB = new SubsystemB(latch);
        SubsystemC subsystemC = new SubsystemC(latch);
        
        Thread threadA = new Thread(subsystemA);
        Thread threadB = new Thread(subsystemB);
        Thread threadC = new Thread(subsystemC);
        
        threadA.start();
        threadB.start();
        threadC.start();
        
        // Main thread waits for all subsystems to initialize
        
        latch.await();
        
        // All subsystems are ready, main thread can proceed
        System.out.println("All subsystems have initialized. System startup complete.");
    }
}

class SubsystemA implements Runnable {
    private final CountDownLatch latch;
    
    public SubsystemA(CountDownLatch latch) {
        this.latch = latch;
    }
    
    @Override
    public void run() {
        try {
            // Simulate initialization process for subsystem A
            Thread.sleep(2000); // Simulate initialization time
            System.out.println("Subsystem A initialized.");
            latch.countDown(); // Signal initialization completion
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SubsystemB implements Runnable {
    private final CountDownLatch latch;
    
    public SubsystemB(CountDownLatch latch) {
        this.latch = latch;
    }
    
    @Override
    public void run() {
        try {
            // Simulate initialization process for subsystem B
            Thread.sleep(3000); // Simulate initialization time
            System.out.println("Subsystem B initialized.");
            latch.countDown(); // Signal initialization completion
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SubsystemC implements Runnable {
    private final CountDownLatch latch;
    
    public SubsystemC(CountDownLatch latch) {
        this.latch = latch;
    }
    
    @Override
    public void run() {
        try {
            // Simulate initialization process for subsystem C
            Thread.sleep(1500); // Simulate initialization time
            System.out.println("Subsystem C initialized.");
            latch.countDown(); // Signal initialization completion
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

