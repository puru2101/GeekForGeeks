package java_8_Streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatingCharatcer {

	public static void charac(String str) {
		System.out.println(str.replace(" ", "").chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() < 2).findFirst());

	}

	public static void main(String[] args) {
		String str = "PorusParty";
		charac(str);
	}

}
