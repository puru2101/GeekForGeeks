package arrays.Stream.isPrime;

public class MaxSumSubArray {

	
	
	static int maxSumArray(int[] ar) {

		int maxSum = 0;
		int temp = 0;
		int pointer = 0;
		int sum = 0;
		while (pointer < ar.length - 1) {
			for (int i = pointer; i < ar.length - 1; i++) {
				temp = ar[i] + ar[i + 1];
				if (sum < temp) {
					sum = temp;
				}
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
			temp =0;
			sum = 0;
			pointer++;
		}
		return maxSum;

	}
	
	public static void main(String[] args) {
		int[] ar= {1,4,2,5,6,4,2,-1,4,-8};
		int maxSum=maxSumArray(ar);
		System.out.println(maxSum);
	}

}
