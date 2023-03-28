package com.inherit.model.vo;

public class OverrideParent {
	
	// 메소드에 final 붙이면 자식 클래스에서 동일한 printMsg()함수의 오버라이딩이 불가능함
	public final void printMsg() {
		System.out.println("Override Parent");
	}
	
}
