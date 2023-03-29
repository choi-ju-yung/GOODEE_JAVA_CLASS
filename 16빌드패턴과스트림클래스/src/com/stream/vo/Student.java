package com.stream.vo;

import java.util.Objects;

import com.stream.common.Gender;

public class Student {
	private long stdNo;
	private String name;
	private int age;
	private double height;
	private Gender gender;  // M,f
	private String address;
	
	public Student() {}

	public Student(long stdNo, String name, int age, double height, Gender gender, String address) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", name=" + name + ", age=" + age + ", height=" + height + ", gender="
				+ gender + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, gender, height, name, stdNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && gender == other.gender
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name) && stdNo == other.stdNo;
	}
	
	
	
	//빌더 패턴으로 클래스 생성하는 로직 구현하기
	//내부 클래스를 활용하여 구현함.
	public static class Builder{  // 내부 클래스 생성
		private long stdNo;
		private String name;
		private int age;
		private double height;
		private Gender gender;
		private String address;
		
		public Builder stdNo(long val) {
			stdNo = val;
			return this;
		}
		
		public Builder name(String val) {
			name = val;
			return this;
		}
		
		public Builder age(int val) {
			age = val;
			return this;
		}
		
		public Builder height(double val) {
			height = val;
			return this;
		}
		
		public Builder gender(Gender val) {
			gender = val;
			return this;
		}
		
		public Builder address(String val) {
			address = val;
			return this;
		}
		public Student build() {  // Builder에 값 다 넣고 마지막에 build 호출
			return new Student(stdNo,name,age,height,gender,address);
		}
	}

	
	public static Student.Builder builder() {
		return new Student.Builder();
	}
	
	
}
