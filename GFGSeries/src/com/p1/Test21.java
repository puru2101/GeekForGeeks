package com.p1;

class Student {
	int id;
	String classes;
	String section;
	String City;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", classes=" + classes + ", section=" + section + ", City=" + City + "]";
	}
}

public class Test21 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setCity("Haridwar");
		s1.setClasses("12th");
		// s1.setSection("A");

		System.out.println(s1);
	}

}
