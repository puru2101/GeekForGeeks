package com.p1.sorting.Sort;

public class Seperate012 {

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	static void seperate012(int arr[]) {
		int start = 0, mid = 0, end = arr.length - 1, temp = 0;

		while (mid <= end) {
			if (arr[mid] == 0) {
				temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
			}
		}
	}

	static void seperate01(int arr[]) {
		int start = 0,  end = arr.length - 1, temp = 0;

		while (start<end) {
			if(arr[start]==0) {
				start++;
			}else {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				end--;
			}
		}
	}

	static void seperatepositiveandnegitives(int arr[]) {
		int start = 0, mid = 0, end = arr.length - 1, temp = 0;

		while (start <= end) {
			if (arr[start] < 0) {
                   start++;
			} else if (arr[end] >= 0) {
				end--;
			} else {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"");

		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 0, 1, 0, 1 };
		int arr1[] = { 0, 0, 1, 0, 1, 0 };
		int arr2[] = { -4, 10, -1, 5, -10, 6 };
//		seperate012(arr);
//		printArray(arr);
		seperate01(arr1);
	
		printArray(arr1);
//		System.out.println("--------");
//		seperatepositiveandnegitives(arr2);
//		printArray(arr2);

	}
}
