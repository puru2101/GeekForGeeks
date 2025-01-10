package arrays.TwoSum;

import java.util.Arrays;

public class Test {

	public static void twoSum(int[] arr, int targetSum) {
		int start = 0;
		int end = arr.length - 1;
        boolean sumPresent=false;
		Arrays.sort(arr);

		
		while (start < end) {
			if (arr[start] + arr[end] == targetSum) {
				System.out.print("{" + arr[start] + "," + arr[end] + "}");
				start++;
				end--;
				sumPresent=true;
			} else if (arr[start] + arr[end] > targetSum) {
				end--;
			} else {
				start++;
			}
		}
		if(!sumPresent)
			System.out.println("No Pair Found");
	}

	public static void main(String[] args) {

		int[] arr= {1,6,5,4,3};
		twoSum(arr, 15);
	}

}
