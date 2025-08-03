package com.BinarySearch;

public class FirstAndLastOccu {

	public static void lastSearch(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		int last = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				last = mid;
				start = mid + 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else if (arr[mid] < k) {
				start = mid + 1;
			}

		}

		System.out.println(last);

	}

	public static void firstSearch(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		int first = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				first = mid;
				end = mid - 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else if (arr[mid] < k) {
				start = mid + 1;
			}

		}

		System.out.println(first);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 4, 4, 4, 4, 4, 7, 8, 9, 10 };
		firstSearch(arr, 4);
		lastSearch(arr, 4);
	}

}
