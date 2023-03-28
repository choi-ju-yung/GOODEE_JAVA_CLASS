package com.inter.common;
@FunctionalInterface  // FunctionalInterface로 선언하면 추상메소드는 하나만 저장가능

public interface CalculatorInterface {
	
	void calc(int su, int su2);
	// int calc2(int a, int b);   -> 추상메소드가 2개이상이면 오류가남
	
	
}
