package arrays.Array;

public class StockBuyAndSell {

	public static int stockBuySell(int[] arr) {
		int n = arr.length;
		int maxProfit = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			if (min == 0 || arr[i] < min) {
				min = arr[i];
			}
			for (int j = 0; j < n; j++) {
				if (maxProfit == 0 || maxProfit < arr[j] - min) 
					maxProfit = arr[j] - min;
			}
		}
		return maxProfit;

	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 4, 54, 9, 12,15,14,56,94 };
		System.out.println(stockBuySell(ar));

	}

}
