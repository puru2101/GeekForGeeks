package com.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CountTripletsLessThenGivenSum {

	public static void findPairsWithSumGreaterThanTarget(int[] arr, int targetSum) {

		int left = 0;
		int right = arr.length - 1;
		List<String> list1 = new ArrayList<>();

		while (left < right) {
			if (arr[left] + arr[right] < targetSum) {
				for (int k = right; k > left; k--) {
					int sum = arr[k] + arr[left];
					list1.add(arr[left] + " " + arr[k] + " sum  " + sum);
				}
				right--;
			} else
				left++;
		}

		for (String s : list1) {
			System.out.println(s);
		}
	}

	public static void findPairsWithSumTarget(int[] arr, int targetSum) {

		int left = 0;
		int right = arr.length - 1;
		List<String> list1 = new ArrayList<>();

		while (left < right) {
			int sum = arr[right] + arr[left];
			if (arr[left] + arr[right] == targetSum) {

				list1.add(arr[left] + " " + arr[right] + " sum  " + sum);
				left++; 
				right--;
			} else if (sum > targetSum) {
				right--;
			} else {
				left++;
			}
		}

		for (String s : list1) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 7, 8 };
		int targetSum = 11;

		// findPairsWithSumGreaterThanTarget(arr, targetSum);

		findPairsWithSumTarget(arr, targetSum);

	}

}
