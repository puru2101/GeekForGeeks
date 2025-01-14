package arrays.MoveAll1sToEnd;

public class Test {

	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void moveAll1sToEnd(int arr[]) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;

		while (mid <= end) {
			if (arr[mid] == 0) {
				swap(arr, start, mid);
				start++;
				mid++;
			} else {
				swap(arr, mid, end);
				end--;
			}
		}
	}

	public static void moveAllnegativesToEnd(int arr[]) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;

		while (mid <= end) {
			if (arr[mid] < 0) {
				swap(arr, start, mid);
				start++;
				mid++;
			} else {
				swap(arr, mid, end);
				end--;
			}
		}
	}

	public static void moveAll1and2ToEnd(int arr[]) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;

		while (mid <= end) {
			if (arr[mid] == 0) {
				swap(arr, start, mid);
				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, end);
				end--;
			}
		}
	}

	static void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0 };
		int[] arr2 = { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 2, 2, 1, 0 };

		// int [] arr1= {-2,-6,-1,1,5,9,-9};
		moveAll1sToEnd(arr);
		moveAll1and2ToEnd(arr2);
		printArray(arr2);
		printArray(arr);
	}
}
