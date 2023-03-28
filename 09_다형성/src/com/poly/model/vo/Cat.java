package com.poly.model.vo;

public class Cat extends Animal{
	
	public Cat() {}
	
	public String catbark() {
		return "니야옹 니야오옹!";
	}
	
	public Cat(String name, String type, int age) {
		super(name,type,age);
	}
	
	
	@Override
	public void bark() {
		System.out.println(catbark());
	}
	
}
