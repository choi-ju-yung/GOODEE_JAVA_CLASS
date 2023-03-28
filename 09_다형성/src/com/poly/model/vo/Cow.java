package com.poly.model.vo;

public class Cow extends Animal{
	
	public Cow() {}
	
	public Cow(String name, String type, int age) {
		super(name,type,age); // 부모 생성자로 호출
	}
	
	public String cowbark() {
		return "음매";
	}
	
	@Override
	public void bark() {
		System.out.println(cowbark());
	}
}
