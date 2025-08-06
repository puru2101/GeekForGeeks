package com.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
	int balance = 100;
	private final Lock lock = new ReentrantLock();
	public synchronized void withdraw(Integer amount) {
		lock.lock();
		System.out.println("withdraw started by " + Thread.currentThread().getName() + " " + balance);
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		if (balance > 0) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient balance as " + Thread.currentThread().getName() + "attemeting but  "
		+ balance + "is less");
		}
		System.out.println("withdraw done by " + Thread.currentThread().getName() + " " + balance);
		lock.unlock();
	}
}
