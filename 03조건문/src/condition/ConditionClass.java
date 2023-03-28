package condition;

import java.util.Scanner;

public class ConditionClass {
	
	
	public void ifTest(){
		// 기본 if문 활용
		// if(조건식(true || false)
		// if의 {}안에 변수선언, 연산자, 메소드호출, 조건문, 반복문 사용
//		if (100 > 10){
//			System.out.println("hi");
//		}
		
		
		// 특정수를 입력받아 200을 입력하면 200을 입력했군요! 출력	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num == 200) {
//			System.out.println("200을 입력했군요!");
//		}
		
		
		
		// 입력받은 정수가 100~200사이면 정상데이터를 입력했습니다 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int number = sc.nextInt();
//		if(number >= 100 && number <=200) {
//			System.out.println("정상데이터를 입력했습니다.");
//		}	
		
		
		
		// if문의 중괄호에서 선언된 변수활용하기
		// 1. if문 외부에 선언된 변수 활용 -> if문에서 활용가능, if문 외부에서도 사용가능
		// 2. if문 내부에 선언된 변수 활용 -> if문에서 활용이가능, if 외부에서 활용이 불가능
		
		String outterData = "if외부 선언 데이터";
		if(10 > 0) {
			String innerData = "if분 내부선언 데이터";
			System.out.println(outterData);
			System.out.println(innerData);
			outterData+="if에서 추가한 내용";
			
			// 외부에 선언된 변수와 동일한 명칭을 사용할 수 없다
			//int outterData = 20;
		}
		System.out.println(outterData);
	}

	
	// 입력받은 값이 5의 배수인지 확인하는 기능 구현
	// 입력값이 5의 배수면 "5의 배수입니다" 출력
	// public void checkNumber()
	public void checkNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
	

		if(number % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}
	
	
	
	// 이름을 입력받고 본인이름과 같으면 코딩천재!! 문구 출력
	// public void testName();
	public void testName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		if(name.equals("최주영")) {
			System.out.println("코딩천재!!");
		}
	}
	
	
	
	// 아이디와 패스워드를 입력받고 아이디가 admin, 패스워드가 8888이면
	// 로그인 성공 출력
	// public void logincheck()
	public void logincheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("패스워드 입력 : ");
		String pass = sc.nextLine();
		
		if((id.equals("admin")) && (pass.equals("8888"))) {
			System.out.println("로그인 성공");
		}
	}
	
	
	
	public void ifelseTest() {
		// if~else문 이용하기 (삼항연산자와 처리와 비슷)
		// 조건에 따라 반드시 한개 로직이 실행되는 구문을 작성할 때
		// if절이나 else절에 있는 구문이 반드시 실행
		// 특정수를 입력받아 그 수가 양수인지 음수인지 확인해주는 로직
		// if~else문은 한개그룹임, else만 단독으로 사용 불가능
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int su = sc.nextInt();
		if(su > 0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}		
	}
	
	
	// 수를 입력받고 그 수가 짝수인지 홀수인지 확인하는 기능
	public void oddeven() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
	
	
	// 미성년이면 회원가입이 불가능하고, 성년이면 회원가입 정보를 입력받는 기능 구현
	// 성년인 경우 회원정보 이름, 나이, 성별, 키를 입력받고 출력
	// 미성년일경우 회원가입이 불가능합니다 출력
	// public void enrollMember()
	public void enrollMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성년입니까? (네, 아니오) 둘중 하나 입력 : ");
		String answer = sc.nextLine();
		
		if(answer.equals("네")) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("성별 : "+gender);
			System.out.println("키 : "+height);
			
		}else {
			System.out.println("회원가입이 불가능합니다.");
		}
	}
	
	
	public void ifelseifTest() {
		// if~else  if~else  if......  ~ [else]문 활욯하기
		// 조건이 여러개일때 사용하는 조건문
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		// 1,2,12월이면 -> 겨울
		// 3~5월이면 -> 봄
		// 6~8월이면 -> 여름
		// 9~11월이면 -> 가을
		
		if(month==1 || month==2 || month==12) {
			System.out.println("겨울이야~ 겨울잠자자");
		}else if(month>=3 && month <=5) {
			System.out.println("봄이야~ 꽃구경가자!!");
		}else if(month>=6 && month <=8) {
			System.out.println("여름이야~ 바다가자!!");
		}else if(month>=9 && month <=11) {
			System.out.println("가을이야 단풍놀이가자");
		}else {
			System.out.println("없는 달을 입력했습니다. 1~12까지 입력해주세요");
		}
		
		
		
		//성적듭급 출력 프로그램 만들기
		//점수를 입력받아 그 점수가 90점 이상이면 A
		//90미만 80점 이상이면 B
		//80미만 70점 이상이면 C
		//70미만 60점 이상이면 D
		//그 외는 F를 출력하는 기능
		//등급과 점수를 모두 출력하기
		//00점은 0등급입니다! 출력
		char rank;
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		if(score > 100) {
			rank = 'X';
		}else if(score >= 90) {
			rank = 'A';
		}else if(score >= 80) {
			rank = 'B';
		}else if(score >= 70) {
			rank = 'C';
		}else if(score >= 60) {
			rank = 'D';
		}else {
			rank = 'F';
		}
		
		if (rank == 'X') {
			System.out.println("0~100점 사이의 점수를 입력해주세요");
		}else {
			System.out.println(score+"점은 "+rank+"등급입니다!");	
		}
		
		
		// 메뉴선택 기능 구현하기
		// 술주천 기능
		// 1. 맥주 -> 좋은 맥주를 추천 (기네스가 맛있어요)
		// 2. 와인 -> 피노누아가 맛있어요
		// 3. 위스키 -> 발렌타인 21년산 먹고싶어요
		// 4. 막걸리 -> 장수막걸리가 맛있어요
		
		System.out.println("술추천 기능");
		System.out.println("1. 맥주");
		System.out.println("2. 와인");
		System.out.println("3. 위스키");
		System.out.println("4. 막걸리");
		System.out.print("원하시는 번호를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number == 1) {
			System.out.println("기네스가 맛있어요");
		}else if(number == 2) {
			System.out.println("피노누아가 맛있어요");
		}else if(number == 3) {
			System.out.println("발렌타인 21년산 먹고싶어요");
		}else if(number == 4) {
			System.out.println("장수막걸리가 맛있어요");
		}else {
			System.out.println("1~4번 중 하나를 입력하세요");
		}
		
	}
	
	
	public void switchTest() {
		//switch문 활용하기
		//정해진 값에 대해서 분기처리할때 사용하는 조건문
		//메뉴기능을 구현할 때 많이 사용함
		// switch문의 ()안에는 변수, 변수의 연산결과를 작성
		// int, String, char 자료형만 가능
		// switch문의 ()안에는 double형 boolean형을 넣을 수 없음
//		Scanner sc = new Scanner(System.in);
//		System.out.println("==== 점심메뉴 ====");
//		System.out.println("1. 윤쉐프");
//		System.out.println("2. 중국집");
//		System.out.println("3. 삼계탕");
//		System.out.println("4. 육개장");
//		System.out.print("선택 : ");
//		int choice = sc.nextInt();
//		
//		switch(choice) {
//		case 1 : System.out.println("구내식당 중 가장 맛있데요");
//					break;
//		case 2:  System.out.println("BYC건물 쌍용중국집이 먹을만해요!");
//		            break;
//		case 3:  System.out.println("BYC건물 가산삼계탕이 먹을만해요!");
//					break;
//		case 4:  System.out.println("이화수육개장이 먹을만해요!");
//					break;
//		default: System.out.println("1~4번 중 하나를 선택하세요");
//		}	
		
		
		// break가 실행되지 않으면 조건을 여러개를 넣을 수 있음 ex) 
		//case 1 : System.out.println("첫번째 조건과");
		//case 2 : System.out.println("두번째 조건이 한번에 되네");
	
		
		
		// char 이용
//		System.out.println("===byc 중국집 ===");
//		System.out.println("가. 짜장면");
//		System.out.println("나. 짬뽕");
//		System.out.println("다. 탕수육");
//		char ch = sc.next().charAt(0);
//		switch(ch) {
//			case '가' : System.out.println("자장면 선택");
//					break;
//			case '나' : System.out.println("짬뽕 선택");
//					break;
//			case '다' : System.out.println("탕수육 선택");
//					break;
//		}
		
		
		// String 이용하기
//		System.out.println("=== 문자열 이용하기 ===")
//		System.out.println("당신의 취미는(운동, 노래, 영화감상) : ");
//		String hobby = sc.next();
//		switch(hobby) {
//				case "운동" : System.out.println("운동을 하면 건강해져요!");
//					break;
//				case "노래" : System.out.println("노래 잘하나요?");
//					break;
//		}
		
		
//		switch(choice % 5) {	// 연산의 결과를 할 수 있음
//			case 0 :
//			case 1:
//			case 2 :
//			case 3 :
//		}
	}
	
	
	//분식집 주문 프로그램 만들기
	// 떡볶이(3000), 순대(2500), 튀김(3000), 김밥(3500), 라면(3500)
	// 선택하면 주문한 메뉴 이름과 금액을 출력하기
	// 떡볶이를 고르셨습니다... 3000원 내세요!!
	// 없는 것을 고르면 잘못 고르셨습니다. 숫자로 하세요!
	
	public void kosk() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 분식집 주문 프로그램 ====");
		System.out.println("1. 떡볶이 : 3000원");
		System.out.println("2. 순대 : 2500원");
		System.out.println("3. 튀김 : 3000원");
		System.out.println("4. 김밥 : 3500원");
		System.out.println("5. 라면 : 3500원");
		
		System.out.print("식사하실 메뉴를 선택하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";
		int price = 0;
		
		switch(num) {
				case 1 : menu="떡볶이"; price = 3000; 
					break;
				case 2 : menu="순대"; price = 2500; 
					break;
				case 3 : menu="튀김"; price = 3000; 
					break;
				case 4 : menu="김밥"; price = 3500; 
					break;
				case 5 : menu="라면"; price = 3500; 
					break;
				default : System.out.println("잘못 고르셨습니다.");
		}
		
		System.out.println("당신이 선택한 메뉴는 "+menu+"이고 결제할 금액은 "+price+"원 입니다.");
	}
	
	
	
	public void ex_test() {
		
		boolean flag = false; // 성인을 구별해주는 플래그
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
	
		if(age >= 20 && age <= 1000)
		{
			age = 2;  // 성인일경우 case 2로 넘어감
		}else {
			age = 1; // 미성년자일 경우 case 1로 넘어감
		}
		
		switch(age) {
		
		case 1: // 미성년자일 경우
			System.out.println("미성년자 이므로 회원가입이 불가능합니다"); 
			break;
		case 2 :
			flag = true;  // 성인일 경우 flag
			break;
		default: // 잘못 입력했을 경우
			System.out.println("잘못 누르셨습니다.");
		}
		
		if(flag == true) { // 성인일 경우
			System.out.print("내국인 or 외국인 입력 : ");
			String foreignerLocal = sc.next();
			if(foreignerLocal.equals("내국인")) // 내국인일 경우
			{
				System.out.println("===회원가입 창===");
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("주소 입력 : ");
				String address = sc.next();
				System.out.println("회원가입이 정상적으로 등록되었습니다.");
			}
			else if(foreignerLocal.equals("외국인")){ // 외국인일 경우
				System.out.print("외국인 등록번호가 있으십니까? : (네 or 아니요)");
				String foreNum = sc.next();
				if(foreNum.equals("네")) {// 등록번호 있는 경우
					System.out.println("===회원가입 창===");
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("주소 입력 : ");
					String address = sc.next();
					System.out.println("회원가입이 정상적으로 등록되었습니다.");
				}
				else if(foreNum.equals("아니요")) { //등록번호 없는 경우
					System.out.println("외국인 등록번호가 없어서 회원 가입이 불가능합니다.");
				}
				else { // 잘못 입력했을 경우
					System.out.println("네 or 아니요 로만 입력해주세요");
				}
			}
			else { // 잘못 입력했을 경우
				System.out.println("외국인 or 내국인 둘 중 하나만 입력하세요.");
			}
		}
		
	}

}
