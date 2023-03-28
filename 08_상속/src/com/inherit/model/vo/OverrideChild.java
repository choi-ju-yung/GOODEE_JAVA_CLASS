package com.inherit.model.vo;

public class OverrideChild extends OverrideParent{
	
	// override 는 메소드 선언부를 부모에 선언된 메소드와 동일하게
	// 선언해야한다.
	// 부모와 자식클래스 안에 동일한 함수가 있을시에 자식안의 함수를 먼저 호출함
	
	// 메소드 오버라이드를 할때는 어노테이션으로 표시해서 관리를 해줌.
	// 어노테이션 : @어노테이션명

	
//	@Override  // 오버라이드가 맞는지 확인 -> 선언한 메소드가 부모클래스에 있는지 확인 -> 없으면 오류
//	public void printMsg() { // 오버라이드 
//		System.out.println("어노테이션으로 오버라이드");
//	}

	
//  @Override // 밑에 있는 함수를 @Override 할 경우 오류가남 -> 부모클래스에 없는 함수기때문	
	public void printMsg(String str) { // 오버로딩 
		System.out.println("Override child");
	}
	
	
	
}
