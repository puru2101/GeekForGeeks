package com.practice;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Gaurav Sharma";
        s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
        entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
        
		
		
		
	}

}
