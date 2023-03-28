package com.bs.variable;

public class ConvertTest {

	public static void main(String[] args) {
		// 자동형변환 (자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 범위가 큰 자료형으로 변환)
		int num = 100;
		long lnum = num;   
		System.out.println(10+180.5); // 자동형변환(정수 10이 10.0으로 변환되서 계산됨)
		
		float fnum = lnum; // 자동형변환(lnum 변수가 float형태로 바뀜)
		System.out.println(fnum);  
		
		
		// 강제형변환(값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환 (데이터 손실 발생할 수 있음))
		int num2 = (int)180.5;  // 180.5 double 타입을 int형으로 강제 변환하여 180으로 바꿔줌
		System.out.println(num2);
		
		int test = 290;
		byte bnum = (byte)test;
		System.out.println(bnum); // 정수형 290을 byte로 형변환해서 표현할 수 있는 수 까지만 출력
		
		// 계산에서 강제적 형변환
		// 성적, 평균
		int kor = 90, eng = 54, math = 49;
		System.out.println((double)(kor+eng+math)/3);
		
		// 단일문자(char) 형변환
		// char 내부적으로 코드표에 있는 숫자를 저장
		char ch = 'A';
		int chInt = ch;
		System.out.println(chInt);
		chInt = 66;
		System.out.println(chInt);
		System.out.println((char)chInt);
		ch++;
		System.out.println(ch);
		
		for(int i=0; i<=10; i++) {
			System.out.println(ch++);
		}
	}
}
