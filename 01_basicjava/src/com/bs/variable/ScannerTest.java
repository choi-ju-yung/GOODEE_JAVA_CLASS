package com.bs.variable;

import java.util.Scanner; // 클래스 import


public class ScannerTest {
	
	// 사용자가 키보드로 입력한 값을 가져오기
	// java.util.Scanner 클래스를 이용한다.
	// 1. Scanner클래스를 import 해주기 -> import java.util.Scanner;
	// 2. Scanner클래스를 생성해주기 => Scanner sc = new Scanner(System.in);
	// 3. Scanner 클래스가 제공하는 기능을 이용해서 데이터를 받아오기
	// 자료형에 따라 기능제공
	// 정수형 : nextInt()
	// 실수형 : nextDouble()
	// 문자열 : next() 또는 nextLine()
	// 문자 : next().charAt(0);
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); // Scanner 클래스 생성
		System.out.print("나이를 입력하세요 : ");
		int gab = sc.nextInt();
		System.out.println(gab);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("입력한 이름 : "+name);
		
		sc.nextLine(); // 버퍼를 비워주는 역할 (nextLine을 쓸 때는 그 전에 다른 입력을 받았다면 비워줘야함)
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("입력한 주소 : "+address);
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.println("입력키 : "+height);
		
		
		System.out.print("성별 (M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.println("입력한 성별 : "+gender);
		
		
		// 학생정보를 입력받고 출력하는 기능 구현하기
		// 이름, 나이, 성별(남,여), 학년, 반, 번호, 키, 이메일 입력받고 
		// 입력받은 내용을 출력하기
		// com.bs.variable.StudentInfo클래스를 생성해서 구현할 것.
		// 1. 입력받은 값을 출력
		// 2. 한번에 출력   ex) 최주영 26 남 3 1 43 173 bogdudhkd123@naver.com
	}
}
