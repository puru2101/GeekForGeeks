package com.BinarySearch;

public class PeakElement {

	public static int peakFinder(int[] arr) {
		int n = arr.length;
		if (arr.length == 1) {
			return arr[0];
		}
		if (arr[0] > arr[1])
			return arr[0];

		if (arr[n - 1] > arr[n - 2])
			return arr[n - 1];

		int start = 1;
		int end = n - 2;
		int mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return mid;
			} else if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else
				end = mid - 1;
		}

		return -1;

	}

	public static void main(String[] args) {
         
		int arr[]= {9,2,4,5,7,8,3};
		System.out.println(peakFinder(arr));
		
		
	}

}
