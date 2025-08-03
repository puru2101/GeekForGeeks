package com.p1;

public class Pivot {

	static int pivot(int a[]) {
		int start = 0;
		int end = a.length - 1;
		int mid = start + (end - start) / 2;
		while (start < end) {
			if (a[mid] >= a[0]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			mid = start + (end - start) / 2;
		}
		return start;
	}

	static int binarysearch(int a[], int key, int start, int end) {
		int mid = start + (end - start) / 2;
		while (start <= end) {
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return start;
	}

	static int findinsortedarray(int a[], int key, int pivot) {
		int start = 0;
		int end = a.length - 1;
		int index = 0;
		if (a[pivot] <= key && key <= a[end]) {
			index = binarysearch(a, key, pivot + 1, end);
		} else {
			index = binarysearch(a, key, start, pivot - 1);
		}
		return index;
	}

	public static void main(String[] args) {
		int key = 4;
		int a[] = { 3, 4, 5, 6, 7, 1, 2 };
		int pivotelement = pivot(a);
		int element = findinsortedarray(a, key, pivotelement);
		System.out.println(element);
	}
}
