package java_8_Streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

	public static void frequency(String str) {
		str.replace(" ", "").chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting())).entrySet().stream()
				.forEach(System.out::println);
	}

	public static void main(String[] args) {
		String str = "PorusPartyy";
		frequency(str);
		;
	}

}
