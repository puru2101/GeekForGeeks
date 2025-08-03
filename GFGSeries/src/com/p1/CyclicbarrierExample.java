package com.p1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class hello implements Runnable {

	@Override
	public void run() {
		System.out.println("All players are ready. Starting the game...");

	}

}

public class CyclicbarrierExample {
	public static void main(String[] args) {
		int numPlayers = 4;
		Runnable h1 = new hello();

		CyclicBarrier barrier = new CyclicBarrier(numPlayers, h1);
		Player p1 = new Player(barrier, "Plyaer 1");
		Player p2 = new Player(barrier, "Plyaer 2");
		Player p3 = new Player(barrier, "Plyaer 3");
		Player p4 = new Player(barrier, "Plyaer 4");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(p4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

//      CyclicBarrier barrier = new CyclicBarrier(numPlayers, () -> {
//      System.out.println("All players are ready. Starting the game...");
//  });
//
//  for (int i = 0; i < numPlayers; i++) {
//      Thread playerThread = new Thread(new Player(barrier, "Player-" + (i)));
//      playerThread.start();
//  }
	}
}

class Player implements Runnable {
	private final CyclicBarrier barrier;
	private final String name;

	public Player(CyclicBarrier barrier, String name) {
		this.barrier = barrier;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			int i = 0;

			System.out.println(name + " is ready");
			barrier.await(); // Wait at the barrier

			// Simulate playing the game
			System.out.println(name + " is playing");
			barrier.await();

			// After playing, wait at the barrier for the next round

			System.out.println(name + " finished the round");
			barrier.await();

		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
