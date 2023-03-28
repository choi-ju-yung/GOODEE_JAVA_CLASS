package com.obj.arr.run;
import java.util.Scanner;

import com.objarr.controller.Animal;
import com.objarr.controller.Person;
import com.objarr.controller.fruit;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체배열 이용하기
		// 객체배열 생성하기
		// Animal a, a1, a2, a3
		
		Animal[] animals; // 객체배열 변수를 선언
		animals = new Animal[4]; // 배열 저장공간을 생성해서 대입
		
		animals[0] = new Animal();  // 디폴트로 생성시 필드들은 문자열은 null, 정수형은 0, 문자는 띄어쓰기로 초기화시킴
		animals[1] = new Animal("고양이","베리",3,6,'여');
		
		// 배열에 저장된 객체 데이터 활용하기
		System.out.println(animals[0]); // animals 객체의 주소가 들어있음
		System.out.println(animals[0].getName());
		
		animals[0].setName("햄찌");
		System.out.println(animals[0].getName());
		System.out.println(animals[1].getName());
		
		
		//Animal을 3개 저장할 수 있는 저장소를 만들고
		//원숭이 몽키 3 90 남
		//돼지 꿀꿀이 1 30 여
		//토끼 깡총이 2 2  여
		
		Animal[] ani = new Animal[3];
		
		ani[0] = new Animal();
		ani[1] = new Animal("돼지","꿀꿀이",1,30,'여');
		ani[2] = new Animal("토끼","깡총이",2,2,'여');
		// 항상 최소 기본생성자라도 생성하고 만들어야한다 안만들면 null값이라 null포인터 오류 뜸
		
		ani[0].setType("원숭이");
		ani[0].setName("원숭이");
		ani[0].setAge(3);
		ani[0].setWeight(9);
		ani[0].setGender('남');
		
		for(int i=0; i<ani.length; i++) {
			System.out.println(ani[i].infoAnimal());
		}
		
		// com.objarr.controller.Person 만들기
		// 이름, 나이, 주소, 전화번호
		// Person을 5명 저장할 수 있는 공간을 확보하고 -> 생성자는 기본생성자만 생성
		// 사용자가 입력한 값으로 Person을 생성 및 저장소에 저장 후
		// 저장된 사용자 모두를 출력하기
		// *getter와 setter 이용할것
		
		Person[] p = new Person[5]; // 클래스 Person을 사용하여 객체배열크기 5 생성
		

//		for(int i=0; i<5; i++) {
//			p[i] = new Person(); // 
//			System.out.print(i+1+"번째 "+"이름 입력 : ");
//			p[i].setName(sc.nextLine());
//			System.out.print(i+1+"번째 "+"나이 입력 : ");
//			p[i].setAge(sc.nextInt());
//			System.out.print(i+1+"번째 "+"주소 입력 : ");
//			sc.nextLine();
//			p[i].setAddress(sc.nextLine());
//			System.out.print(i+1+"번째 "+"전화번호 입력 : ");
//			p[i].setPhone(sc.nextLine());
//		}
		
		//for문으로 출력하기
//		for(int i=0; i<p.length; i++) {
//			System.out.println(p[i].infoPerson());
//		}
//		
//		System.out.println("=========================");
//		
//		// foreach문 사용해서 출력
//		for(Person i : p) { // i가 지역변수가 아닌 주소값이기 때문에 값 수정 가능함
//			System.out.println(i.getName()+" "+i.getAge()+" "
//					+i.getAddress()+" "+i.getPhone());
//		}
		
		
//		int[] intArr = {1,2,3,4,5};
//		for(int i : intArr) {
//			i = 100;  // 값이 바뀌지 않음 (i는 지역변수이기 때문에)
//		}

		
		// 객체배열 선언과 동시에 초기화하기
		Person[] p2 = {
				new Person("유병승",19,"경기도 시흥시","010444"),
				new Person("이성진",25,"서울시 노원구","010123"),
				new Person("이동제",25,"경기도 군포시","010555"),
				new Person("이다영",25,"경기도 광명시","010666"),
		};
		// 다수의 데이터를 저장하고 활용할 때 객체배열
		// 저장된 사람중 25살인 사람 조회하기
		// for문으로 구현
		for(int i=0; i<p2.length; i++) {
			if(p2[i].getAge() == 25) {
				System.out.println(p2[i].getName());
			}
		}
		
		// 위에 결과와 같음 (for-each문)
		for(Person i : p2) {
			if(i.getAge()==25) {
				System.out.println(i.getName());
			}
		}
		
		
		
		
		// 과일을 저장할 수 있는 클래스를 만들고
		// 이름, 무게, 색상, 가격
		// 과일을 5개 저장할 수 있는 저장소를 만들자
		// 과일 본인이 좋아하는 과일로 초기화하고
		//1. 초기화한 과일들 전체 출력하기
		//2. 입력한 과일중 무게가 3kg이상인 과일 출력하기
		//3. 가격이 3000 이상인 과일 출력하기
		//사과 5 빨강 10000
		//바나나 3 노랑 8000
		//키위 2 초록 2800
		//샤인머스켓 1.3 초록 40000
		
		fruit[] f = {
				new fruit("사과",5,"빨강",10000),
				new fruit("바나나",3,"노랑",8000),
				new fruit("딸기",1.5,"빨강",2500),
				new fruit("키위",2,"초록",2800),
				new fruit("샤인머스켓",5,"초록",40000),
		};
		
		for(fruit i : f) {
			System.out.println(i.infoFruite());
		}
		
		for(int i=0; i<f.length; i++) {
			if(f[i].getWeight() >= 3) {
				System.out.println(f[i].infoFruite());
			}
		}
		
		for(fruit i : f) {
			if(i.getPrice() >=3000) {
				System.out.println(i.infoFruite());
			}
		}
		
		
		
		
	}

}
