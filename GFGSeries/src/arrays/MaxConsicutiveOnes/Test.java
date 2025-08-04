package arrays.MaxConsicutiveOnes;

public class Test {

	public static void maxConsicutiveOnes(int arr[]) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if (count > maxCount) {
					maxCount = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);
	}

	public static int moores(int[] arr) {
		int key = arr[0];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(key==arr[i]) {
				count++;
			}else {
				count--;
			}	
			if(count<1) {
				key=arr[i];
				count++;
			}
		}
		return key;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1,2,2,2,2,2,2,2,2,2,2,2,2,2,2 };
		//maxConsicutiveOnes(arr);
		System.out.println(moores(arr));
	}
	

}
