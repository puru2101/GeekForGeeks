package com.p1.Stream.AverageAge;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person{
	  String name;
	  int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  
  }

public class AverageAgeOfPerson {

	public static void main(String[] args) {

		List<Person> list= new ArrayList<>();
		list.add(new Person("Puru", 26) );
		list.add(new Person("Deepti", 23) );
		list.add(new Person("Ajay ", 24) );
		list.add(new Person("Rakesh", 26) );
		
		//list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().map(e->e.getValue()).collect(Collectors.averagingInt());
		OptionalDouble ageAverage=list.stream().mapToInt(Person::getAge).average();
		System.out.println(ageAverage.getAsDouble());
	}
	

}
