package com.obj.basicController;

import com.obj.model.vo.Employee;

public class MethodTest {
	
	private int count;
	
	public MethodTest() {} // 기본생성자 선언
	
	// 메소드는 클래스가 제공하는 기능 의미
	
	// 1. 반환형이 없고 매개변수도 없는 메소드 선언하기
	// 반환형이 없음 : void
	// 매개변수 없음 : ()
	// 접근제한자(public) [예약어] 반환형 메소드명([매개변수선언]){기능구현}
	// 메소드명은 변수명이랑 명명규칙이 똑같음 (첫글자 소문자에 그 다음단어부터는 첫글자 대문자)=카멜케이스=낙타표기법
	
	public void printMsg() {
		System.out.println("printMsg 실행함");
	}
	
	// 2. 반환형이 있고 매개변수 없는 메소드 구현하기
	// 반환형에는 반환할 값의 타입을 선언을 한다.
	// 특정값을 더하고 결과를 반환하는 기능을
	public int plus() {
		int su = 100;
		int su2 = 200;
		return (su+su2); // 반환형을 처리하는 예약어를 사용 -> return 값 또는 변수
	}
	
	
	//3. 반환형이 없고 매개변수가 있는 메소드
	// 호출하는 곳에서 전달한 문자를 출력해주는 기능
	public void printSendMsg(String msg) {
		System.out.println("전달한 메세지 : "+msg+" 실행함");
	}
	
	
	//4. 반환형이 있고 매개변수 있는 메소드
	// 정수 두개를 전달받아 두 값을 곱한 결과를 반환하는 기능 만들기
	public int complexNumber(int su1, int su2) {
		return su1 * su2;
	}
	
	
	// 메소드 구현부 메소드의 {} 내부
	// 변수 선언(지역변수), 조건문, 반복문, 필드(멤버변수)등 모두 사용 가능
	
	// 1부터 10까지 출력해주는 메소드 만들기
	public void numberTest() { // 메소드 내부에서는 반복문, 조건문 다 사용 가능함
		this.count++; // 필드 카운트 (함수 호출할 때마다 누적되며 유지됨)
		int count = 0; // 지역변수 카운트 (함수 호출할때마다 초기화)
		for(int i=1; i<=10; i++) {
			if(i%2== 0) {
				System.out.print(i+" ");
			}       
		}
		System.out.println();
		System.out.println("필드출력 : "+this.count);
		System.out.println("지역변수 : "+this.count);
	}
	
	


	
}
