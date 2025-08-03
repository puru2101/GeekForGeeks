package com.p1;

public class MaxConsicutive1s {

	public static int find1s(int[] arr) {
		int count = 0;
		int check = 0;
		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 1) {
				count++;
				if (max == 0 || max < count)
					max = count;
			} else
				count = 0;
		}
		return max;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0 };
		int number = find1s(arr);
		System.out.println(number);
	}

}
