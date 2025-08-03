package com.p1.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestString {

	public static void main(String[] args) {
		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
		
		System.out.println(	strings.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get());
		strings.stream().sorted(Comparator.comparing(String::length)).findFirst().get();
	//	limit(1).forEach(e->System.out.println(e));
		
		//Optional<String> laregestString=strings.stream().min(Comparator.comparing(String::length));
		
		System.out.println(strings);
	}

}
