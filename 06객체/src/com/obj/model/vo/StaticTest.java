package com.obj.model.vo;

public class StaticTest {
	// static 예약어를 사용한 필드는 클래스를 생성(객체화)하지 않고 사용할 수 있는 저장공간
	// static = 클래스 변수
	// 프로그램이 시작되면 이용하는 공간
	public static String test;
	private static int count;
	public int age;
	// 공용공간이라, 어떤힙, 어떤 스택이든 불러서 사용가능
	private static final String ERROR_404 = "페이지가 없음";  // final은 항상초기값 있어야함

//	static { // static도 초기 블록이 있음
//		
//	}
	
	
	// 메소드에 static 사용하기
	public static void testMethod() { 
		System.out.println("static메소드 호출");
	}
	
	
	public static void setCount(int count) {
		StaticTest.count = count;
		// 필드(멤버변수)와 메소드(멤버메소드)는 static 메소드에서 이용하지 못함
		// 이유 : static은 프로그램 실행시 바로 시작하는데, 해당 멤버변수가 있는지 없는지 모르기 때문에
		// member = "김찬은";
		// memberMethod();
	}
	
	public static int getCount() {
		return StaticTest.count;
	}
	
	public void memberMethod() {
		System.out.println("멤버메소드 호출");
	}
	
}
