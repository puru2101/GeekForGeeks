package java_8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class startsWithA {

	public static void startsWithA(List<String> string) {
		Map<Boolean, List<String>> partition = string.stream()
				.collect(Collectors.partitioningBy(e -> e.startsWith("a")));
		System.out.println(partition.get(true));
		System.out.println(partition.get(false));

	}

	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry");
         startsWithA(words);
	}

}
