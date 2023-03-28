package com.bs.variable;

import java.util.Scanner;

public class StudentInfo {
	
	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		// 학생정보를 입력받고 출력하는 기능 구현하기
		// 이름, 나이, 성별(남,여), 학년, 반, 번호, 키, 주소, 이메일 입력받고 
		// 입력받은 내용을 출력하기
		// com.bs.variable.StudentInfo클래스를 생성해서 구현할 것.
		// 1. 입력받은 값을 출력
		// 2. 한번에 출력   ex) 최주영 26 남 3 1 43 173.5 bogdudhkd123@naver.com
		
		String name, mail, address;
		int age, stClss, stNum, st_age;
		double height; 
		char gender;
		
		
		System.out.print("이름을 입력하세요 : ");
		name = student.next();
		System.out.print("나이을 입력하세요 : ");
		age = student.nextInt();
		System.out.print("성별을 입력하세요 : ");
		gender = student.next().charAt(0);
		System.out.print("학년을 입력하세요 : ");
		st_age = student.nextInt();
		System.out.print("반을 입력하세요 : ");
		stClss = student.nextInt();
		System.out.print("번호를 입력하세요 : ");
		stNum = student.nextInt();
		System.out.print("키를 입력하세요 : ");
		height = student.nextDouble();
		student.nextLine();  // 버퍼 비우기
		System.out.print("주소를 입력하세요 : ");
		address = student.nextLine();
		System.out.print("이메일을 입력하세요 : ");
		mail = student.next();
		

		System.out.println(name+" "+age+" "+gender+" "+st_age+" "+stClss+" "+stNum+" "+height+" "+" "+address+" "+mail);
		
	    
	}

}
