package com.inherit.controller;

import com.inherit.model.vo.BasicTest;
import com.inherit.model.vo.OverrideChild;
import com.inherit.model.vo.Parent;
import com.inherit.model.vo.Person;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheriteController extends Parent{
	
	public void basicInheritTest() {
		// 기본 상속에 대해 알아보자
		// 1. 모든 클래스는 Object 클래스를 상속받았다.
		// * 별도 선언코드가 없어도 상속받음
		
		BasicTest bt = new BasicTest();
		bt.equals("test"); // Objcet 클래스의 함수들을 사용할 수 있음
		bt.hashCode(); // Objcet 클래스의 함수들을 사용할 수 있음
		
		
		// 클래스에 상속관계 설정하기
		// 상속 : 두개의 클래스간의 부모(super), 자식(sub), 관계를 설정
		// 방법 : 클래스 선언부 extends 예약어를 사용
		// 예시 : public class Test(자식,subclass) extends SuperTest(부모,superclass){클래스 선언부};
		// SuperTest 클래스에 선언된 내용을 Test가 가져와 쓰는 것
		
		BasicTest bt2 = new BasicTest();
		bt2.setTitle("처음 상속해봄"); // BasicTest 클래스에 아무것도 없지만
		System.out.println(bt2.getTitle()); // Parent 클래스를 상속받았기 때문에 사용가능
		
		bt2.setNumber(100);
		System.out.println(bt2.getNumber());
		
		System.out.println(bt2.infoBaiscTest());
		double test = weight; // protected는 상속받은 필드들을 사용할 수 있음
		
		// 매개변수 있는 생성자로 생성하기
		BasicTest bt3 = new BasicTest("생성자",100,65.5);
		System.out.println(bt3.infoBaiscTest());
		
		// 학생 2명 저장하기
		// 최주영, 26, 남, 010111, 경기도 안양시, 공공데이터, 선생을 갈굼, 상
		// 정상준, 26, 남, 010222, 서울시 구로구, 공공데이터, 힘들어함, 중
		
		// 선생 1명
		// 유병승, 19, 남, 0101234, 경기도 시흥시, 웹프로그래밍, 100, 100
		
		// 직원
		// 홍길동, 20, 남, 010555, 강원도 산골, 행정팀, 50, 10
		
		Student joo = new Student();
		joo.setName("최주영");  // 부모 클래스의 함수 상속받아서 사용가능
		joo.setAge(26); // student 클래스는 Person 클래스를 상속받아서 Person의 함수 사용가능
		joo.setGender('남');
		joo.setPhone("010111");
		joo.setAddress("경기도 안양시");
		joo.setJoinClass("공공데이터");
		joo.setIssue("선생을 갈굼");
		joo.setLevel('상');
		
		System.out.println(joo.getName()+" "+joo.getAge()+" "+joo.getGender()+" "+
				joo.getPhone()+" "+joo.getAddress()+" "+joo.getJoinClass()+" "+
				joo.getIssue()+" "+joo.getLevel());
		
		Student sang = new Student("정상준",26,'남',"010222","서울시 구로구",
				"공공데이터","힘들어함",'중');
		System.out.println(sang.infoStudent());
		
		Teacher t = new Teacher("유병승",19,'남',"0101234","경기도 시흥시","웹프"
				+ "","더움",'중');
		
		System.out.println(t.infoTeacher());
	}
	
	
	
	public void overrideTest() {
		// 메소드를 재정의
		// 조건 : 클래스가 상속관계일때 부모클래스에 선언된 메소드를 자식클래스가 재정의하는것
		OverrideChild oc = new OverrideChild();
		
		oc.printMsg();
		
		
//		Teacher t = new Teacher();
//		Student s = new Student();
//		System.out.println(t.info());
//		Person p = new Person();
//		p.info(); // Perosn 클래스의 함수 호출
//		p = t;
//		p.info(); // Teacher 클래스의 함수 호출 
//		p=s;
//		p.info(); // Student 클래스의 함수 호출
		
		// Object 클래스의 메소드를 재정의해서 사용
		// equals : 객체간의 동등성 비교를 하기 위해 선언한 메소드 
		// hashCode : 객체의 유일한 값을 정수로 출력(주소) 
		// toString : 생성된 객체의 대표하는 문자를 반환(필드의 값을 반환)
		// clone : 생성된 객체를 복사해주는 기능
		
		
		// equals 재정의하기 (다형성)
		Student s1 = new Student("최주영",26,'남',"010111","경기도 안양시","공공 데이터"
				,"선생을 갈굼",'남');
		
		Student s2 = new Student("최주영",26,'남',"010111","경기도 안양시","공공 데이터"
				,"선생을 갈굼",'남');
		
		Student s3 = new Student("정상준",26,'남',"010111","경기도 안양시","공공 데이터"
				,"선생을 갈굼",'남');
		
		
		System.out.println(s1 == s2); // false가 나옴 new할때마다 새로운 공간이 만들어지기때문에
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		
	
//		BasicTest bt = new BasicTest("test",100,10.5);
//		BasicTest bt2 = new BasicTest("test",100,10.5);
		
		// toString 메소드 오버라이딩
		// 생성된 객체의 정보를 출력해주는 기능을 하는 메소드
		// 클래스에 toString이 오버라이딩 되어있으면 변수명을 출력했을 때
		// 자동으로 toString() 메소드를 호출하여 지정된 정보를 출력한다.
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		//hashCode 재정의
		// 객체를 지정하는 정수값을 출력해주는 함수
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		//clone : 객체복사 메소드
		// 깊은복사를 구현
		Student copyStudent = s1.clone();
		System.out.println(copyStudent);
		copyStudent.setAge(50);
		System.out.println(copyStudent);
		
		
		
		
		// Teacher 
		// t = 유병승, 20, 여, 0101122, 경기도 광명시, 웹프로그래밍, 10, 100
		// t1 = 유병승, 19, 여, 0101122, 경기도 과천시, 웹프로그래밍, 5, 80
		// t3 = 유병승, 20, 여, 0101122, 경기도 이천시, 웹프로그래밍, 10, 100
		// 세 객체를 모두 비교해서 같은 객체와 다른 객체를 구분하시오
		// 조건 : 이름, 나이, 과목, 경력이 동일하면 같은 객체
		// 모든 객체의 정보를 변수를 이용해서 출력하기;
		
		Teacher t1 = new Teacher("유병승",20,'여',"0101122","경기도 광명시",
				"웹프로그래밍","10",100);
		
		Teacher t2 = new Teacher("유병승",19,'여',"0101122","경기도 광명시",
				"웹프로그래밍","5",100);
		
		Teacher t3 = new Teacher("유병승",20,'여',"0101122","경기도 광명시",
				"웹프로그래밍","10",100);
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	}

	

	
	
	
	
	// StudentManage 업데이트
	// 1.저장된 학생과 동일한 학생은 저장하지 않는다.
	// 2.출력시 infoStudent를 변수로 대체하기

	
	
}

