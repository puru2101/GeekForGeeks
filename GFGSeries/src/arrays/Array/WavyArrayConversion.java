package arrays.Array;

public class WavyArrayConversion {

	public static void wavyArrayConversion(int arr[]) {

		int start = 0;
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i] < arr[i + 1]) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
			} else
				start++;
		}
		for (int i : arr) {
			System.out.println(arr[i]+" ,");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 2, 4, 3, 1 };
		wavyArrayConversion(arr);

	}

}
