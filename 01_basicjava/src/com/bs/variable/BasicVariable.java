package com.bs.variable;

public class BasicVariable {
	public static void main(String[] args) {
		// 변수 선언하기
		// 각 자료형별 변수를 선언해보자
		
		// 1. 논리형 : true, false 데이터를 저장하는 저장공간
		// 크기 : 1byte
		// 명칭 : boolean
		boolean flag;
		
		// 2. 숫자형 변수 선언
		// 정수형
		
		byte bnum;  // 바이너리 파일을 저장할 때 사용 (사진, 동영상, 음악 등)
		short snum; 
		int inum; // 일반적인 숫자값 저장할 때 사용
		long lnum; // int 보다 더 큰 범위 수 저장할 때 사용
		
		
		// 3. 실수형 : 실제 값이 아닌 계산에 필요한 값을 저장(지수, 가수)
		float fnum;
		double dnum;
		
		// 4. 문자, 문자열 -> 코드표에 있는 숫자로 저장이 된다.
		char ch = 'a';
		String str;
		
		
		// 변수명은 대소문자로 구분하며, 변수이름의 길이에는 제한이 없다.
		// int testNum, int testnum
		// double teststetstestestesterewtstestestestestestest
		
		// 예약어를 변수명으로 사용할 수 없다.
		// char if; (x)
		
		// 변수명의 첫 글자를 숫자로 사용할 수 없다.
		// boolean 1flag; (x)
		
		// 변수명에 특수기호는 _ 와 $만 사용이 가능하다.
		// byte _test; (o)
		// byte $test; (o)
		// byte #test; (x)
		// byte t$est; (o)
		
		// 동일 영역({}안)내부에서 변수명은 중복될 수 없다.
		
		
		// 변수 선언할때 동일 자료형에 대한 여러변수를 한번에 선언 가능
		int a,b,c,d,e;
		
	}// main 닫기

}
