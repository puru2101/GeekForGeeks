package com.p1.sorting.selectionSort;

public class SelectionSort {

	static void selectionSort(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					temp = arr[j];
					arr[j] = arr[min_index];
					arr[min_index] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int ar[] = { 3,2,5,1,4 };
		selectionSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
