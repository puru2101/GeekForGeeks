package java_8_Streams.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Salaryless50k {

	public static void findemployee(List<Employee> emp) {
		emp.stream().filter(e->e.getSalary()<50000L).map(e->e.getEmployeeName()).forEach(e->System.out.println(e + ","));
	}

	public static void main(String[] args) {

		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Sahil", 50000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(2, "Puru", 100000L, new Date(2012, 01, 12), "Development"));
		listOfEmp.add(new Employee(3, "Sanjay", 60000L, new Date(2011, 01, 12), "HR"));
		listOfEmp.add(new Employee(4, "Prashoo", 90000L, new Date(2010, 01, 12), "Development"));
		listOfEmp.add(new Employee(5, "Himanshu", 40000L, new Date(2015, 01, 12), "Development"));
		listOfEmp.add(new Employee(6, "Ganesh", 30000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(7, "Rahul", 90000L, new Date(2020, 01, 12), "HR"));

		findemployee(listOfEmp);

	}

}
