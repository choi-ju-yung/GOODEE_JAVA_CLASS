package com.api.controller;

public class WrapperController {
	public static void main(String[] args) {
		
		// Wrapper 클래스 이용하기
		// 사용하는 이유 : 객체와 같이 연동하기 위해
		// 기본자료형을 객체로 사용할 수 있게 해주는 클래스
		// 자동으로 형변환 처리됨 (autoBoxing, autoUnBoxing)
		// int -> Integer 맵핑
		// double -> Double 맵핑
		// long -> Long 맵핑
		// boolean -> Boolean 맵핑
		// char -> Character 맵핑
		
		Object obj = 10; // 자동으로 jvm에서 obj를 Integer로 형변환
		
		// 서로 호환이됨
		Integer age = 19;
		int intAge = age;
		System.out.println(age);
		System.out.println(intAge);
		
		// 밑에 test 함수에 인수를 넣으면 각각 래퍼클래스로 형변환되어서 적용이됨
		test(19); // 19가 integer로 형변환됨
		test(180.5);
		test(true);
		test('a');
		
		int test = getInt();
		System.out.println(test);
		
		
		// 문자열을 기본타입으로 변경하는 메소드를 제공
		// wrapper 클래스
		// 자료형.parse자료형("문자열")
		String test2 = "20";
		int change = Integer.parseInt(test2); // 문자열 test2를 정수형으로 바꿈
		System.out.println(change);
		
		test2 = "180.5";
		double height = Double.parseDouble(test2); // 문자열 test2를 실수형으로 바꿈
		System.out.println(test2);
		
		test2 = "유병승";
		char a = test2.charAt(0);
		
		
		int result = Integer.max(100, 200); // 큰값을 출력해주는 함수
		System.out.println(result);
		result = Integer.min(100, 200); // 작은값을 출력해주는 함수
		System.out.println(result);
		
	}	
		
	
	public static void test(Object o) {
		System.out.println(o);
	}
		
	
	public static Integer getInt() {
		return 10;
	}
	
	
}
