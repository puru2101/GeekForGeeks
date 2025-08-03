package com.BinarySearch;

public class SquareRoot {

	public static int sqtrt(int k) {
		int start = 1;
		int end = k;

		int mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;
			if (mid * mid == k) {
				return mid;
			} else if (mid * mid > k) {
				end = mid - 1;
			} else
				start = mid + 1;

		}

		if ((mid * mid) - k == 0) {
			return mid;
		} else {
			return mid - 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(sqtrt(11));
	}

}
