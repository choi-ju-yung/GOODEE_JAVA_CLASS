package com.inter.model.vo;

import com.inter.common.ChildInterface;

public class InterInheritClass implements ChildInterface{
	
	
	// 이 클래스에서는 ChildInterface 인터페이스가 상속한 ParentInterface 인터페이스에 있는
	// 추상 메소드까지 총 3개의 메소드를 밑에서 오버라이딩 해야한다!(구현)
	
	@Override
	public void printTest(String str) {
		
	}
	
	@Override
	public int add(int su, int su2) {
		return su + su2;
	}
	
	@Override
	public String addStr(String str, String str1) {
		return str + str1;
	}
	
	
	@Override
	public void fly() {};
	
}
