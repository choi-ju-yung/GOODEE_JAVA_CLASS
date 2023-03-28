package com.inherit.model.vo;

public class Teacher extends Person {
	// 이름, 나이, 성별, 전화번호, 주소
	// 과목, 경력, 연봉

	private String subject;
	private String career;
	private int salary;

	public Teacher() {
	}

	public Teacher(String name, int age, char gender, String phone, String address, String subject, String career,
			int salary) {
		super(name, age, gender, phone, address);
		this.subject = subject;
		this.career = career;
		this.salary = salary;
	}

	public Teacher(String subject, String career, int salary) {
		super();
		this.subject = subject;
		this.career = career;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String infoTeacher() {
		return infoPerson() + career + " " + salary + " " + subject;
	}

	@Override
	public String info() {
		System.out.println("나 선생님");
		return infoTeacher();
	}

	
	@Override
	public boolean equals(Object o) {
		Teacher t = (Teacher)o;
		
		if(getName().equals(t.getName()) && getAge() == t.getAge() 
				&& subject.equals(t.subject)
				&& career.equals(t.career)){
			return true;
		}

			return false;
	}

	
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+getPhone()+" "
				+getAddress()+" "+getName()+" "+subject+" "+career+" "+salary;
	}
	
	
	
}
