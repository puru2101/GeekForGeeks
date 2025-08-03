package arrays.Stream.isPrime;

public class BuyAndSell {

	static int buyAndSell(int[] ar) {

		int maxPrice = 0;
		int minPrice = ar[0];
		int pointer = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < ar[i - 1] && minPrice > ar[i]) {
				minPrice = ar[i];
				pointer = i;
			}
			if (minPrice == ar[ar.length - 1]) {
				return 0;
			}
		}
		for (int j = pointer; j < ar.length - 1; j++) {
			if (ar[j] < ar[j + 1] && maxPrice < ar[j + 1]) {
				maxPrice = ar[j + 1];
			}
		}
		return maxPrice - minPrice;
	}
	public static void main(String[] args) {

		int[] ar = { 2, 4, 3, 8, 1, 10 };
		int a = buyAndSell(ar);
		System.out.println(a);

	}

}
