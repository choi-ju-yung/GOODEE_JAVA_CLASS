package com.poly.controller;

import java.util.Scanner;

import com.poly.model.vo.AbstractChildClass;
import com.poly.model.vo.AbstractClassTest;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Chicken;
import com.poly.model.vo.Cow;
import com.poly.model.vo.Dog;
import com.poly.model.vo.DynamicBindTest;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.PolyTest;
import com.poly.model.vo.PolyTest2;
import com.poly.model.vo.PolyTestParent;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class PolyController {
	
	public void basicTest() {
		//다형성에 대해 알아보자
		//상속관계에 있는 클래스의 부모클래스타입으로 선언된 변수에는
		//자식 클래스 객체를 저장할 수 있게하는 기술
		PolyTestParent ptp = new PolyTestParent();
		
		// PolyTest 클래스와, PolyTestParent가 상속관계이면
		ptp = new PolyTest();   // 양쪽이 타입이 달라도 가능함
		ptp = new PolyTest2();  // 상속하는 부모가 같아서 가능
		
		
		Object o; // Object는 최상위 클래스이기때문에 모든 클래스 저장가능
		o = new PolyTestParent();
		o = new String("이것도 저장되니");
		o = new Scanner(System.in);
		
		
		
		// 자식클래스로 선언된 변수에는 부모클래스의 객체를 저장할 수 있을까?
		// 불가능 
		// 이유 : 자식클래스 안에 부모클래스의 것을 저장할 수 없다.
		PolyTest pt;
//		pt = new PolyTestParent();  
		
		
		
		// 부모타입에 저장된 자식클래스는 업캐스팅되어 저장되기 때문에
        // 자손클래스가 선언된 내용 (메소드, 변수)를 읽을 수 없다.
		ptp = new PolyTest();
		
		ptp.setParentData("부모 멤버에 저장");
		String temp = ptp.getParentData();
		System.out.println(temp);
		
		// 자식메소드에 접근하기
		// 불가능함!  
//		ptp.setChildData("부모타입에서 저장시키기!"); // 오류
		
		
		PolyTest pt2 = new PolyTest();
//		pt2.setChildData("자식이 자신 접근하기");
		pt2.setParentData("부모 접근하기");
		
		
		
		// 부모타입에 저장된 자식클래스객체의 멤버메소드에 접근하려면
		// 형변환을 해야한다.
		pt2 = (PolyTest)ptp;  // ptp는 부모클래스였어서 자식 클래스로 형변환
		System.out.println(pt2.getChildData());
		System.out.println(pt2==ptp);
		ptp = pt2;
		//ptp.getChildData(); // 오류남
		
		// 부모클래스 = 자식클래스 일때 [자동으로 자식클래스가 업캐스팅되서 부모클래스가 됨]
		ptp = (PolyTest)ptp;
		//ptp.getChildData(); 접근불가능함
		
		
		ptp = new PolyTest2();
		((PolyTest2)ptp).getPolyTest();
			
	}
	
	
	public void testPerson() {
		Person p;  // p라는 객체로 3개를 다 접근가능함
		p = new Student("유병승",19,1,"실용음악");
//		System.out.println(p.getName()+" "+p.getAge() + " "
//			+ ((Student)p).getGrade()+" "+((Student)p).getMajor());
//		
//		
//		p = new Teacher("유병승",19,"웹프로그래밍",100);
//		System.out.println(p.getName()+" "+p.getAge()
//		+((Teacher)p).getSubject()+" "+((Teacher)p).getSalary());
				
		printPerson(p);
		printPerson(new Student("최주영",26,2,"컴공"));
		printPerson(new Teacher("유병승",19,"web",100));
		// Person을 상속받고 있느 것들만 넣을 수 있음
//		printPerson(new PolyTest());
		
		printPerson(new Employee());
		
		PolyTestDao dao = new PolyTestDao(new Teacher());
		PolyTestDao dao2 = new PolyTestDao(new Student());
		
		
		Teacher t = new Teacher("유병승",19,"web",100);
		Teacher t2 = new Teacher("유병승",20,"web",100);
		System.out.println(t.equals(t2));
		System.out.println(t.equals(dao));
		
		
	}
	

	
	public void printPerson(Person p) { // p를 인수로넣었을 때 Person을 상속받은 것들을 접근가능
		// instanceof 
		if(p instanceof Student) {
			System.out.println(p.getName()+" "+p.getAge()
			+" "+ ((Student)p).getGrade() // grade와 major은 자식 필드이기때문에  
			+" "+ ((Student)p).getMajor()); // 자식클래스로 형변환해서 불러야함
		}else if(p instanceof Teacher) {
			System.out.println(p.getName()+" "+p.getAge()
			+" "+ ((Teacher)p).getSubject() // grade와 major은 자식 필드이기때문에  
			+" "+ ((Teacher)p).getSalary()); // 자식클래스로 형변환해서 불러야함
		}
	}
	
	
	
	
	public Person makePerson(int type) {
		Person p;
		switch(type) {
		case 1 : p = new Person(); break;
		case 2 : p = new Student(); break;
		case 3 : p = new Teacher(); break;
		case 4 : p = new Employee(); break;
		default : p=null; break;
		}
		return p;
	}
	
	
	
	public void objArrPolyTest() {
		//객체배열의 다형성 적용하기
		
		Person[] persons = new Person[9];
		
		persons = new Person[] {
				new Student("최주영",26,2,"컴공"),
				new Student("이동제",25,1,"자동차"),
				new Teacher("유병승",19,"web",100),
				new Teacher("이다영",25,"java",80),
				new Employee("김현영",26,"디자인","개발자"),
				new Employee("최솔",29,"연구팀","개발자")
		};
		
		Teacher[] teachers = new Teacher[4];
		Student[] students = new Student[3];
		Employee[] employee = new Employee[2];
		Teacher[] TeacherAge = new Teacher[teachers.length];
		
		int index = 0;
		
		for(Teacher t : teachers) {
			if(t!= null && t.getAge() >=20 ) {
				TeacherAge[index++] = t;
			}
		}

		index = 0;
		Person[] ageSearch = new Person[persons.length];
		for(Person p : persons) {
			if(p!= null && p.getAge() >25 ) {
				ageSearch[index++] = p;
			}
		}
		
		for(Person p : ageSearch) {
			if(p!=null) {
				System.out.println(p.getName()+p.getAge());
			}
		}
		
		
		
		
// persons에 저장된 student, teacher, employee의 수와
// 전체 저장사람수를 구하시오
		
// 내풀이
//		persons = new Person[] {
//				new Student("최주영",26,2,"컴공"),
//				new Student("이동제",25,1,"자동차"),
//				new Teacher("유병승",19,"web",100),
//				new Teacher("이다영",25,"java",80),
//				new Employee("김현영",26,"디자인","개발자"),
//				new Employee("최솔",29,"연구팀","개발자")
//		};
//		
//		int scount = 0;
//		int tcount = 0;
//		int ecount = 0;
//		int total = 0;
//		for(Person i : persons) {
//			if(i!=null && i instanceof Student) {
//				scount++;
//				total++;
//			}else if(i!=null && i instanceof Teacher) {
//				tcount++;
//				total++;
//			}else if(i!=null && i instanceof Employee) {
//				ecount++;
//				total++;
//			}
//		
//		}
//
//		System.out.println("Stundet 수 : "+scount);
//		System.out.println("Teacher 수 : "+tcount);
//		System.out.println("Employee 수 : "+ecount);
//		System.out.println("전체 수 : " + persons.length);
		
		
		
		

		
			
		
// 선생님풀이
//		int countStudent =0;
//		int countEmployee =0;
//		int countTeacher = 0;
//		int totalCount = 0;
//		
//		for(int i=0; i<persons.length; i++) {
//			if(persons[i] != null) {
//				if(persons[i] instanceof Student) {
//					countStudent++;
//				}else if(persons[i] instanceof Teacher) {
//					countTeacher++;
//				}else if(persons[i] instanceof Employee) {
//					countEmployee++;
//				}
//				totalCount++;	
//			}
//		}
//		
//		System.out.println("학생 : "+countStudent);
//		System.out.println("선생 : "+countTeacher);
//		System.out.println("직원 : "+countEmployee);
//		System.out.println("전체 : "+totalCount);
			
	}
	
	
	
	
	
	// 동적바인딩 : 실제들어온 객체것을 실행시키는것
	public void dynamicBind() {
		DynamicBindTest dbt = new DynamicBindTest();
		System.out.println(dbt.toString()); // DynamicBindTest 클래스안의 메소드 실행
		
		Object obj = new DynamicBindTest(); // DynamicBindTest 클래스안의 메소드 실행
		System.out.println(obj.toString());
		
		
		Animal a = new Cat();
//		System.out.println(((Cat)a).catbark());
		a.bark();  // Cat클래스의 bark가 호출됨
		
		
		a = new Dog();
//		System.out.println(((Dog)a).dogBark());
		a.bark(); // Dog클래스의 bark가 호출됨
		
		
		// 저장된 동물의 울음소리 출력하는 기능
		Animal[] animals = new Animal[10]; // Animal 클래스자료형의 배열 5크기 만듬
		animals[0] = new Dog("뽀삐","강아지",6);
		animals[1] = new Cat("뽀송","고양이",3);
		animals[2] = new Dog("복실이","강아지",7);
		animals[3] = new Cat("뽀짝이","고양이",3);
		animals[4] = new Dog("바둑이","강아지",5);
		animals[5] = new Cow("워낭소리","소",5);
		animals[6] = new Chicken();
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i] != null) {  // 널갑이 있는 곳이 있어서 예외처리해줘야함
				animals[i].bark();
			}

		}
	}
	
	
	
	
	
	public void abstractClasstest() {
		// 추상클래스 이용하기
		// 자료형으로는 이용이 가능하다.
		AbstractClassTest act;
		
		// AbstractClassTest 클래스는 추상클래스라서 생성불가능
        // act = new AbstractClassTest();
		
		act = new AbstractChildClass(); //AbstractChildClass는 추상클래스가 아니라서 생성 가
		act.getTitle();
		act.getWriter();
	}
	
	
	// 전사, 마법사, 궁수
}
