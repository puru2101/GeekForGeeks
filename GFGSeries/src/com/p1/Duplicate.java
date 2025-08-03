package com.p1;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate {

	public static void main(String[] args) {

		String s1= "Hi My name is puruuuuu";
		
		s1.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		     Optional<Entry<String, Long>> ls =  Arrays.stream(s1.replace(" ","").split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
	       
	        System.out.println(ls);
	        }
	          
	}


