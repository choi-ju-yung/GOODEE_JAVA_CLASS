package com.poly.model.vo;

public class Dog extends Animal{
	
	public Dog() {}
	
	public String dogBark() {
		return "멍멍!";
	}
	
	public Dog(String name, String type, int age) {
		super(name,type,age);
	}
	
	@Override
	public void bark() {
		System.out.println(dogBark());
	}
}
