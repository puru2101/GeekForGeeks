package arrays.ThreadPlaying;

public class SynchronizedExample extends Thread {
	public static void main(String[] args) {

		Counter counter = new Counter();
		Counter counter1 = new Counter();
		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
				
				 counter.increment2();
				 
			}
			System.out.println(counter.getCount());
			System.out.println(counter.getCount2());
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 1000; i++) {
				counter1.increment();
				
				 counter.increment2();
			}
			System.out.println(counter1.getCount());
			System.out.println(counter1.getCount2());


		};

		Thread t1 = new Thread(task);
		t1.start();
		Thread t2 = new Thread(task2);
		t2.start();

	

	}

}



