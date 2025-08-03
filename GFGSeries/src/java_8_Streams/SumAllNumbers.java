package java_8_Streams;

import java.util.List;
import java.util.stream.IntStream;

public class SumAllNumbers {

	public static void sumList(List<Integer> numbers) {

		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println(IntStream.rangeClosed(0,45).average().getAsDouble());
		
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		sumList(numbers);	}

}
