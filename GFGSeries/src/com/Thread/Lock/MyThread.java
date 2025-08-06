package com.Thread.Lock;

public class MyThread {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		Runnable runnable = () -> {
			b1.withdraw(50);
		};

		Thread t1 = new Thread(runnable, "Thread 1");
		Thread t2 = new Thread(runnable, "Thread 2");
		Thread t3 = new Thread(runnable, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}

}
