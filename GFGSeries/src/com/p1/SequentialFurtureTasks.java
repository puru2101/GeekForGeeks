package com.p1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SequentialFurtureTasks {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		Callable<Integer> task1 = () -> {
			Integer a = 1;
			Integer b = 2;
			return a + b;
		};
		
		
		Callable<Integer> task2 = () -> {
			Future<Integer> future = executorService.submit(task1);
			return future.get() * future.get();
		};
		
		
		Callable<Integer> task3 = () -> {
			Future<Integer> future2 = executorService.submit(task2);
			return future2.get() * future2.get() * future2.get();
		};
		
		
		Future<Integer> future3 = executorService.submit(task3);
		System.out.println(future3.get());

		executorService.shutdown();
	}

}
