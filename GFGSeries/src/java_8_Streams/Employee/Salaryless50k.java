package java_8_Streams.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Salaryless50k {

	public static void findemployee(List<Employee> emp) {
		emp.stream().filter(e->e.getSalary()<50000L).map(e->e.getEmployeeName()).forEach(e->System.out.println(e + ","));
	}

	public static void highestSalary(List<Employee> emp) {
		System.out.println(emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(e->e.getEmployeeName()).findFirst().get());

		
		//emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
		
	}
	
	
	
	public static void main(String[] args) {
		
	//	List<String> lst = List.of("Ansh,");
		
		
		
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Sahil", 50000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(2, "Puru", 100000L, new Date(2012, 01, 12), "Development"));
		listOfEmp.add(new Employee(3, "Sanjay", 60000L, new Date(2011, 01, 12), "HR"));
		listOfEmp.add(new Employee(4, "Prashoo", 90000L, new Date(2010, 01, 12), "Development"));
		listOfEmp.add(new Employee(5, "Himanshu", 40000L, new Date(2015, 01, 12), "Development"));
		listOfEmp.add(new Employee(6, "Ganesh", 30000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(7, "Rahul", 90000L, new Date(2020, 01, 12), "HR"));

		//findemployee(listOfEmp);
		//highestSalary(listOfEmp);

	}

}
