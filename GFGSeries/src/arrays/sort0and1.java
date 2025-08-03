package arrays;

import java.util.Iterator;

public class sort0and1 {

	static void swap(int[] arr) {
		int starting = 0;
		int ending = arr.length - 1;

		while (starting < ending) {
			if (arr[starting] != 0&&arr[ending]==0) {
				starting++;
			}
			if (arr[ending] == 2) {
				ending--;
			} else{
				int temp = arr[starting];
				arr[starting] = arr[ending];
				arr[ending] = temp;
				starting++;
				ending--;
			}
		}
	}
	public static void main(String[] args) {

		int arr[]= {0,1,0,1,1,2,1,0,2};
		swap(arr);
		for(int element:arr) {
			System.out.println(element);
		}
	}

}
