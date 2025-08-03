package com.p1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SequentialCenturyTasks {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//ExecutorService executorService = Executors.newFixedThreadPool(5);
		//ExecutorService executorService = Executors.newCachedThreadPool();
		ExecutorService executorService = Executors.newSingleThreadExecutor();


		
		Integer Counter = 1;
		
		while (Counter <= 10) {
			int batch = Counter;
			System.out.println("--------------------");
			System.out.println("Batch " + batch + " Started");
			Callable<String> tasks = () -> {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i + " Completed");
				}
				return "Batch " + batch + " completed";

			};

			Future<String> future = executorService.submit(tasks);
			System.out.println(future.get());
			Counter++;
		}
		
		executorService.shutdown();

	}

}
