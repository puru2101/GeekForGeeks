package arrays.Array;

import java.util.Arrays;

public class Move1sToEnd {

	public static void pointer(int[] arr) {
		// int first=0;
		int second = 0;

		for (int first = 0; first < arr.length; first++) {
			if (arr[first] == 0) {
				continue;
			} else {
				int temp = arr[second];
				arr[second] = arr[first];
				arr[first] = temp;
				second++;
			}
		}
		for (int ar : arr) {
			System.out.print(ar+",");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 1, 0, 2, 0, 3, 1 };
		pointer(arr);
	}

}
