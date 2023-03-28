package com.obj.basicController;
import java.util.Scanner;

import com.obj.model.vo.Animal;
import com.obj.model.vo.Employee;

public class MyMethod {
	//com.obj.basiccontroller.MyMethod
	//"월요일 점심 맛있게 먹어요" 출력하기 메소드 작성하기
	// 숫자를 1~5까지 더한 수를 반환하는 메소드 작성하기
	// 사용자한테 5번 메세지를 입력받고 입력받은 메시지를 반환하는 메소드 만들기
	// 정수 두개, 연산자 한개를 전달받아 계산결과를 출력하는 메소드 만들기
	// 정수 두개, 연산자 한개를 전달받아 계산결과를 반환하는 메소드 만들기
	// 문자열을 전달받아 문자열에 중복값이 있는지 결과를 반환하는 메소드 만들기
	
	public void enjoyEat() {
		System.out.println("월요일 점심 맛있게 먹어요.");
	}
	
	
	public int numberPlus() {
		int sum =0;
		for(int i=1; i<=5; i++) {
			sum +=i;
		}
		return sum;
	}
	
	
	public String message() {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번 메시지 입력 : ");
			msg += sc.next()+" ";
		}
		return msg;
	}
	
	
	
	public void printCal(int num1, int num2, char op) {
		switch(op) {
		case '+':
			System.out.println(num1+" "+op+" "+num2+" = "+(num1+num2)); break;
		case '-':
			System.out.println(num1+" "+op+" "+num2+" = "+(num1-num2)); break;
		case '*':
			System.out.println(num1+" "+op+" "+num2+" = "+(num1*num2)); break;
		case '/':
			System.out.println(num1+" "+op+" "+num2+" = "+(num1/num2)); break;
		case '%':
			System.out.println(num1+" "+op+" "+num2+" = "+(num1%num2)); break;
		default : System.out.println("+,-,*,/,% 중에 선택해주세요"); break;
		}
}
	
	
	
	public int returnCal(int num1, int num2, char op) {
			switch(op) {
			case '+':
				return num1+num2; 
			case '-':
				return num1-num2;
			case '*':
				return num1*num2; 
			case '/':
				return num1/num2; 
			case '%':
				return num1%num2;
			default : throw new IllegalArgumentException(); // 잘못된 연산자 입력시 예외처리 구문
		}
	}

	
	
	// 문자열을 전달받아 문자열에 중복값이 있는지 결과를 반환하는 메소드 만들기
	public boolean dupleString(String str) {

		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	// java의 메소드 반환값은 한개만 가능하다.
//	public int testReturn() {
//		//return 10,20,30; // (x)
//	}
	
	// 다수값을 반환하거나 전달(매개변수) 받을려면
	// 1. 배열
	// 2. 클래스
	// 를 선언한다.
	public int[] testReturn() {
		return new int[]{10,20,30,40}; // 배열값 10,20,30,40 동시에 리턴
	}

	public Animal makeAnimal() {  // 반환형 클래스임
		return new Animal(); // 클래스 리턴
	}
	
	public void paramArr(int[] intAar) {
		for(int i : intAar) {
			System.out.println(i);
		}
	}
	
	public void paramObj(Animal animal, String type) { // 매개변수 클래스, String
		animal.kindof = type;
	}

	
	public void changeInt(int num) {
		num+=20;
	}
	
	public void changeIntArr(int[] intArr) { // 매개변수가 배열형태임
		intArr[0] = 200;
	}
	
	
	

	
	
}
