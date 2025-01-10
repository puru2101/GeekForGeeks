package arrays.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void twoSum(int[] arr, int targetSum) {
		int start = 0;
		int end = arr.length - 1;
		boolean sumPresent = false;
		Arrays.sort(arr);

		while (start < end) {
			if (arr[start] + arr[end] == targetSum) {
				System.out.print("{" + arr[start] + "," + arr[end] + "}");
				start++;
				end--;
				sumPresent = true;
			} else if (arr[start] + arr[end] > targetSum) {
				end--;
			} else {
				start++;
			}
		}
		if (!sumPresent)
			System.out.println("No Pair Found");
	}

	public static void addtwosum(int arr[], int targetSum) {
		boolean sumPresent = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == targetSum && arr[i] != arr[j]) {
					System.out.print("{" + arr[i] + "," + arr[j] + "}");
					sumPresent = true;
				}
			}
		}
		if (!sumPresent)
			System.out.println("No Pair Found");
	}

	public static void twoSumHashing(int arr[], int targetSum) {
		Map<Integer, Integer> map = new HashMap<>();
		int complement = 0;
		boolean sumPresent = false;

		for (int num : arr) {
			complement = targetSum - num;

			if (map.containsKey(complement)) {
				System.out.print("{" + complement + "," + num + "}");
				sumPresent = true;
			}
			map.put(num, 1);

		}

		if (!sumPresent)
			System.out.println("No Pair Found");
	}

	public static void main(String[] args) {

		int[] arr = { 1, 6, 5, 4, 3 };
		addtwosum(arr, 10);
		System.out.println();
		twoSum(arr, 10);
		System.out.println();
		twoSumHashing(arr, 10);
	}

}
