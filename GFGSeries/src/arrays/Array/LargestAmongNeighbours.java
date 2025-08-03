package arrays.Array;

public class LargestAmongNeighbours {

	static int LargestAmongNighbours(int arr[]) {
		int max = 0;
		int temp = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				temp = arr[i];
				{
					if (temp > max) {
						max = temp;
					}
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {

		int ar[]= {1,4,2,3,9,10};
		int max=LargestAmongNighbours(ar);
		System.out.println(max);
	}

}
