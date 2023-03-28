package com.inter.common;

public interface BasicInter {
	// 인터페이스 내부에는 추상메소드만 선언이 가능
//	public void test() {  // 불가능
//		System.out.println("하하하 메소드 선언하기");
//	}
	
	
	public abstract void test();
	// 메소드 선언부는 무조건 추상메소드이기 때문에 
	// public abstract 예약어는 생략이 가능하다
	// 상속받아 재정의해야되기 때문에 기본적으로 public임
	int calc(int a, int b); // = public abstract int calc(int a, int b); 와 같음
	
	
	// 인터페이스에 변수는 public final static 으로 선언된 변수만 가능하다
	public static final int age = 3; // 생략해도 가능함-> int age = 3; (동일한결과)
	String Name = "재밌다"; // public final static이 생략되어있음
	
}
