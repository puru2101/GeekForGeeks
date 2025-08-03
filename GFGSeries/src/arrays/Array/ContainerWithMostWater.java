package arrays.Array;

public class ContainerWithMostWater {

	public static int trapWater(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int currheight = 0;
		int maximum_cap = 0;
		int width = 0;

		while (left < right) {
			currheight = Math.min(height[left], height[right]);
			width = right - left;
			int currMax = currheight * width;
			maximum_cap = Math.max(maximum_cap, currMax);
			if (height[left] < height[right]) {
				left++;
			} else
				right--;
		}

		return maximum_cap;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(trapWater(height));
	}

}
