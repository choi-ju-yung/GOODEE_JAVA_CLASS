package com.operator.controller;
// 기능을 제공하는 클래스
import java.util.Scanner;

public class OperatorController {
	
	//1. 단항연산자 알아보기
	public void singleOp() {
		//1. 부정연산자 : boolean형의 값을 반전시키는 연산자
		//표현 : !변수명  또는  !기능(메소드)호출구문  또는  !비교연산
		System.out.println("===== 부정 연산자 활용하기 ===== ");
		boolean flag = true;
		System.out.println("flag : "+flag);
	    System.out.println("!flag : "+!flag);
	    System.out.println("!flag : "+!!flag);
	    
	    // 나이가 19이상이 아니지?
	    int age = 19;
	    System.out.println(!(age > 19));
	    
	    // 기능 호출했을 때 부정하기
	    // String의 값을 동등 비교할때는 equals()를 이용해야함.
	    // 이름이 유병승이니?
	    String name = "유병승";
	    System.out.println(name.equals("유병승")); // equals -> 괄호안의 문자열이랑 동등한지 비교하는 함수
	    // 문자열의 같지 않음을 비교할 때 사용
	    System.out.println(!name.equals("유병승")); // 함수 앞에 !를 붙여서 질문은 반대로 바꿀 수 있음
	    
	    
	    //2. 증가, 감소, 연산
	    // 표현 : ++변수, 변수++, --변수, 변수--
	    // ++변수와 변수=변수+1 과 같음
	    
	    int count = 0;
	    ++count;  // count = 1
	    count = count + 1; // count = 2
	    count++; // count = 3
	    count++; // count = 4
	    
	    --count; // count = 3
	    count --; // count = 2
	    System.out.println(count);
	    
	    // ++, -- 연산자의 위치에 따라 연산실행 순서가 변경됨
	    // 다른 연산자와 같이 연산실행했을 때 순서변경됨.
	    count = 0;
	    // ++변수 -> 전위연산 : 다른 연산자와 같이 있을 때 먼저 증가, 감소연산을 실행하고 다른 연산을 실행
	    
	    int testNum = count++ +10; // 후위연산 : 다른연산과 같이 있을 때 다른 연산을 먼저 실행하고 나중에 증가
	    System.out.println(testNum);
	    	    
	}
	
	
	public void calcuatorOp() {
		// 산술연산자 활용하기
		// +, -, *, /, %
		int su = 2;
		int su2 = 10;
		System.out.println("+연산 : "+(su+su2));
		System.out.println("-연산 : "+(su-su2));
		System.out.println("*연산 : "+(su*su2));
		System.out.println("/연산 : "+(su/(double)su2));
		System.out.println("%연산 : "+(su%su2));
		
	}
	
	
	public void calc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : ");
		int number1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int number2 = sc.nextInt();
		
		System.out.println("더한 결과 : "+(number1+number2));
		System.out.println("뺀 결과 : "+(number1-number2));
		System.out.println("곱한 결과 : "+number1*number2);
		System.out.println("나눈 결과 : "+(double)number1/number2);
		// 계산기 만들기
		// 사용자에게 두 수를 입력받고 입력받은 수의
		// 더한결과, 뺀결과, 곱한결과, 나눈결과를 출력하는 기능을 구현
		
	}
	
	
	
	public void compareOp() {
		// 비교연산자 활용하기
		// 동등비교  ->   ==, !=
		// 대소비교  ->   >, <, <=, >=
		// 비교연산의 결과는 true/false로 반환됨.
		int num = 13;
		int num2 = 19;
		int num3 = 13;
		// 일치 여부 확인
		System.out.println(num == num2); 
		System.out.println(num == num3);
		
		// 불일치여부 확인
		System.out.println(num != num2);
		System.out.println(num != num3);
		
		// 실수형 비교하기
		double dnum = 180.5;
		double dnum1 = 190.5;
		double dnum2 = 180.5;
		System.out.println(dnum == dnum1);
		System.out.println(dnum == dnum2);
		System.out.println(dnum != dnum1);
		
		// 문자 동등 비교
		char ch = 'A';
		char ch1 = 'a';
		char ch2 = 'A';
		System.out.println("A==a : "+(ch==ch1));
		System.out.println("A==A : "+(ch==ch2));
		System.out.println("A!=a : "+(ch!=ch1));
		
		int chInt = 65;
		System.out.println(ch == chInt);
		
		// 문자열에 대한 동등비교
		// String(클래스) 동등비교할때 == 연산을 사용할 수 없다
		// String이 제공하는 equals()기능을 이용해서 동등비교를 한다
		
		String name = "유병승";
		String name2 = "이다영";
		String name3 = "유병승";
		String name4 = new String("이다영"); // new연산자로 문자열 생성시 주소값이 생기며 그 주소값 안에 값이 들어감
		System.out.println("name == name2 : "+(name==name2));
		System.out.println("name == name3 : "+(name==name3));
		System.out.println("name2 == name4 : "+(name2==name4)); // 주소값이 다르므로 거짓
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 : ");
//		String inputName = sc.nextLine();
//		System.out.println(inputName == "유병승"); // (false)
//		System.out.println(inputName.equals("유병승")); // (true)
//		System.out.println("유병승".equals(inputName)); // (true)
//		System.out.println(!"유병승".equals(inputName)); // (false)
		
		
		//대소 비교하기
		//숫자값만 가능
		// <, >, <=, >=
		num = 200;
		num2 = 300;
		num3 = 200;
		System.out.println(num < num2);
		System.out.println(num >= num3);
		
		
		// 문자타입 대소비교
		char ch4 = 'Z';
		char ch5 = 'E';
		System.out.println("Z > E : "+ (ch4 > ch5));
		// 대문자 범위 65~90   소문자 범위 97~122
		System.out.println("A < Z : "+('A'<'Z'));
		
		// 문자열의 대소비교는 불가능하다!
		String str = "30";
		String str2 = "40";
		//System.out.println(str<str2); (오류)
		
	}
	
	
	public void testStr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("id를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println(id == "admin");
		
	}
	
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age >= 20);
	}
	
	
	public void logicOp() {
		// 논리연산하기
		// 논리연산 : 2개 이상의 진위형을 연결할 때 사용하는 연산
//		String id = "admin";
//		String password = "1234";
//		
//		System.out.println(id.equals("admin") && password.equals("1234"));
//		
		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		sc.nextLine(); // 버퍼 비워주기;
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		// and 연산
//		System.out.println((age >= 19) && (address.equals("경기도")));
		
		// or연산
		//System.out.println(address.equals("경기도") || address.equals("서울"));
		
		// 논리연산을 이용해서 숫자의 벙뮈를 확인할 수 있음
//		System.out.println(10<=age && age<=200);
		
		// 문자 한개를 입력받고 입력한 문자가 대문자면 true 아니면 false
//		System.out.print("문자 한개를 입력하세요 : ");
//		char moon = sc.nextLine().charAt(0);
//	
//		System.out.println((moon >= 'A') && (moon <= 'Z'));
		
		// 입력받은 나이가 20대이면서 입력받은 성별이 여자인 사람
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.print("성별 입력 : ");
//		String gender = sc.nextLine();
//		System.out.println((age >= 20) && (age <= 29) && (gender.equals("여자")));
		
		
		// 입력받은 문자가 알파벳이면 true 아니면 false
//		System.out.print("입력하세요 : ");
//		char chr = sc.nextLine().charAt(0);
//		System.out.println((chr >= 'A' && chr <= 'Z') || (chr >= 'a') && (chr <= 'z'));

		// 사는곳이 서울 또는 인천이면서 30대인 사람 구하기
		System.out.println("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println((address.equals("서울") || address.equals("인천")) && (age >= 30) && (age <= 39));
	}
	
	
	
	public void complexOp() {
		// 복합대입 연산자
		// +=, -=, *=, /=
		// 값을 누적시키거나 차감시킬때 사용
		int total = 300000;
		total-= 1000;
		System.out.println(total);
		total+= 10000;
		System.out.println(total);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 용돈 : ");
		total = sc.nextInt();
		System.out.println("금액 : ");
		total += sc.nextInt();
		System.out.println("현재 잔액 : "+total);
		
	}
	
	// 수학, 영어, 국어, 코딩점수를 입력받고
	// 합계와 평균을 출력하는 기능 구현하기  *변수는 한개만 사용해서 구현할 것
	// public void calcGrade()
	
	
	public void calcGrade() {
//		int total = 0;
//		Scanner score = new Scanner(System.in);
//		System.out.print("수학 점수를 입력 : ");
//		total += score.nextInt();
//		
//		System.out.print("영어 점수를 입력 : ");
//		total += score.nextInt();
//		
//		System.out.print("국어 점수를 입력 : ");
//		total += score.nextInt();
//		
//		System.out.print("코딩 점수를 입력 : ");
//		total += score.nextInt();
//		
//		System.out.println("4과목 합계 : "+total);
//		System.out.println("4과목 평균 : "+(double)total / 4);
		
		
		// 문자열에 대한 누적 (문자열 연산할 때에는 항상 초기화값이 있어야한다 (쓰레기값 때문에))
		String msg = ""; // 공값을 대입할 때
		msg += "안녕";
		msg += "하이";
		msg += "와썹?";
		System.out.println(msg);
		
	}
	
	
	
	// 사용자에게 메시지를 4개 입력받고 입력받은 메시지를 한번에 출력하는 기능 만들기
	// public void inputMsg();
	
	
	public void inputMsg() {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		System.out.print("첫 번째 메시지를 입력하세요 : ");
		msg += sc.nextLine();
		System.out.print("두 번째 메시지를 입력하세요 : ");
		msg += sc.nextLine();
		System.out.print("세 번째 메시지를 입력하세요 : ");
		msg += sc.nextLine();
		System.out.print("네 번째 메시지를 입력하세요 : ");
		msg += sc.nextLine();
		
		System.out.println(msg);	
	}
	
	
	public void thirdOp() {
		// 삼항연산자에 대해 알아보자.
		// 조건식(true, false) 나오는 연산, 기능(메소드)
		// 값이 180보다 크면 키가 크네요 출력, 아니면 키가 작네요 출력
		// 조건 ? "참이 될 때 나오는 문구" : "거짓일때 나오는 문구";
//		double height = 175.5;
//		String msg = height >= 180 ? "키가 크네요" : "키가 작네요";
//		System.out.println(msg);
//		
//		// 점수를 입력받아 점수가 60점이상이면 합격 출력, 아니면 불합격 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		int score = sc.nextInt();
//		
//		System.out.println(score >=60 ? "합격" : "불합격");
//		
		
		
		
		// 아이디와 패스워드를 입력받고
		// 아이디가 admin이고 패스워드가 1234면 로그인 성공 출력 아니면 로그인 실패 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("id 입력 : ");
//		String id = sc.nextLine();
//		System.out.print("패스워드 입력 : ");
//		String pass = sc.nextLine();
//		
//		System.out.println(id.equals("admin") && pass.equals("1234") ? "로그인 성공" : "로그인 실패");
//		
//		
//		String tag = "<input type='checkbox' name = 'hobby' "+(id.equals("admin")?"checked":"")+">";
//		System.out.println(tag);
		
		
		
		
		// 나이와 성별을 입력받아
		// 나이가 성년이고 남자면 멋진남자네요!
		// 나이가 성년이고 여자면 예쁘시네요!
		// 나이가 미성년이면 공부하세요!
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String result = age > 19 ? gender == 'M' ? "멋진 남자네요!" : "이쁘시네요!" : "공부하세요!"; 
		System.out.println(result);
		
		
		
		
	}
	
	
	
	
	

}
