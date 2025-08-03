package com.p1.sorting.insertionSort;

import java.util.stream.Stream;

//For small size array
//20,5,40,60,10,30
public class InsertionSort {
	static void insertion_Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		int ar[] = { 20, 5, 25, 30, 10, 15 };
		insertion_Sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
