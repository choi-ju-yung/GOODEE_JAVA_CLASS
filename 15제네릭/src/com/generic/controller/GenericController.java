package com.generic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.Animal;
import com.generic.model.vo.Food;
import com.generic.model.vo.Fruit;
import com.generic.model.vo.GenericBasic;
import com.generic.model.vo.GenericInterface;

public class GenericController {

	public static void main(String[] args) {
		
		// 제네릭에 대해 알아보자
		// 자바에서 동적타입을 선언하는 구문
		// 프로그램 중간에 타입이 정해지는것 = 동적타입
		// <자료형>으로 제네릭으로 선언된 자료형을 결정
		
		
		// 제네릭으로 선언된 클래스 이용하기
		GenericBasic<String,Date> gb = new GenericBasic();
		
		gb.setData("유병승");
		System.out.println(gb.getData());
		System.out.println();
		
		// string으로 선언했기때문에 정수형으로는 저장못함 -> gb.setData(19);
		
		GenericBasic<Integer,Math> gb1 = new GenericBasic();
		gb1.setData(19);
		System.out.println(gb1.getData());
		
		
		
		GenericInterface<String, String> stringFilter = (e,v)->e.equals(v);
		stringFilter.check("dfd", "DFd");
		
		GenericInterface<GenericBasic<String[],Date>,String> filter = (e,v)->e.equals(v);
		filter.check(new GenericBasic(), "sdw");
		
		
		
		// ArrayList에 제네릭 타입 선언 후 이용하기
		ArrayList<String> names = new ArrayList();  // ArrayList에 스트링값만 들어갈 수 있음
//		names.add(10);
//		names.add(true);
		names.add("유병승");
		names.add("강민기");
		
		for(String s : names) {
			System.out.println(s);
		}
		
		
		
		ArrayList<Fruit> fruits = new ArrayList(); // Fruit클래스타입과 그 클래스가 상속받는것들
		fruits.add(new Fruit("딸기","논산",10,10000));
		//fruits.add(new Animal()); // Fruits 타입으로 정의했기때문에 Animal은 안됨
		fruits.add(new Fruit("포도","송산",10,20000));
		fruits.add(new Fruit("사과","예산",20,35000));
		
		// fruits는 Fruit타입으로 형변환 안해도 getName에 접근할 수 있음
		for(int i=0; i<fruits.size(); i++) {
			System.out.println(fruits.get(i).getName()); 
		}
		
		Set<Animal> animals = new HashSet();  // 왼쪽에 Set인 이유
		animals.add(new Animal("바둑이",8.3,4,"강아지"));
		animals.add(new Animal("꽥꽥이",4.6,3,"오리"));

		
		// 원래는 iterator도 Object로 반환하지만 이제는 Animal 타입으로 고정되서 받을 수 있음
		Iterator<Animal> it = animals.iterator(); 
		
		while(it.hasNext()) {
			Animal a = it.next();
			System.out.println(a.getName()+" "+a.getWeight());
		}
	
		
		Map<String,Food> foods = new HashMap(); // 키값 -> String타입  밸류값->Food클래스타입
		
		foods.put("1", new Food("윤쉐프",7000,"급식",new Date()));
		foods.put("2", new Food("족발",35000,"한식",new Date()));
		foods.put("3", new Food("초밥",1200,"일식",new Date()));
		foods.put("4", new Food("초밥",1200,"일식",new Date()));
		
		
		Set<String> keys = foods.keySet();  // 키들은 String으로만 받아서 Set으로 받음
		//원래는 iterator 반환형이 Object지만 String으로 정해줬음
		Iterator<String> it2 = keys.iterator(); 
		
		while(it2.hasNext()) {
			String key = it2.next();
			System.out.println(foods.get(key).getName());	
		}
		
		
		
		// 확장성과 유연성을 위해서 왼쪽은 더 큰범위로 지정 (Set으로 지정하면 HashSet, TreeSet 등 사용가능)
		Set<Map.Entry<String,Food>> entry = foods.entrySet(); 
		Iterator<Map.Entry<String, Food>> entryIt = entry.iterator(); 
		
		while(entryIt.hasNext()) {
			Map.Entry<String, Food> t = entryIt.next();
			System.out.println(t.getKey());
			System.out.println(t.getValue().getName()
					+ " "+t.getValue().getPrice());
		}
		 
		
		
		System.out.println("==테이블당 주문음식을 관리하는 저장소==");
		// 테이블당 주문음식을 관리하는 저장소
		// 중요 복습하기!
		Map<String,List<Food>> foodTable = new HashMap(); // value타입 : List	
		foodTable.put("a",new ArrayList<Food>()); // 값은 ArrayList<Food>타입
		foodTable.put("b",new ArrayList<Food>()); 
		//List<Food> foods = new ArrayList();
		// 짜장면, 짬뽕, 탕수육 -> a
		foodTable.get("a").add(new Food("짜장면",8500,"중식",new Date()));
		foodTable.get("a").add(new Food("짬뽕",9000,"중식",new Date()));
		foodTable.get("a").add(new Food("탕슉",15000,"중식",new Date()));
		foodTable.get("b").add(new Food("비빔밥",20000,"한식",new Date()));
		foodTable.get("b").add(new Food("주먹밥",50000,"한식",new Date()));
		foodTable.get("b").add(new Food("삼각김밥",30000,"한식",new Date()));
		
		
		List<Food> orderList = foodTable.get("a");
		orderList.forEach(food->System.out.println(food));
		List<Food> orderList1 = foodTable.get("b");
		orderList1.forEach(food->System.out.println(food));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
