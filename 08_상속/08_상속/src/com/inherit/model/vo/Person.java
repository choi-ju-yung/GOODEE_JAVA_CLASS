package com.inherit.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String address;
	
	 
	public Person() {}


	public Person(String name, int age, char gender, String phone, String address) {
		super(); // object 클래스 즉 부모클래스를 호출
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public String infoPerson() {
		return name+" "+age+" "+gender+" "+phone+" "+address;
	}
	
	
	public String info() {
		System.out.println("나 사람");
		return infoPerson();
	}
	
}
