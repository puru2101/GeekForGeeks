package com.p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
	int id;
	String name;

	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Snippet {
	public static void main(String[] args) {
		List<Employee1> ls = new ArrayList<>();
		ls.add(new Employee1(1, "Manoj"));
		ls.add(new Employee1(2, "Manoj1"));
		ls.add(new Employee1(3, "Manoj2"));
		ls.add(new Employee1(4, "Manoj4"));
		Map<Integer, String> map = ls.stream().collect(Collectors.toMap(Employee1::getId, Employee1::getName));
		System.out.println(map);
	}

	//Maximum consecutive one’s (or zeros) in a binary array
	

}
