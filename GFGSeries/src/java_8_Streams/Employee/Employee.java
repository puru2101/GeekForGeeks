package java_8_Streams.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

	private Integer EmployeeId;
	private String EmployeeName;
	private Long Salary;
	private Date JoiningDate;
	private String Department;

	public Employee() {
		super();
	}

	public Employee(Integer employeeId, String employeeName, Long salary, Date joiningDate, String department) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Salary = salary;
		JoiningDate = joiningDate;
		Department = department;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public Long getSalary() {
		return Salary;
	}

	public Date getJoiningDate() {
		return JoiningDate;
	}

	public String getDepartment() {
		return Department;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary
				+ ", JoiningDate=" + JoiningDate + ", Department=" + Department + "]";
	}

	public static void main(String[] args) {

		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Sahil", 50000L, new Date(2010, 01, 12), "Operations"));
		listOfEmp.add(new Employee(2, "Puru", 100000L, new Date(2012, 01, 12), "Development"));
		listOfEmp.add(new Employee(3, "Sanjay", 60000L, new Date(2011, 01, 12), "HR"));
		listOfEmp.add(new Employee(4, "Prashoo", 90000L, new Date(2010, 01, 12), "Development"));
		listOfEmp.add(new Employee(5, "Himanshu", 40000L, new Date(2015, 01, 12), "Development"));
		listOfEmp.add(new Employee(6, "Ganesh", 30000L, new Date(2010, 01, 12), "Operations"));
	//	listOfEmp.add(new Employee(7, "Rahul", 59000L, new Date(2020, 01, 12), "HR"));

	}

}
