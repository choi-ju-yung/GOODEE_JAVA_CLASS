package com.inherit.model.vo;

import java.util.Objects;

public class Student extends Person{
	// 이름, 나이, 성별, 전화번호, 주소
	// 수강과목, 특이사항, 수준
	
	private String joinClass;
	private String issue;
	private char level;
	
	public Student() {
	
	}
	

	public Student(String name, int age, char gender, String phone, String address,
			String joinClass, String issue, char level) {
		super(name,age,gender,phone,address);
		// super 생성자 호출말고
		// super.set으로 값을 넣어줄 수 있음
		this.joinClass = joinClass;
		this.issue = issue;
		this.level = level;
	}


	public String getJoinClass() {
		return joinClass;
	}
	public void setJoinClass(String joinClass) {
		this.joinClass = joinClass;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public char getLevel() {
		return level;
	}
	public void setLevel(char level) {
		this.level = level;
	}
	
	public String infoStudent() {
		return getName()+" "+getAge()+" "+getGender()+" "+
				getPhone()+" "+getAddress()+" "+joinClass+" "+issue+
				" "+level;
	}
	
	
	@Override
	public String info() {
		System.out.println("나 학생");
		return infoStudent();
	}
	
	
	//객체 생성할때 equals, toString, hashCode 메소드 재정의하는 버릇 들여야함
	@Override
	public boolean equals(Object o) {
		// 객체의 동등성 비교를 하기위해 설정
		// 필드의 값을 가지고 생성된 값이 같은지 비교하기 위해
		Student s = (Student)o;  // 최상위 클래스 o를 Student로 형변환 
		
		     //(s1)           //(s2)
		if(getName().equals(s.getName())
				&& getAge()==s.getAge()
				&& getGender() == s.getGender()
				&& getAddress().equals(s.getAddress())
				&& getPhone().equals(s.getPhone())
				&& joinClass.equals(s.joinClass)) {
				return true;
		}
		
		return false;
	}
	
	
	//toString Override 하기
	@Override 
	public String toString() { // 원래 있던 toString 메소드를 재정의해서 만듬 
		return getName()+" "+getAge()+" "+getGender()+" "+
				getPhone()+" "+getAddress()+" "+joinClass+" "+ issue+" "+level;
	}
	
	
	
	@Override
	public int hashCode() {
		// equals에서 동등비교의 기준이 된 필드를 매개변수로 넣으면 됨
		return Objects.hash(getName(), getAge(), getGender(),
				getPhone(),getAddress(),joinClass);
	}
	
	
	@Override
	public Student clone() {
		return new Student(getName(),getAge(),getGender(),getPhone(),getAddress(),
				joinClass,issue,level);
	}
	
	
	
	
}
