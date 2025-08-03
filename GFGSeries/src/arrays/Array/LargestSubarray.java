package arrays.Array;

public class LargestSubarray {

	public static void subArray(int[] arr) {
		int first = 0;
		int start=0;
		 int end=0;
		int currSum = 0;
		int maxSum = 0;
		for (int second = 0; second < arr.length; second++) {
			currSum += arr[second];
			if (currSum > maxSum) {
				maxSum = currSum;
				first=start;
				end=second;
			}if(currSum<0) {
				start=second+1;
				currSum=0;
			}
			
		}
		System.out.println(maxSum);
		for(int i=first;i<=end;i++) {
			System.out.print(arr[i]+", ");
		}
	}

	public static void main(String[] args) {
	int[] arr = { -2, 5, -1, 2, 3, -2, -100 };
;

		subArray(arr);
	}

}
