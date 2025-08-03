package com.p1.QuickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);  // Left of the pivot
            quickSort(arr, partitionIndex + 1, high); // Right of the pivot
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Choose the pivot (first element)
        int pivot = arr[low];
        int count = 0;
        
        // Count how many elements are smaller or equal to the pivot
        for (int j = low + 1; j <= high; j++) {
            if (arr[j] <= pivot) {
                count++;
            }
        }
        
        // Find the correct index for the pivot
        int pivotIndex = low + count;
        
        // Swap pivot with the element at pivotIndex
        swap(arr, pivotIndex, low);
        
        int i = low;
        int j = high;
        
        // Partitioning the array into two parts based on pivot
        while (i < pivotIndex && j > pivotIndex) {
            
            // Move i to the right while elements are smaller than or equal to pivot
            while (arr[i] <= pivot && i < pivotIndex) {
                i++;
            }
            
            // Move j to the left while elements are greater than pivot
            while (arr[j] > pivot&& j>pivotIndex) {
                j--;
            }
            
            // Swap if i < pivotIndex and j > pivotIndex
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        
        // Return the pivot index after partitioning
        return pivotIndex;
    }
    
    // Swap helper method to exchange two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        printArray(arr);

        // Sort the array using QuickSort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
