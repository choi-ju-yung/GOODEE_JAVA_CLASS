package com.bs.variable;

public class VariableTest {

	public static void main(String[] args) {
		int age; 
		age = 19;  // 변수에 값 대입(저장)하기
		
		System.out.println(age); // 저장된 값을 출력하기
		
		// 변수값을 저장할 때는 변수의 자료형과 리터럴의 자로형이 같아야함
		// age = 3.14;  (x) age는 int형이고 3.14는 double형이기 때문에 맞지 않음
		
		
		// 문자, 문자열 저장하기
		char alpha;
		alpha = 'A';  // 문자는 '' 로 구분
		System.out.println(alpha);
		
		String address;
		address = "경기도 시흥시"; // 문자열은 " " 로 구분
		System.out.println(address);
		
		// float형 실수 저장하기
		float height;
		height = 180.5f; // 리터럴값 뒤에 f가 없으면 양쪽의 자료형이 맞지 않아 틀림
		System.out.println(height);
		
		// double형 실수 저장하기
		double weight;
		weight = 65.5;
		System.out.println(weight);
		
		// 선언과 동시에 변수 선언하기
		String email = "bogdudhkd123@naver.com";
		System.out.println(email);
		
		// 동시에 초기화 선언 여러개 가능
		int a = 100, b = 200, c = 300;
		
		byte bnum;
		bnum = 100; // java에서 byte, short 리터럴에 타입표시를 하지 않아도 자동으로 리터럴 자료형을 변환하여 대입해줌
		short snum = 500;
		System.out.println(bnum);
		System.out.println(snum);
		
		// 상수 : 선언된 저장공간에 한번만 값을 대입할 수 있는 것 (대문자로 적는것이 약속임)
		// 대입 후 수정은 불가능함
	    // 에러코드, 지정된 레벨 저장할 때 사용
		final int AGE;
		AGE = 19;
		System.out.println(AGE);
		// AGE = 50;  (x) 상수는 값을 변경할 수 없음
	}

}
