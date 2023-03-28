package com.obj.run;

import com.obj.model.vo.StaticTest;

public class StacticMain {

	public static void main(String[] args) {
		// static 목적 : 객체 생성없이 공용으로 사용하기 위해서
		// static 예약어에 대해 알아보자
		// 필드, 메소드, 초기화블록에 사용할 수 있다.	
		// static으로 선언된 필드에 접근하려면
		// 선언된 클래스명을 이용해서 접근을 해야한다
		// new 연산자로 객체 생성할 필요 x
		// * 프로젝트 내에서 공용으로 사용하는 저장공간 = 다른 클래스에서 사용할 수 있음
//		StaticTest.test = "접근되니"; // 선언된 클래스명을 이용해서 접근
//		System.out.println(StaticTest.test);
//		
//		
//		
////		StaticTest st = new StaticTest(); // 객체로 생성해서 
////		st.test = "생성된 객체로 접근";  // 접근 할 수 있지만, 스태틱 방식으로 접근하라고 주의줌
////		System.out.println(StaticTest.test);
//		
//		
//		// static으로 선언된 메소드 실행하기
//		// 선언된 클래스명을 이용해서 접근 가능
//		// Math.random() -> static 메소드임
//		StaticTest.testMethod();
//		
//		
//		// static으로 선언된 필드, 메소드도 접근제한자의 영향을 받는다
//		// static 필드는 접근제한자를 기본적으로(private)으로 선언한다.
//		
//		//StaticTest.count = 100; // 이 필드도 private 접근제한자 영향을 받기 때문에
//		// setter와 getter를 만들어야함
//		// setter getter 도 static으로 만들어야함
//		StaticTest.setCount(100);
//		System.out.println(StaticTest.getCount());

		
	}
}
