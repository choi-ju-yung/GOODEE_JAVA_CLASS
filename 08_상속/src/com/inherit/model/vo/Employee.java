package com.inherit.model.vo;

public class Employee extends Person{
	// 이름, 나이, 성별, 전화번호, 주소
	// 부서, 연봉, 연차,
	
	private String department;
	private int salary;
	private int yearMinus;
	
	public Employee() {}

	public Employee(String department, int salary, int yearMinus) {
		super();
		this.department = department;
		this.salary = salary;
		this.yearMinus = yearMinus;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getYearMinus() {
		return yearMinus;
	}

	public void setYearMinus(int yearMinus) {
		this.yearMinus = yearMinus;
	}
	
	
	
}
