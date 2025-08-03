package com.p1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Pool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorFramework = Executors.newFixedThreadPool(5);

		Callable<String> tasks = new Callable<String>() {
			@Override
			public String call() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + " Tasks - " + i);
				}
				return "Task 1";
			};
		};

		Future <String> future=executorFramework.submit(tasks);
 
		System.out.println(future.get());
		executorFramework.shutdown();
		
		
		
		
		
	}
}
