package com.bs.variable;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "자료형 최주영";
        
		// String은 클래스 이므로 원래 new 연산자를 이용해서 써야함
		name = new String("최주영");
		System.out.println(name);
		
		// 문자열 타입의 값에 + 연산하면 대상되는 값을 결합해줌
		String msg = "최주영 "+" 교육생";
		System.out.println(msg);
		
		// 다른 타입과 문자열 타입에 + 연산하기
		int age = 19;
		msg = age + " 살 " + name;  
		System.out.println(msg);
		
		msg = 20+age+name;  // 왼쪽부터 처리되기 때문에 20과 age 정수값을 더한후에 문자열 name 붙임
		System.out.println(msg);
		
		
		String real_name = "최주영";
		int real_age = 26;
		char gender = 'M';
		float height = 172.5f; 
		String Address = "경기도 안양시 만안구 냉천로 175번기 32";
		String pnumber = "010-8304-3868"; 
		System.out.println("나의 이름은 "+real_name+"이고 나이는 "+real_age+"이고 키는 "+height+", "
								+ "주소는"+Address+", 성별은 "+gender+"이다.");
		
		
		// String은 클래스로 유용한 기능을 가지고 있음
		// 1. String 변수에 저장된 문자열의 길이를 알려주는 기능 (메소드)
		//  "문자열".length();
		// 문자열변수명.length();
		System.out.println("최주영".length());
		System.out.println(Address.length());
		
		
		// 2. 문자열 변수에 저장된 문자열의 특정문자만 가져오는 기능
		// charAt(인덱스 번호)
		//"최주영".charAt(1) -> (주) 출력됨
		char ch = "최주영".charAt(2);
		System.out.println(ch);
		
		
		
	}

}
