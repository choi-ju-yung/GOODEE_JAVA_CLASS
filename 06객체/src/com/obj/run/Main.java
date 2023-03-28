package com.obj.run;
import com.obj.basicController.BaseballPlayer;
import com.obj.basicController.BasicTestClass;
import com.obj.basicController.FieldTestClass;
import com.obj.model.vo.Student;


public class Main {

	public static void main(String[] args) {
		// 프로젝트 내부에 선언된 클래스는 반드시 생성해야지만 이용이 가능
		// 클래스를 생성하는 방법
		// new 연산자를 이용해서 생성한다.
		// new 클래스명()  <--- 기본 클래스 생성하는 방법(default생성)
		
		
		// 클래스 선언부에 있는 접근 제한자에 따라 생성해서 이용할 수 있는
		// 범위가 달라진다.
		
		// BasicTestClass 생성하기
		new BasicTestClass();
		
		
		//DefaultTestClass 생성하기
		//new DefualtTestClass();  // (not visible 이라는 문구 뜨면서 오류 남) = 의도적으로 막아놈
		// default 접근 제한자는 같은 패키지 내에서만 사용이 가능한 클래스
		
		
		// 프로젝트내에 선언된 클래스명은 하나의 자료형으로 사용한다.
		// 참조형 자료형이라고 한다. (Refference type)
		// 클래스를 저장하는 변수를 만들 수 있다.
		BasicTestClass btc; // 클래스를 생성한 객체를 저장하는 변수를 선언
		btc = new BasicTestClass();
		
		
		// 클래스에 선언된 필드(멤버변수) 이용하기
		// 클래스에 선언된 필드를 이용하려면 객체화(생성)해야한다.
		FieldTestClass ftc;
		ftc = new FieldTestClass();
		
		// 필드(멤버변수)에 접근하기
		System.out.println(ftc.age);  // ftc.age -> 직접접근
		// 필드에 값 대입하기
		ftc.age = 19;
		System.out.println(ftc.age);
		
		// default 접근 제한자를 사용한 필드 접근
		//System.out.println(ftc.name); //패키지가 다르기때문에 직접접근 불가능 
		
		
		// private 접근 제한자를 사용한 필드 접근
		//System.out.println(ftc.gender); //직접 접근 불가능
 		
		
		
		
		// 베이스볼 플레이어 만들기
		// 선수 3명을 만들기
	BaseballPlayer p1, p2, p3;
	p1 = new BaseballPlayer();  // 첫번째 선수 한명 생성
	p1.name = "박찬호";
	p1.age = 49;
	p1.mainhand="오른손";
	p1.number = 61;
	p1.position ="P";
	p1.accuracy = 70;
	p1.power = 100;
	
	// p1 야구플레이어 -> 박찬호의 정보들이 들어있음
	
	p2 = new BaseballPlayer(); // 두번째 선수 한명 생성
	p2.name = "이승엽";
	p2.age = 46;
	p2.mainhand="왼손잡이";
	p2.number = 36;
	p2.position = "1B";
	p2.accuracy = 70;
	p2.power = 100;
	
	
	System.out.println(p1.name+"의 나이는 "+p1.age+"이며, "+p1.mainhand+"잡이 입니다.");
    System.out.println("등번호는 "+p1.number+"이며, "+"포지션은 "+p1.position+"입니다.");
    System.out.println("정확도는 "+p1.accuracy+"이며, "+"파워는 "+p1.power+"입니다.");
    System.out.println();
	System.out.println(p2.name+"의 나이는 "+p2.age+"이며, "+p2.mainhand+"잡이 입니다.");
    System.out.println("등번호는 "+p2.number+"이며, "+"포지션은 "+p2.position+"입니다.");
    System.out.println("정확도는 "+p2.accuracy+"이며, "+"파워는 "+p2.power+"입니다.");
	
    
		
	// 학생정보를 저장하는 클래스를 선언하고 
    // -> com.obj.model.vo.Student
    // 이름 나이 학년 반 키 주소 저장
    // 모든 필드는 어디서든 접근할 수 있게 설정
    // 아래 학생을 등록 후 출력하기
    // 유병승 19 1 3 180.5 경기도시흥시
    // 홍길동 33 3 2 174.2 강원도 산골
    // 이순신 54 3 3 167.3 전라남도
    // 신사임당 45 2 1 152.3 강원도
	
	Student st1,st2,st3,st4;
	st1 = new Student();
	st2 = new Student();
	st3 = new Student();
	st4 = new Student();
	
	st1.name = "유병승";
	st1.age = 19;
	st1.fakeAge = 1;
	st1.cls = 3;
	st1.hegiht = 180.5;
	st1.address = "경기도 시흥시";
	
	st2.name = "홍길동";
	st2.age = 33;
	st2.fakeAge = 3;
	st2.cls = 2;
	st2.hegiht = 174.2;
	st2.address = "강원도 산골";
	
	st3.name = "이순신";
	st3.age = 54;
	st3.fakeAge = 3;
	st3.cls = 3;
	st3.hegiht = 167.3;
	st3.address = "전라남도";
	
	st4.name = "신사임당";
	st4.age = 45;
	st4.fakeAge = 2;
	st4.cls = 1;
	st4.hegiht = 152.3;
	st4.address = "강원도";
	
	System.out.println(st1.name+" "+st1.age+" "+st1.fakeAge+" "+
				st1.cls+" "+st1.hegiht+" "+st1.address+" ");
	System.out.println(st2.name+" "+st2.age+" "+st2.fakeAge+" "+
			st2.cls+" "+st2.hegiht+" "+st2.address+" ");
	System.out.println(st3.name+" "+st3.age+" "+st3.fakeAge+" "+
			st3.cls+" "+st3.hegiht+" "+st3.address+" ");
	System.out.println(st4.name+" "+st4.age+" "+st4.fakeAge+" "+
			st4.cls+" "+st4.hegiht+" "+st4.address+" ");


	
    // 필드로 선언된 변수는 new 연산자로 생성을 하면
	// 기본값으로 초기화된다. 초기부터 값을 대입하려면?? 필드에 대입연산자 사용
	
	
	// final 필드 접근하기
	System.out.println(ftc.HEIGTH);
	// final 필드는 수정이 불가능
	
	
	
	
	//final double height;
	//2. 초기화블록을 이용해서 필드를 초키화 할 수 있다.
	// 인스턴스 초기화 블록 -> 클래스를 생성(객체화)할때마다 실행
	// static 초기화 블록 -> 최초 생성할 때 한번만 실행!
	
	
	
	
		
	}
}
