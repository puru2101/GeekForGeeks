package com.threads;

import java.util.concurrent.CountDownLatch;

public class CountdownLatch extends Thread {
	private CountDownLatch latch;

	public CountdownLatch(CountDownLatch countDownLatch) {
		this.latch = countDownLatch;
	}

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);
//		Thread t1 = new Thread(new CountdownLatch(latch));
		CountdownLatch cd= new CountdownLatch(latch);
		cd.start();
		
		
//		t1.start();
	
		latch.await();
		System.out.println("maain end");
	}
@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("start");
		latch.countDown();
		System.out.println("mid");
		latch.countDown();
		System.out.println("end");
		
		latch.countDown();
	}

}
