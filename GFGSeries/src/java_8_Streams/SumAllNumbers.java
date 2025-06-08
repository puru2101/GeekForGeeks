package java_8_Streams;

import java.util.List;

public class SumAllNumbers {

	public static void sumList(List<Integer> numbers) {

		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		sumList(numbers);	}

}
