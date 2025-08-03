package arrays.Array;

public class WavyArray {

	static void wavyArray(int arr[]) {

		int n = arr.length;
		boolean wavy = false;

		for (int i = 0; i < n - 1; i++) {
			if (i % 2 == 0 && arr[i] < arr[i + 1]) {
				wavy = true;
			}
			if (i % 2 != 0 && arr[i] > arr[i + 1]) {
				wavy = true;
			}
		}
		if (wavy)
			System.out.println("Array is not wavy");
		else
			System.out.println("Array is wavy");

	}

	public static void main(String[] args) {
		int ar[] = { 1, 4, 2, 3, 9, 10 };
		int arr2[]= {2,1,4,3,8,7};
		//wavyArray(ar);
		wavyArray(arr2);
	}

}
