package com.inherit.model.vo;

public class Parent {
	private String title;
	
	protected double weight;

	public Parent() {}
	
	public Parent(String title, double weight) {
		this.title = title;
		this.weight = weight;
	} // 상속할 때 자동으로 부모 생성자를 호출하기 때문에
	// 부모클래스에서 매개변수가 있는 생성자를 만들경우 기본 생성자를 직접 만들어야한다!
	 
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
}
