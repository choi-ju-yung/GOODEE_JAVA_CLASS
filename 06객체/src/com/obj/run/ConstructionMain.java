
package com.obj.run;

import com.obj.model.vo.Person;

public class ConstructionMain {

	public static void main(String[] args) {
		// 클래스의 생성자 활용하기
		// 클래스는 생성해서 이용을 해야한다.
		// 클래스를 생성할 때 이용하는것이 생성자다
		// 모든 클래스선언에는 반드시 생성자선언 코드가 있어야한다.
		
		Person p = new Person(); // 생성자 호출부분
		
		System.out.println(p.name +" "+p.age+" "+p.height
				+ " "+p.gender);
		
		// 매개변수 있는 생성자 호출하기
		Person p1 = new Person("최주영",26,178.4,'여');
		Person p2 = new Person("김중근",28,177.3,'여');
		
		
		System.out.println(p1.name+p1.age+p1.height+p1.gender);
		System.out.println(p2.name+p2.age+p2.height+p2.gender);
		
		Person p3 = new Person("윤지환",'남');
		
		
		
	}

}
