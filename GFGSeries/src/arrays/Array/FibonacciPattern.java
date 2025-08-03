package arrays.Array;

public class FibonacciPattern {

	static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		return fibonacci(n) + fibonacci(n - 1);

	}

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("1 ");
			}
			System.out.print("");
			
		
		}

	}

}
