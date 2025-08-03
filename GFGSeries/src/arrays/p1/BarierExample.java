package arrays.p1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Test2 implements Runnable {

	private CyclicBarrier cyclicBarrier;

	public Test2(CyclicBarrier cyclicBarrier) {
		super();
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {

		
		try {
			System.out.println("TaskDone1");
			cyclicBarrier.await();

			System.out.println("TAskDonw2");
			cyclicBarrier.await();

			System.out.println("Task3DOne");
			cyclicBarrier.await();

		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}

public class BarierExample {

	public static void main(String[] args) {

		CyclicBarrier cb = new CyclicBarrier(4, 
				()->System.out.println("all done"));
		
	
		
		for (int i = 0; i < 4; i++) {
			Thread t1 = new Thread(new Test2(cb));
			t1.start();
		}
		
	}

}
