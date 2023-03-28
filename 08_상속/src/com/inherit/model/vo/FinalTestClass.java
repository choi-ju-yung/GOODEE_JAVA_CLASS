package com.inherit.model.vo;


// 클래스에 final 붙이면 붙인 클래스는 다른 클래스에게 상속주는것을 불가능함
public class FinalTestClass {
	private String test;
	
	public void setTest(String test) {
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}
	
}
