package com.inter.model.vo;

import com.inter.common.BasicInter;

// 인터페이스 구현하기
public class BasicInterClass implements BasicInter{
	// 인터페이스를 구현한 클래스는 반드시 인터페이스가 선언한 추상메소드를 재정의(오버라이딩) 해야한다.
	// 즉 BasicInterClass 안에 있는 추상메소드들을 여기서 다 구현해야함!!
	// 특정한 메소드를 강제시킬 때 사용함
	
	
	
	@Override
	public void test() {
		System.out.println("인터페이스"+Name+"굿굿!");
	}
	
	@Override
	public int calc(int a, int b) {
		return a+b;
	}
	
}
