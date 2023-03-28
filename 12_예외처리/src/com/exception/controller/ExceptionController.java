package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.exception.common.MyException;
import com.exception.common.MyException2;

public class ExceptionController {

	public void uncheckedException() {
		
		// 발생하는 예외에 대해서 처리하지 않아도 되는 예외
		// ArithmeticException : 수학적으로 계산이 불가능할 때 발생하는 Exception
		// int su = 10;
		// int su2 = 0;
		// System.out.println(su/su2);

		// ArrayIndexOutOfBounsException
		// 배열의 인덱스범위를 초과해서 접근할 때 발생하는 예외
		// +int[] intArr = new int[5];
		// System.out.println(intArr[5]);

		// ClassCastException
		// 클래스형변환을 잘못했을 때
		// Object o = new String("안녕");
		// Integer num = (Integer)o; // 문자열을 정수형으로 바꿀 수 없음

		// NullPointException
		// 참조형변수에 null값이 있을 때 접근연산자를 사용하면 발생하는 예외
		// String name = null;
		// name.length(); // name에는 널값이 있는데 .연산자로 접근하고 있어서 발생

		// NumberFormatException
		// 문자열을 숫자형으로 변환할 때 변환 불가능한 문자가 있는 경우
		// String name = null;
		// su = Integer.parseInt(name); //문자열을 정수로 바꿀 수 없음

		// InputMissMatchException
		// 입력값의 타입이 일치하지 않을 때 발생
		// Scanner sc = new Scanner(System.in);
		// int su3 = sc.nextInt();

		// RuntimeException이 발생하면 발생하는 순간 프로그램은 종료됨
		// System.out.println("이건 실행하니");

	}

	
	
	public void exceptionResolve() throws FileNotFoundException {
		// Exception 발생시 해결하는 방법
		// 1. try~catch문을 이용해서 직접예외를 처리하기
		// 2. throws 예약어를 이용해서 예외처리를 위임하기
		// catch문에는 보통 대체 해결하는 코드를 작성함

		// try~catch문으로 발생하는 예외를 처리해보자.
//		int[] intArr = { 1, 2, 3, 4, 5 };
//
//		try {
//			int a = intArr[5];
//			System.out.println(a);
//		} catch (ArrayIndexOutOfBoundsException e) { // 클래스라서 객체 e 만들어줌
//			System.out.println("인덱스 부족해!");
//			int[] temp = new int[intArr.length + 5];
//			System.arraycopy(intArr, 0, temp, 0, intArr.length);
//			intArr = temp;
//			int a = intArr[5];
//			System.out.println(a);
//		}
//		System.out.println("실행되니?");
//
//		String name = null;
//
//		try {
//			System.out.println("예외처리 후 실행되는 로직");
//			if (name.length() < 2) { // 예외가 발생한 지점에서 바로 catch로 넘어감
//				System.out.println("이름은 두글자 이상 작성해주세요");
//			} else {
//				System.out.println(name + " 참 멋진 이름이네요");
//			}
//
//		} catch (NullPointerException e) {
//			System.out.println("name이 null 이면 처리 할 수 없습니다.");
//		}
//		System.out.println("예외처리 후 실행되는 로직");

		
		
		// try문에 선언된 내용은 try문 내부에서 사용이 가능함
		// try문에서 사용하려면 외부에서 선언하는것이 좋다.
//		try {
//			int test=19;
//			String number="십구";
//			int result=test+Integer.parseInt(number);
//		}catch(NumberFormatException e) {
//			System.out.println(test);
//			System.out.println(number);
//		}
//		System.out.println(test);

		
		
		
		// try~catch문을 작성했을 때 catch문을 여러개 작성할 수 있다.
		// 동시에 두개의 오류가 발생할 순 없다
//		String[] names = {"유병승",null,"최하리"};
//		try {
//			for(int i=0; i<=names.length; i++) {
//				if(names[i].length()>2) {
//					System.out.println(name);
//				}
//			}
//		}catch(NullPointerException e) {
//			System.out.println("널포인트 Exception");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 부족해");
//		}

		
		// 위 코드와 같은 결과갖을 갖으며 |연사자를 통해서 둘중하나 걸렸을 때 처리할 수 있음
//		String[] names = { "유병승", null, "최하리" };
//		try {
//			for (int i = 0; i <= names.length; i++) {
//				if (names[i].length() > 2) {
//					System.out.println(name);
//				}
//			}
//		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();  // 오류구문이 빨간문장으로 뜨지만 프로그램은 종료되지 않음
//			// printStackTrace는 어떤위치에서 어떤오류가 발생했는지 확인할 때 사용
//			System.out.println("예외발생!!!");
//		}
		
		
		
		
		// 부모 Exception은 자식 Exception이 발생했을 때 모두 처리 할 수 있다.
		// 즉 예외처리 최상위 클래스인 Throwable은 모든 예외를 처리 할 수 있음
		// 반대로 자식 예외로 부모 예외를 처리할 수 없음
		// 공통적으로 처리하는 부분이 동일하면 Exception으로 모든 예외를 처리하고
		// 오류부분을 일일이 찾아내고싶을 때는 해당 예외를 넣는다.
		// 주로 각각의 예외부분을 먼저 넣은 후에 마지막부분에 최상위 예외클래스를 넣는다.
		
//		Object o = new String("test");
//		try {
//			int a =(int)o;
//			a = intArr[11];
//		}catch(Throwable e){
//			System.out.println(e.getMessage());
//			System.out.println("예외처리");
//		}
		
//		Object o = new String("test");
//		try {
//			int a =(int)o;
//			a = intArr[11];
//		}catch(Throwable e){
//			System.out.println(e.getMessage());
//			System.out.println("예외처리");
//		}
		
		
		
		
		
		// 예외처리 구문에서 반드시 실행해야할 구문이 있는 경우
		// finally{예외가 발생하던, 안하던 무조건 실행되는 구문}
		// try,catch문에 break가 있어도 finally는 실행되고 넘어감

//		try {
//			String n = null;
//			n.length();
//			System.out.println("try문");
//		}catch(NullPointerException e) {
//			System.out.println("catch문");
//		
//		}finally { // 예외가 발생하든 안하든 실행함
//			System.out.println("반드시 실행해");
//		}
		
		
		
		
		// 개발자가 원하는 순간에 Exception을 발생시킬 수 있음
//		exceptionTest("오호 내가 발생시키기!");
//		exceptionTest(10);
		
		
		
		// 2. throws로 예외처리하기
		// 예외가 발생하는 코드가 있는 메소드 선언부에 선언을 함.
		throwsTest();
		
	}
	
	public void throwsTest() throws FileNotFoundException{ // 위임
		//Checked Exception라서 예외처리가 미리 필요함 (안하면 오류남)
		FileInputStream fis = new FileInputStream("test.txt"); 
	}
	
	
	
	// 개발자가 원하는 순간에 Exception을 발생시킬 수 있음
	private void exceptionTest(Object o) {
		if(o instanceof String) {
			System.out.println(o);
		}else {
			// 직접예외를 발생시키기
			throw new IllegalArgumentException();
		}
	}
	
	
	
	public void checkedException() {
		// checkedException 예외가 발생하면
		// 무조건 예외처리를 해줘야하는 Exceptions들
		// IOException, Exception
		try {
			throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// checkedException 들은  (try~catch로 예외처리를 해줘야함)
		//throw new FileNotFoundException();  
		//throw new EOFException();
		//throw new SQLException();
	}
	
	
	public void makeMyException() {
		// 나만의 예외 만들기
		// Exception, RuntimeException, IOEception을
		// 상속받는 클래스를 선언
		try {
			throw new MyException("나의 예외 발생!!");
		}catch(MyException e) {
			
		}
		// unchecked
		throw new MyException2("런타임예외를 상속받은 나의 예외");
		
	}
	
	
	
}
