package com.p1.sorting.bubbleSort;

public class BubbleSort {

	
	static void bubbleSort(int[] arr) {
		boolean swap=false;
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swap=true;
						
					}
				}
			if(!swap) {
				break;
			}
			}
		
		}
		
	
	
	public static void BubbleSort(int arr[]) {
		boolean swap=false;
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length - i-1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}

	public final static void main(String[] args) {
		int ar[] = { 2, 5, 7, 3, 78, 9 };
		BubbleSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
