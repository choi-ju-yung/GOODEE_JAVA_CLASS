package com.api.controller;

import java.util.StringTokenizer;

import com.api.vo.model.Person;

public class StringApiController {
	// 자바에서 문자열에 대한 클래스는 3가지가 있음
	// String, StringBuffer, StringBuilder
	// String : 클래스지만, 기본자료형처럼 사용하게 설정되어있음
	// StringBuffer, StringBuilder : 클래스 사용방식으로 문자열을 다룰수 있음
	// String은 불변의 문자열 -> 수정이 불가능함
	// StringBuffer, StringBuilder : 가변의 문자열 -> 수정이 가능함
	
	public static void main(String[] args) {
		String str = "유병승";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("유병승"); // 클래스 사용방식인 new로만 만들어야함
		System.out.println(sb); // toString 이 오버라이딩 되있어서 변수자체 출력시 값이 나옴
		System.out.println("str 수정전 : " + str.hashCode()); // 최초의 str의 주소값 출력
		
		// String은 불변!
		str += " 선생님"; // str 저장공간이 따로 생김
		System.out.println(str); 
		System.out.println("str 수정후 : " +str.hashCode()); // 위 주소값과 다르게나옴
		
		
		//StringBuffer의 데이터를 수젛아려면 제공하는 메소드를 이용해야한다.
		System.out.println("sb 수정전 : " + str.hashCode()); // 최초의 str의 주소값 출력
		sb.append(" 선생님");
		System.out.println(sb);
		System.out.println("sb 수정후 : " + str.hashCode()); // 최초의 str의 주소값 출력
		
		
		// String 클래스가 제공하는 유용한 메소드
		// 1. String.concat("문자열값") : 두개의 문자열을 합쳐주는 메소드
		String test = "GDJ64";
		test = test.concat(" 아자아자 화이팅!"); // + 연산과 동일함
		System.out.println(test);
		
		// 2. String.contains("문자열") 
		// 문자열에 매개변수로 전달된 문자열이 포함되어있는지 확인해주는 기능
		// 반환형이 boolean 형임
		if(test.contains("64")) { 
			System.out.println("응 64포함됨");
		}
		
		
		// 3. int indexof("문자열")
		// 문자열에 매개변수로 전달된 문자가 있는지 확인하고 그 자리수(인덱스번호)를 반환해줌
		// 단독으로 사용하는 경우는 많이 없으며, 다른 메소드와 연결해서 많이 사용
		System.out.println(test.indexOf("팅"));
		System.out.println(test.indexOf("아자")); // 6
		System.out.println(test.indexOf("유병승")); // 해당 문자가 없을시 -1 리턴
		System.out.println(test.indexOf(".",5)); // 두번째 인수 : 해당 인덱스위치부터 찾음
		
		
		// 4. lastIndexof("문자열"); 
		// 뒤에서부터 해당 문자열을 찾아 인덱스 번호를 반환해줌
		// 파일명 date.txt, test.exe 파일들 찾을 때 사용
		test = "date.test.exe";
		System.out.println(test.lastIndexOf(".")); // 9
		System.out.println(test.indexOf(".",test.indexOf(".")+1));
		
		
		// 4. String[] split(String)
		// 특정구분자(기호)로 구분할 수 있는 문자열을 구분해서 배열로 만드는 것
		test="유병승,19,경기도시흥시,남";
		String[] result = test.split(","); // 문자열을 ,로 분리해서 분리한 것들을 배열로 만듬
		for(String d : result) {
			System.out.print(d+" ");
		}
		System.out.println();
		
	
		test = "유병승,19,경기도시흥시,남\n최솔,29,경기도안양시,여"
				+ "\n김현영,26,서울시구로구,여";
		String[] persons = test.split("\n");
		Person[] personObj = new Person[persons.length];
		int i = 0;
		for(String p : persons) {
			String[] person = p.split(",");
			Person pobj = new Person(person[0], Integer.parseInt(person[1]), 
					person[2],person[3].charAt(0));
			personObj[i++] = pobj;
			System.out.println("이름 : "+person[0]);
			System.out.println("나이 : "+person[1]);
			System.out.println("주소 : "+person[2]);
			System.out.println("성별 : "+person[3]);
		}
		
			
		// 5. String replace("찾을값","대체할값");
		// 특정 문구를 대체문구로 교체하는 것
		test = "나는 코딩을 정말 못해!";
		String testStr = test.replace("못해", "잘해");
		System.out.println(test); // 원본값
		System.out.println(testStr); // 수정값
		
		
		
		// 6. String String.join("구분자",배열)
		// 배열을 특정 구분자로 문자열로 만들어줌
		String[] testArr = {"유병승","윤지환","윤준호","윤나라","나빈"};
		test = String.join("->", testArr);
		System.out.println(test);
		
		
		
		// 7. String substring(시작인덱스번호[,끝인덱스번호])
		// 시작인덱스부터 끝인덱스까지 문자열을 잘라내는 기능
		test = "수업좀 잘하세요";
		testStr = test.substring(4);  // 4번인덱스부터 끝까지 자름
		System.out.println(testStr); // 잘하세요
		testStr = test.substring(2,4); // 2번째부터 3번째까지 자름
		System.out.println(testStr); // 좀
		testStr = test.substring(test.indexOf("잘"));
		System.out.println(testStr); // 잘하세요
		test = "test.png";
		testStr = test.substring(test.indexOf(".")+1);
		System.out.println(testStr);  // png
		testStr = test.substring(0,test.indexOf("."));
		System.out.println(testStr); // test
		
		
		
		
		// 8. toUppercase() / toLowerCase()
		test = "AbcDefg";
		testStr = test.toUpperCase(); // 영문자를 다 대문자로 바꿈
		System.out.println(testStr);
		testStr = test.toLowerCase(); // 영문자를 다 소문자로 바꿈
		System.out.println(testStr);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("게속하시겠습니까? (y/n) ");
//		String cho = sc.next();
//		if(cho.toLowerCase().equals("y")) { // 입력받은값은 무조건 소문자로
//			System.out.println("계속하자");
//		}else if(cho.toLowerCase().equals("n")) {
//			System.out.println("중단하자");
//		}
		
		
		
		
		// 9. String trim()
		// 문자열의 양쪽 공백을 제거해주는 메소드
		test = "       안녕하세요";
		System.out.println(test);
		testStr = test.trim();
		System.out.println(testStr);
		
		
		
		// 10. valueOf()
		// 기본 자료형을 String으로 변환해주는 기능
		int age = 19;
		// test = (String)age;  // 불가능함		
		
		test = String.valueOf(age);
		System.out.println(test);
		test=String.valueOf(180.5);
		System.out.println(test);
		
		
		
		
		
		//StringBuffer 이용하기
		// 데이터를 수정, 저장하기  * 원본값을 수정함.
		// 1. append("문자열") : 문자열을 추가하는 메소드
		StringBuffer testSb = new StringBuffer();
		System.out.println(testSb);
		System.out.println(testSb.length());
		testSb.append("여러분 한시간 남았어요!");
		System.out.println(testSb);
		System.out.println(testSb.length());
		testSb.append(" 우리 힘냅시다! 보강은 어떻게 할까요?");
		System.out.println(testSb);
		System.out.println(testSb.length());
		
		
		// 2. insert(인덱스번호, 문구)
		// 특정위치의 문구를 추가하는 것
		testSb.insert(3, "곧");
		System.out.println(testSb);
		testSb.insert(testSb.indexOf("!"), "????"); // !위치 자리에 ????를 넣음
		System.out.println(testSb);
		
		
		// 3. delete(시작인덱스, 끝인덱스)
		// 해당 위치에 있는 값을 삭제
		testSb.delete(3, 5); // 3번째부터 4번째인덱스에 있는 값들 삭제
		System.out.println(testSb);
		testSb.delete(0, 3);
		System.out.println(testSb);
		
		
		// 4. deleteCharAt()
		// 한글자만 삭제하는 기능
		testSb.deleteCharAt(1);  // 1번째 인덱스 삭제
		System.out.println(testSb);
		
		
		// 5. setCharAt(인덱스번호, "수정할문자")
		// 해당인덱스번호의 문자를 수정
		testSb.setCharAt(1, '공'); // 1번째 인덱스 번호의 문자를 수정
		System.out.println(testSb);
	
		
		// 6. length() 문자열의 길이를 출력
		System.out.println(testSb.length());
		
		//String에서 제공하는 유사한 메소드를 제공
		//substring, indexOf, replace 등
		String result1 = testSb.substring(5);
		System.out.println(result1);
		
		//replace(시작번호, 끝번호, "변경할문구") // 원본값을 수정해버림
		testSb.replace(0, 3, "여러분 힘내요");
		System.out.println(testSb);
		
		
		testSb.reverse(); // 문자열을 반전해줌
		System.out.println(testSb);
		testSb.reverse(); // 문자열을 반전해줌
		System.out.println(testSb);
		
		
		// StringBuilder -> StringBuilder과 동일하지만 스레드세이프티 기능을 제공하지않음
		StringBuilder testSb2 = new StringBuilder();
		testSb2.append("테스트");
		System.out.println(testSb2);
		
		
		
		// String과 StringBuffer의 호환성
		System.out.println(testSb);
		//test = testSb // 불가능 
		test = new String(testSb); // 왼쪽타입에 맞게 형변환해줌
		testSb = new StringBuffer(test); // 왼쪽타입에 맞게 형변환해줌 
		
		
		
		// StringTokenizer 클래스 이용하기
		// String에서 제공하는 split() 메소드와 유사한 기능
		// import 해야함 
		test = "유병승,최주영,이동제,최인호,최하리";
		String test0 = "java,oracle,html/css/javascript/jquery,servlet/jsp";
		StringTokenizer st = new StringTokenizer(test0,",/"); // ,와 / 둘다 구분해줌
		StringTokenizer st1 = new StringTokenizer(test,",");
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
//		
		
		while(st.hasMoreElements()) { // 요소가 없을 때 까지 출력
			System.out.println(st.nextElement());
		}
		

		while(st1.hasMoreTokens()) { // 요소가 없을 때 까지 출력
			System.out.println(st1.nextToken()); // nextToken은 값을 받아서 변수에 저장해야함
		}
		
		
		
	}
}
