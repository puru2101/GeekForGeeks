package arrays.StockBuyAndSell;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void maximumProfit(int arr[]) {
		int min = arr[0];
		int maxProfit = 0;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			} else if (min != 0) {
				int profit = arr[i] - min;
				if (maxProfit < profit)
					maxProfit = profit;
			}
		}
		System.out.println(maxProfit);
	}

	
	public static void main(String[] args) {

		int arr[] = { 7, 1, 5, 3, 6, 4 };
		maximumProfit(arr);
	}

}
