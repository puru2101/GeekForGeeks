package java_8_Streams.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortBySalary {

	public static void sortEmployees(List<Employee> list) {
		list.stream().sorted(Comparator.comparing(Employee::getSalary)).map(e -> e.getEmployeeName())
				.forEach(e -> System.out.print(e + " ,"));
	}

	public static void secondHighestEmployee(List<Employee> list) {

		System.out.println();
		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(e -> e.getEmployeeName())
				.skip(1).findFirst().get());

	}
	
	public static void toMap(List<Employee> list) {
		
		list.stream().collect(Collectors.toMap(Employee::getEmployeeName,Employee::getJoiningDate)).entrySet().stream().forEach(e->System.out.println(e+","));
		System.out.println("");
		System.out.print("---------------------");
		System.out.println("");

		list.stream().collect(Collectors.groupingBy(Employee::getEmployeeName)).entrySet().stream().forEach(e->System.out.println(e+","));
		
	}

	public static void averageSalary(List<Employee> list) {

		System.out.println();
		Map<String, Double> avgSalaryByDept = list.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryByDept);

		Double salary = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(salary);
//		list.stream().sorted().map(e->e.getSalary()).mapToInt(Integer::intValue).
//		list.stream().sorted(Comparator.comparing(Employee::getSalary))
//		        .map(e -> e.getEmployeeName()).skip(1).findFirst();
//		
	}

	@SuppressWarnings("deprecation")
	public static void newEmployees(List<Employee> list) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date cutoffDate = sdf.parse("2011-01-01");
		list.stream().filter(e -> e.getJoiningDate().after(cutoffDate)).forEach(e -> e.getEmployeeName());
	}

	public static void main(String[] args) {

		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Sahil", 50000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(2, "Puru", 100000L, new Date(2012, 01, 12), "Development"));
		listOfEmp.add(new Employee(3, "Sanjay", 60000L, new Date(2011, 01, 12), "HR"));
		listOfEmp.add(new Employee(4, "Prashoo", 90000L, new Date(2010, 01, 12), "Development"));
		listOfEmp.add(new Employee(5, "Himanshu", 40000L, new Date(2015, 01, 12), "Development"));
		listOfEmp.add(new Employee(6, "Ganesh", 30000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(7, "Rahul", 89000L, new Date(2020, 01, 12), "HR"));
		//sortEmployees(listOfEmp);

		//secondHighestEmployee(listOfEmp);
	//	averageSalary(listOfEmp);
		
		toMap(listOfEmp);
//		try {
//			newEmployees(listOfEmp);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
