package com.p1;

import java.util.*;

class Employee {
	
	 private String name;
	    private int age;

	    public Employee(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
}



public class Comparator_Example  {

	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("gob", 25));
        employees.add(new Employee("pharlie", 35));
        employees.add(new Employee("elice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("mharlie", 35));
        // Sort employees based on their ages
        //employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
    
        employees.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1,Employee e2) {	
				return e2.getName().compareTo(e1.getName());
			}
		});
        
        employees.stream().forEach(System.out::println);
    }

	

	}


