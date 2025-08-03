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

	public static void moores(int[] arr) {
		int key = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(key==arr[i]) {
				count
				
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
		maxConsicutiveOnes(arr);
	}

}
