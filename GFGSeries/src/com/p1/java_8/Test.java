package com.p1.java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Test {
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList( 3, 5, 67, 24, 5, 2, 9,2);
		arr.stream().sorted(Comparator.comparingInt()).distinct().filter(e -> e % 2 == 0).forEach(System.out::println);

		
		
		
		
	}

}
