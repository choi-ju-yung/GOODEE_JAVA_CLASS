package com.obj.run;
import com.obj.basicController.MethodTest;

public class MethodMain {

	public static void main(String[] args) {
		// 클래스에 선언된 메소드 호출하기
		// 클래스의 멤버메소드를 호출하려면 클래스를 객체로 생성해야함
		
	    MethodTest mt = new MethodTest();
	    mt.printMsg();
	    
	    System.out.println(mt.plus());
	    
	    mt.printSendMsg("ㅋㅋ");
	    String data = "안녕";
	    mt.printSendMsg(data);
	    
	    
	    System.out.println(mt.complexNumber(2, 4)); 
	    
//	    mt.numberTest(); // 같은 주소로 호출함    필드 1 지역변수 1
//	    mt.numberTest(); // 같은 주소로 호출함    필드 2 지역변수 1
//	    mt.numberTest(); // 같은 주소로 호출함    필드 3 지역변수 1
	    
	    new MethodTest().numberTest(); // (다른 주소로 호출함)주소가 새로 만들어짐 필드 1 지역변수 1 
	    new MethodTest().numberTest(); // (다른 주소로 호출함)주소가 새로 만들어짐 필드 1 지역변수 1
	    new MethodTest().numberTest(); // (다른 주소로 호출함)주소가 새로 만들어짐 필드 1 지역변수 1
	}

}
