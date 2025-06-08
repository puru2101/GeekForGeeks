package java_8_Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void evenOdd(List<Integer> numbers) {

		Map<Boolean, List<Integer>> nos = numbers.
				stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));

		System.out.println(nos.get(true));
		System.out.println(nos.get(false));

	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		evenOdd(numbers);
	}

}
