package com.p1;

public class SqtRoot {

	static float sqrroot(int number) {

		long start = 0;
		long end = number;
		// int mid=start+(end-start)/2;
		long ans = 0;

		long mid = start + (end - start) / 2;
		while (start <= end) {
			if ((mid * mid) == number) {
				return mid;
			} else if (mid * mid < number) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
//
//		float number1 = number - ans*ans;
	float finalsqt = 0;
//         float build=0;
//		for (float f = 0.1f; f*f <= number1; f=f + 0.1f) {
//			build=f;
//		}
//		
//		return ans+build;
		float sq=ans*ans;
	
		for(float sq1=sq;sq<=number;sq=sq+0.1f) {
			finalsqt= sq1;
		}
		return finalsqt;
	}

	public static void main(String[] args) {
		int number = 38;
		float sqrrootnumber = sqrroot(number);
		System.out.println(sqrrootnumber);
	}

}
