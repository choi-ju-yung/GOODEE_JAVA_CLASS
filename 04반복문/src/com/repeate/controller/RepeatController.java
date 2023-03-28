package com.repeate.controller;
import java.util.Scanner;
import java.util.Random;

public class RepeatController {
	// 기본 for문 이용하기
	// 특정코드는 원하는 만큼 반복실행하게 하는 명령어
	//for(초기식; 조건식; 증감식){반복할 코드를 작성}
	// 초기식 : 변수선언, 반복한 횟수에 대해 저장하는 공간
	// 조건식 : 반복을 더 실행할지 말지 결정하는 조건 (true 실행, false 중단)
	// 증감식 : 초기식에 선언한 변수의 값을 수정하는 연산 -> 조건식의 결과가 변경
	
	public void RepeatEx() {
		Scanner sc = new Scanner(System.in);
//		for(int i=1; i<=10; i++){
//			System.out.print(i+" ");
//		}
		
		// for문 {} 내부에는 변수선언, 연산자, 조건문 다 사용이 가능
		// {} 내부에서 선언한 것들은 내부에서만 사용이 가능함.
		
		
		// 1부터 100까지의 수를 출력하기
		// 1부터 100까지의 수에서 짝수만 출력하기
		
		for(int j=1; j<=100; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		
		for(int j=1; j<=100; j++) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		
		
		
		// 100 ~ 1 까지 수 출력하기 (1)
		for(int j=100; j>=1; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		
		// 100 ~ 1 까지 수 출력하기 (2)
		int count = 100;
		for(int j=1; j<=100; j++) {
			System.out.print((count--) + " ");
		}
		System.out.println();
		
		
		// 친구 5명의 이름을 입력받고 출력하기
		
//		String friend = "";
//		for(int i=1; i<=5; i++) {
//			System.out.print(i+"번 친구 입력 : ");
//			friend += sc.next() + " ";
//		}
//		System.out.println(friend);
		
		
		
		// 숫자 4개를 입력받아 총합을 구하는 기능 구현하기
//		int sum = 0;
//		for(int i=1; i<=5; i++){
//			System.out.print(i+"번 숫자 입력 : ");
//			sum += sc.nextInt();
//		}
//		System.out.println("총 합계는 : " + sum);
		
		
		
		// for문은 초기식, 조건식, 증감식을 반드시 안써도됨
//		count = 0;
//		for(; count<10; count++) {
//			System.out.println(count);
//		}
		
		
//		for(; ; count++) {
//			System.out.println(count);
//		}

		


		// 사용자에게 메시지를 입력받고 출력하는 기능
		// 사용자가 "끝" 이라는 메시지를 입력할때까지 입력을 받고
		// 입력받은 내용 모두 출력하기 단, 끝메시지는 포함하지 않기!
		
//		String sub_msg = "";
//		String msg = "";
//		for(; !msg.equals("끝");) {
//			sub_msg += msg;
//			System.out.print("메세지 입력 : ");
//			msg = sc.next();
//		}
//	
//		System.out.println(sub_msg);
		
	}
	
	// 여기부터 3월 7일
	// for문 응용하기
	public void forApplication() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print(i+" ");
		}
	}
	
	
	
	// 사원정보를 입력받는 기능을 구현하자
	// 입력정보 : 이름, 나이, 성별, 급여, 보너스(소수점)
	// 입력한 정보를 한번에 출력
	// public void empInputData();
	// 버전업 입력전에 입력할 사원수를 입력받고 그 수만큼 입력 후 출력하기
	public void empInputData() {
		Scanner sc = new Scanner(System.in);
		
		String empInfo = "";
		System.out.print("입력할 사원 수 : ");
		int people = sc.nextInt();
		
		
		for(int i=1; i<=people; i++) {
			System.out.println("===== "+(i+1)+"번 사원정보등록 =====");
			System.out.print("이름 : ");
			sc.nextLine();// 밑에 nextLine(); 작업을 위해 버퍼를 비워줌
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("보너스 : ");
			double bonus = sc.nextDouble();  
			empInfo += name+" "+age+" "+gender+" "+salary+" "+bonus+"\n";
		}
		System.out.println(empInfo);
	}
	
	
	
	
	public void forApplication2() {
		// 숫자에 규칙이 있는 경우에 for문의 초기값을 활용할 수 있다.
//		String msg = "안녕하세요 화요일이에요";
//
//		for(int i=0; i<msg.length(); i++) {
//			System.out.print(msg.charAt(i)+" ");
//		}
		
		
		// 입력받은 문자에 알파벳 대문자가 포함되어있는지 확인하는 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
	    String alpha = sc.nextLine();
	    
	    for(int i=0; i<alpha.length(); i++) {
	    	if(alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z') {
	    		System.out.println(i+1+"번째 알파벳에 대문자가 포함되어 있습니다.");
	    	}
	    }
	}

	// 입력받은 문자열에 대문자와 소문자의 수를 구하는 기능
	// 문자열, 문자를 입력받아 문자열에 문자가 몇개 포함되어있는지 확인하는 기능
	
	
	public void forInfor() {
		// 중첩반복문 for문 내부에 for문이 있는 로직
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.println(j+" ");
//			}
//			System.out.println();
//		}
//	}
	

	
	// 구구단 출력하기
	// 2단부터 9단 구구단 출력하기
//	for(int i=2; i<=10; i++) {
//		for(int j=1; j<=9; j++) {
//			System.out.print(i+" * "+j+" = "+i*j + "\t");
//		}
//		System.out.println();
//	 }
	
	

	// test변수에 저장된 문자열에 중복값이 있는지 확인하는 로직
//	String test = "apple";	
//	for(int i=0; i<test.length(); i++) {
//		int count = 0;
//		for(int j=0; j<test.length(); j++) {
//			if(i!=j && test.charAt(i) == test.charAt(j)) {
//				count++;
//			}
//		}
//		System.out.println(test.charAt(i)+"는 "+count+"개 반복");
//	}
	
	
	
	

		// 별찍기
//		for(int i=0; i<=3; i++)
//		{
//			for(int j=0; j<=3; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

		
//		for(int i=0; i<=3; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
   }
	
	
	
	public void whileTest() {
		// while 활용하기
		// 반복문을 구현하는 방법 중 하나
		// while(조건문) {반복실행 코드};
		// 특정조건에서 반복문을 실행할 때 많이
		
		// 사용자가 끝이라고 입력할 때 까지 입력받는 기능
		Scanner sc = new Scanner(System.in);
//		String m = "";
//		String total = "";
//		
//		while(!m.equals("끝")){
//			System.out.print("메시지 입력 : ");
//			m = sc.nextLine();
//			if(!m.equals("끝")) {
//				total += m;
//			}
//		}
//		System.out.println(total);
		
		
		
		// 메뉴기능 구현할 때
//		int menu = 0;
//		while(menu!=9) {
//			System.out.println("===== BS Lunch =====");
//			System.out.println("1. 햄버거");
//			System.out.println("2. 피자");
//			System.out.println("3. 치킨");
//			System.out.println("4. 탕수육");
//			System.out.println("5. 순대국");
//			System.out.println("9. 주문종료");
//			System.out.print("입력 : ");
//			menu = sc.nextInt();
//		}
	}
	
	
	
	// 계속 계산할 수 있는 계산기 프로그램 만들기
	// public void whileCalculator()
	// 두개의 정수, 연산자를 입력받아 계산해주는 기능
	// 계산이 끝나면 계속하시겠습니까? 문구 출력 후
	// Y를 선택하면 한번 더 실행, N선택하면 프로그램을 종료합니다 출력 후 종료
	
	
	public void whileCalculator() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력 : ");
			char oper = sc.next().charAt(0);
			
			switch(oper) {
				case '+' : System.out.println(num1 + " " + num2 + " = " + num1+num2 );break;
				case '-' : System.out.println(num1 + " " + num2 + " = " + (num1-num2) );break;
				case '*' : System.out.println(num1 + " " + num2 + " = " + num1*num2 );break;
				case '/' : System.out.println(num1 + " " + num2 + " = " + num1/num2 );break;
				case '%' : System.out.println(num1 + " " + num2 + " = " + num1%num2 );break;
				default : System.out.println("연산자를 다시 입력해주세요"); break; 
			}
			
			System.out.print("계속하시겠습니까? : ");
			char answer = sc.next().charAt(0);
			
			while(answer != 'Y' && answer != 'N')
			{
			if(answer == 'Y') {
				
			}
			else if(answer == 'N') {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("종료합니다.");
			}
		}
	}
	}
	
	
	
	public void continueBreakTest() {
		// 분기문 활용하기
		// continue : 반복문에서 continue문을 만나면 아래코드를 생략하고 증감식으로 넘어감
		// break : 반복문에서 break문을 만나면 끝
		// 특정조건에서 반복문의 실행을 통제하기 위해 사용
//		Scanner sc = new Scanner(System.in);
//		int scount = 0;
//		int bcount = 0;
//		
//		System.out.print("문자열 입력 : ");
//		String alpha = sc.next();
//		
//		for(int i=0; i<alpha.length(); i++) {
//			if(alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z') {
//				bcount+=1;
//			}
//			
//			if(alpha.charAt(i) >= 'a' && alpha.charAt(i) <= 'z') {
//				scount+=1;
//			}
//		}
		
//		
//		System.out.println(alpha+"의 대문자의 개수는 : "+bcount);
//		System.out.println(alpha+"의 소문자의 개수는 : "+scount);
//	}
		
		
		
		
		// 중첩반복문에서 이용하기
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				if(i%2==0)break;  // 반복문을 종료해야할 때 사용
//				System.out.print(i+"X"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
		
		
		

		// continue
//		for(int i=0; i<10; i++) {
//			if(i%2==0)continue; // 아래문장 실행하지않고 다시 위의 증감식으로 감
//			System.out.println(i);
//		}
		
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i%2==0)continue;
				System.out.print(i+"X"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
	
	
	
	// 자바에서 랜덤값을 출력하기
	// 숫자로 출력 -> 임의의 실수(0~1)
	public void randomTest() {
		//임의의 난수 출력하기
		//1. Math.random() 기능이용
		//2. Random 클래스를 이용하는 방법
		
//		for(int i=0; i<3; i++) {
//			System.out.println((int)(Math.random() * 10));
//		}
		
		// Math.random()*10 -> 0 ~ 9
	    // Math.random()*10+1 -> 1 ~ 10
		
		// 1 ~ 10까지의 무작위 수 5개 출력하기
//		for(int i=0; i<5; i++) {
//			System.out.println((int)(Math.random()*10+1));
//		}
		
		
		
		// Random 클래스
		// java.util.Random 클래스  
		// 범위 = int의 전 범위
//		Random r = new Random();
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt(10)); // 0~9
//		System.out.println(r.nextInt(100)); // 0~99
//		System.out.println(r.nextBoolean()); // true  or  false
	}
	
}
