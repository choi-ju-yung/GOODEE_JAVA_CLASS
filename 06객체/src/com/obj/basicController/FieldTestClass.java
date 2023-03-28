package com.obj.basicController;

public class FieldTestClass {
	
		// 클래스에서 필드(멤버변수) 선언하기
		// 클래스의 기능에 따라 저장할 데이터가 있다면 필드를 선언해서 관리한다.
	    // 선언하는 방식은 변수선언과 동일하고, 선언부 앞에 접근제한자를 사용한다.
	    // public : 모든패키지에서 직접 접근하여 데이터를 저장, 수정할 수 있음
	    // protected : 상속받은 클래스, 같은패키지에 있는 클래스에서 직접 접근해서 데이터를 저장, 수정
	    // default(생략) : 같은 패키지에 있는 클래스에서 직접 접근해서 데이터를 저장, 수정할 수 있음
	    // private : 클래스내부에서 직접 접근해서 데이터를 저장, 수정할 수 있음
	    // 객체지향의 정보 은닉으로 일반적인 클래스의 필드는 모두 private으로 선언함!! (규칙)

	
		public int age;
		String name;
		private char gender;
		// 상수필드 -> 반드시 선언과 동시에 초기화를 해줘야한다.
		
		public final double HEIGTH = 180.5;   // 최초에 한번 대입하면 변하지 않는 수 -> 상수필드
		
		
		
		{
			System.out.println(gender); // gender은 private 이기때문에 클래스 내부에서만 사용 가능
			gender = '여'; 
		}
		
		
		
		
		
		
}
