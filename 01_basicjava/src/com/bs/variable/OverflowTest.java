package com.bs.variable;

public class OverflowTest {

	public static void main(String[] args) {
		// 오버플로우 예시 -> byte 자료형의 최대범위인 127까지 출력되고 그 이후로 -128부터 출력됨
		byte b = 100;
		for(int i=0; i<10000; i++) {
            b += 1;
			System.out.println(b);			
		}
	}

}
