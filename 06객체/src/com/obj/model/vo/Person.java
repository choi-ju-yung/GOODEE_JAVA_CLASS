package com.obj.model.vo;

public class Person {
	public String name;
	public int age;
	public char gender;
	public double height;
	public String address;
	
	//생성자는 반드시 필요한 코드로 선언하지 않으면 jvm이 자동으로 생성해줌
	//생성자는 두가지로 구분
	// 1. 기본생성자(디폴트 생성자) : 기본값으로 클래스를 생성할 때 이용  
	// 사용법 ->  접근제한자 클래스명(){}
	// 생성자의 접근제한자는 대부분 public으로 지정함
	
	public Person() {
		System.out.println("Person 기본 생성자 실행!");
		name = "유병승";
		age = 19;
		height = 180.5;
		gender = '남';
	}
	

	
	// 2. 매개변수 있는 생성자 : 외부에서 생성에 필요한 데이터를 받아서 생성할 때 이용
	public Person(String paramName, int paraAge, double paramHeight, char paramGender) {
		name = paramName;
		age = paraAge;
		height = paramHeight;
		gender = paramGender;
	}
	
	{
		System.out.println("hi"); 
	}
	
	// 생성과 동시에 초기화할 값만 선언해도된다.
	public Person(String name, char gender) { // String , char
		this.name = name;
		this.gender = gender;
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// (String char) or (char String) 처럼 순서를 바꿔도됨
	public Person(char gender, String address) { // char, String
		this.gender = gender; 
		this.address = address;
	}
	
	
	// this() 생성자를 이용하면 추가로직을 작성하지 않고 활용할 수 있음.
	// 생성자 내부에서 다른 생성자를 호출할 때 사용
	public Person(String name, int age, char gender, String address) {
		this(name,age); // this 생성자는 생성자 코드에 첫번째 줄에만 선언할 수 있다. (하나만 사용가능)
		this.address = address;
		this.gender = gender;
	}
	
	
	
	
}
