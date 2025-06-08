package java_8_Streams;

import java.util.Comparator;
import java.util.List;

public class sorting {

	public static void ascenSorting(List<Integer> numbers) {
		numbers.stream().sorted().forEach(System.out::print);
		System.out.println();

	}

	public static void descenSorting(List<Integer> numbers) {
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		;
	}

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 3, 2, 4, 7, 5, 6, 8, 9, 10);

		ascenSorting(numbers);
		System.out.println("------------------------");
		descenSorting(numbers);

	}

}
