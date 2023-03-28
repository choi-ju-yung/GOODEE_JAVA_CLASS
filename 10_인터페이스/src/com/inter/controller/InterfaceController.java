package com.inter.controller;

import java.util.function.Function;
import java.util.function.Predicate;

import com.inter.common.BasicInter;
import com.inter.common.CalculatorInterface;
import com.inter.common.Flyable;
import com.inter.common.Motionable;
import com.inter.common.ParentInterface;
import com.inter.common.StringInterface;
import com.inter.model.vo.BasicInterClass;
import com.inter.model.vo.Duck;
import com.inter.model.vo.Fruit;
import com.inter.model.vo.InterInheritClass;
import com.inter.model.vo.Rabbit;

public class InterfaceController {
	
	public void basicInterface() {
		//기본 인터페이스 이용하기
		//추상 메소드와, static final 변수를 갖는 객체
		//자체 생성이 불가능하고 다른 클래스에 의해서 구현(메소드 재정의)하여 사용
		//인터페이스를 구현한 클래스는 인터페이스의 자식 클래스로 설정됨(상속관계적용)
		//인터페이스타입의 변수에 자식클래스를 저장할 수 있다.
		//선언하는 방법
		//public interface 인터페이스명 { 구현부,,,}
		//클래스에서 구현선언하기
		//public class 클래스명 implements 인터페이스명 {}
		BasicInterClass bic = new BasicInterClass();
		bic.test();
		System.out.println(bic.calc(10, 10));
		
		
		// 선언된 인터페이스는 자료형으로 사용이 가능함
//		BasicInter bi = new BasicInter();  // 인터페이스 생성 불가능
		//구현한 객체는 저장이 가능하다.
		BasicInter bi;
		bi = new BasicInterClass();
		bi.test();
		System.out.println(bi.calc(20, 30));
		
		
		Duck d = new Duck();
		
		Flyable f = new Duck();
		f.fly(); // f는 Flyable 클래스 안의 메소드들만 접근가능

		Motionable m = new Duck();
		// m은 Motionable클래스 안의 메소드들만 접근가능
		
//		f = new Rabbit(); // 접근불가능
		m = new Rabbit();
		m.bark();
		
		// (new Dolphin()); // 안됨
		animalBark(new Duck()); // 가능
		animalBark(new Rabbit()); // 가능
		
	}
	
	
	public void animalBark(Motionable m) {
		m.back();
	}
	
	
	
	
	
	
	// 인터페이스 상속하기
	// 다중상속이 가능함
	public void interInheritTest() {
		ParentInterface pif;
		pif = new InterInheritClass();
		
		// pif로 접근할 수 있는것은 ParentInterface 안에 있는 것만 접근 가능
		
		System.out.println(pif.add(10, 20));
		
		Flyable f = new InterInheritClass();
		
		//((InterInheritClass)f).메소드들   // 형변환하여 모두 접근 가능
		((InterInheritClass)f).printTest("테스트");
		if(f instanceof InterInheritClass) {
			System.out.println("InterInheritClass야!!!");
		}
		
	}
	
	
	
	
	public void extraInterface() {
		// 익명클래스를 이용해서 구현하기
		BasicInter bi = new BasicInter() {
			@Override
			public void test() {
				System.out.println("익명클래스로 구현");
			}
			
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		};
		int result = bi.calc(10, 20);
		System.out.println(result);
		
		animalBark(new Motionable() {

			@Override
			public void bark() {
				System.out.println("엉엉!");
			}

			
			@Override
			public void forward() {
				// TODO Auto-generated method stub
			}

			@Override
			public void back() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void jump() {
				// TODO Auto-generated method stub
				
			}

		});
		
		//인터페이스에 선언되어 있는 추상클래스가 한 개일 경우
		//FunctionalInterface로 람다표현식으로 이용해서 간단하게 표현이 가능함
		// 추상클래스가 2개 이상인 경우 오류가 발생
		Flyable f = new Flyable(){
			@Override
			public void fly() {
				// TODO Auto-generated method stub
			}
		};
		// ([매개변수]) -> { return }
		
		f = ()->{System.out.println("람다로 날다");};
		f.fly();
		
		
		// 매개변수 있고, 반환형 없는 함수형 인터페이스
		CalculatorInterface ci = (int a, int b) -> {
			System.out.println(a+b);
		};
		
		ci.calc(20, 30);
		
		
		StringInterface si = (String a) -> {
			return a + " 람다로 출력하기";
		};
		
		System.out.println(si.strCheck("우와 신기하다"));
		// 리턴이 있을 때 로직이 없고 바로 리턴을 구현하면
		// return 예약어를 생략할 수 있음 {} 사용하지 않음
		si = (String b) -> b+"로직없이 바로 리턴";
		System.out.println(si.strCheck("많이 어려워요????"));

		
	}
	
	
	
	
	
}


