package arrays.Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	static void removeDuplicates(int arr[]) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length - 1; i++) {
			set.add(arr[i]);
		}
		for (Integer number : set) {
			System.out.print(number + " ");
		}
	}

	static int removeDuplicates2(int arr[]) {

		int idx = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1]) {
				arr[idx] = arr[i];
				idx++;
			}

		}
		return idx;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 5 };
		int r = removeDuplicates2(arr);
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
