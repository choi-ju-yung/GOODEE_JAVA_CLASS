package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.collection.model.vo.Student;

public class SetController {

	public static void main(String[] args) {
		// Set에 대해 알아보자 -> 인터페이스
		// 다수의 객체를 보관할 수 있는 클래스
		// HashSet, LinkedHashSet, TreeSet
		// 데이터를 중복해서 저장하지 않음
		// 데이터를 중복해서 저장하지 않음, 데이터를 지정할 수 있는 구분자가 없음
		
		
		
		HashSet set = new HashSet();
		// 데이터 저장하기
		set.add("유병승");
		set.add("최주영");
		set.add("최솔");
		set.add("이다영");
		System.out.println(set);
		
		// set저장된 데이터를 한개씩 출력하기
		// 어떤 값에 대해 지칭할 수 없기 때문에
		// Iterator 인터페이스를 이용해서 출력
		Iterator it = set.iterator();
		
		System.out.println("===Iterator로 출력하기===");
		while(it.hasNext()) { // 다음으로 갈수있는것이 있는지 물어봄
			// 기본적으로 set에서 add함수의  반환형은 object기 때문에 형변환 해줘야함
			String value = (String)it.next(); 
			System.out.println(value); 
		}
		
		
	
		//forEach문 이용하기
		System.out.println("===forEach문으로 출력하기===");
		for(Object o : set) {
			System.out.println(o);
		}
		
		
		
		System.out.println("===forEach메소드로 출력하기===");
		// forEach() 메소드도 제공됨
		set.forEach((o)->System.out.println(o));
		// 단일값을 찾는방법 => 전체순회하다가 그 값 발견시 break 하여 그 값을 저장
		
		
		
		System.out.println("====set에 저장되어있는 개수====");
		// set 메소드 이용하기
		//1. set에 저장된 데이터 갯수확인
		// size() 메소드
		System.out.println(set.size());
		
		
		
		System.out.println("====set이 비어있는지 확인====");
		//2. set에 데이터가 저장되어있는지 확인하는 메소드
		// isEmpty()
		// 비어있으면 true
		System.out.println(set.isEmpty());
		
		
		
		System.out.println("====set에 특정값이 있는지 확인하는 메소드====");
		//3. set에 특정값이 있는지 확인하는 메소드
		// contains(Object) -> equals, hashCode 오버라이딩 되있어야 한다.
		System.out.println(set.contains("최솔"));
		System.out.println(set.contains("김중근"));
		
		
		
		System.out.println("===remove로 유병승 삭제하는 메소드===");
		//4. set에 저장되어있는 객체를 삭제하는 메소드
		// remove(Object) -> equals, hashCode 오버라이딩 되있어야 한다.
		set.remove("유병승");
		set.forEach((o)->System.out.println(o));
		
		
		
		System.out.println("====중복값을 추가하고 확인====");
		// Set은 중복되는 데이터를 저장하지 않는다.
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.add("최주영");
		set.forEach((o)->System.out.println(o));

		
		System.out.println("===로또값 set으로 만든결과====");
		HashSet lotto = new HashSet();
		while(lotto.size()<7) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
		
		
		System.out.println("==다른클래스 객체를 대상으로 값 넣기==");
		HashSet students = new HashSet();
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("최주영",3,2,'남'));
		students.add(new Student("김예린",2,1,'여'));
		students.add(new Student("윤나라",2,2,'여'));
		
		students.forEach((s)->System.out.println(s));
		
		
		System.out.println("==여자인 사람만 뽑기==");
		for(Object o : students) {
			Student s = (Student)o;
			if(s.getGender() == '여') {
				System.out.println(s.getName()+" "+s.getGender());
			}
		}
		
		
		System.out.println("");
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("유병승",1,3,'남'));
		students.add(new Student("유병승",1,3,'남'));
		
		students.forEach((s)->{
			System.out.println(s);
		});
		
		
		
		// set과 list의 호환하기
		ArrayList studentList = new ArrayList(students); // HashSet -> ArrayList
		System.out.println("리스트로 변환 후 출력하기");
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));
		
		
		
		List testData = List.of(1,2,3,4,5,5,6,6,7,7,8,8,10,10);
	
		HashSet hs = new HashSet(testData);  // 리스트 -> HashSet으로 바뀜
		ArrayList al = new ArrayList(hs);  // HashSet -> 리스트로 바뀜
		for(Object o : al) {
			System.out.println(o);
		}
		
		al.addAll(students);
		System.out.println("students 데이터 추가 후 출력하기");
		al.forEach((e)->System.out.println(e));
		
		
		// 저장순서를 유지하는 set, 중복값은 x
		LinkedHashSet liset = new LinkedHashSet();
		liset.add(1);
		liset.add(3);
		liset.add(2);
		liset.add(2);
		liset.add(2);
		liset.add(8);
		liset.add(4);
		
		System.out.println("==linkedHashSet 출력==");
		for(Object i : liset) {
			System.out.println(i); 
		}
		
		
		
		// TreeSet   // 데이터 순회할때 빠름 (절반으로 나눠서)
		// Tree 구조에 객체를 대입할 때는
		// 그 클래스에 compareTo() 메소드를 재정의되어 있어야한다. 
		// Student 클래스에 compareTo 재정의 되어있음
		// 이름을 기준으로! 
		// Student 클래스에서 Comparable 인터페이스를 구현하자!
		// tree 구조에서는 중복값을 기준으로 선언하면 안됨
		
		TreeSet studentTree = new TreeSet();
		studentTree.add(new Student("최주영",1,1,'남'));
		studentTree.add(new Student("최주영",2,1,'남'));
		studentTree.add(new Student("김현영",2,2,'여'));
		studentTree.add(new Student("최하리",3,1,'여'));
		
		System.out.println("==studentTree 출력하기==");
		for(Object o : studentTree) {
			System.out.println(o);
		}
		
		
		
	}

}
