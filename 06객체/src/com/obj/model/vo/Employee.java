package com.obj.model.vo;

public class Employee {
	
	// 필드선언
	private static int count;
	private int empNo; // 객체생성될때마다 번호 증가 (1~2~3.....)
	private String name;
	private String department;
	private int salary;
	private double bonus;
	
	// 기본 생성자 
	public Employee() {}
		
	//초기블록 (객체 생성할 때마다 실행)
	{
		empNo=++count; // 객체 생성할 때 마다 번호 1씩 부여
	}
	
	// 매개변수가 있는 생성자
	public Employee(String name, String department, int salary, double bonus){
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public String imfoEmp() {
		return this.empNo+" "+this.name + " "+ this.department+" "+this.salary+
				" "+this.bonus;
	}
	
	
	
	// 필드를 조작할 수 있는 setter / getter 선언하기
	// name 필드
	
	public void setName(String name) {  // 이름을 바꾸는 메소드
		if(name.length()>=2) { // 로직으로 문자열 매개변수의 글자수가 2개 이상인것만 대입
			this.name = name;
		}
	}
	
	public String getName() { // 이름을 출력하는 메소드
		return this.name;
	}
	
	public int getEmpNo() { // 수정되면 안되는 값들이나 보여지면 안되는 값들은 set,get을 만들지 않기
		return this.empNo;
	}
	
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public int getEmp() {
		return this.empNo;
	}
	

	
	
	
	 //Employee 객체를 생성해주는 메소드 만들기
	public void makeEmployee(Employee e, String name, String department,
			int salary, double bonus) {
		e.setName(name);
		e.setDepartment(department);
		e.setSalary(salary);
		e.setBonus(bonus);
	}
	
	// 객체를 리턴해서 반환해옴
	public Employee makeEmployee2(String name, String department, int salary,
			double bonus) {
		Employee e = new Employee(); // Employee 클래스 객체 e 생성
		e.setName(name);
		e.setDepartment(department);
		e.setSalary(salary);
		e.setBonus(bonus);
		return e;	
	}
	
	
	
	
	
}
