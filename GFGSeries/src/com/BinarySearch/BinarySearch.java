package com.BinarySearch;

public class BinarySearch {

	public static int search(int[] arr, int k) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else if (arr[mid] < k) {
				start = mid + 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 7, 99, 201, 444, 555, 666, 2341 };
		System.out.println(search(arr, 23412));

	}

}
