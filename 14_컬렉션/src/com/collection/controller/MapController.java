package com.collection.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Fruit;
import com.collection.model.vo.Student;

public class MapController {

	public static void main(String[] args) {
		
		// Map에 대해 알아보자
		// 저장구조가 key:value 형식임
		// key, value 쌍으로 이어져있음
		// Collection 인터페이스하고 별개의 Collection 프레임워크
		
		
		// Map 인터페이스를 구현한 클래스
		// HashMap, TreeMap
		HashMap map = new HashMap();
		// 저장할 때 key값과 value를 동시에 설정
		// put(key, value) 메소드를 이용
		// key : Object(기본) -> String으로 많이 사용, Interger 형
		// value : Object(기본) -> Vo객체, String, Integer 등
			
		map.put("bs", new Student("유병승",1,1,'남'));
		map.put("jy", new Student("최주영",2,1,'남'));
		map.put("nb", new Student("나빈",2,2,'여'));
		map.put("sj", new Student("이성진",3,2,'여'));

		System.out.println(map);

		
		// map에 저장되어 있는 데이터 가져오기
		// key값으로 value를 가져올 수 있다.
		// get() 메소드를 이용
		// get(key) 메소드를 이용
		Object o =map.get("sj");
		System.out.println(((Student)o).getName()); // 이성진 이름 출력하기
		
		// 1. key값은 중복이 불가능하다
		// 중복 key로 저장하면 덮어쓰기가 된다.
		map.put("bs","바보"); // 중복할 경우 원래 있던 위치에 덮어쓰기 된다.
		System.out.println(map.get("bs"));
		System.out.println(map);
		
		// 2. value 값은 중복이 가능하다.
		map.put("bs2","바보");
		System.out.println(map.get("bs"));
		System.out.println(map.get("bs2"));
		
		
		
		// map에 저장된 데이터 수 확인하기
		// size() 
		System.out.println(map.size());
		
		
		// map에 저장된 데이터 삭제하기
		// remove(key)
		map.remove("bs2");
		System.out.println(map.size());
		
		o = map.get("bs2");
		System.out.println(o); // 해당 키값이 없을때는 null로 반환
		
		
		// map에 특정키값이 있는지 확인하는 메소드
		// containsKey(키값)
		// 키값이 없을 때 그 키 만드는 로직 많이 사용
		// 있을 때 true 반환
		System.out.println(map.containsKey("jy"));  
		
		
		//map에 특정값이 있는지 확인하는 메소드
		//containsValue("값")
		System.out.println(map.containsValue(new Student("최주영",2,1,'남')) );
		System.out.println(map.containsValue("유병승"));
		
		
		System.out.println("===맵을 리스트로 변환해서 사용방법===");
		// Map과 List 호환하기
		// Map -> List로 반환하기
		// Map.values()
		ArrayList data = new ArrayList(map.values());
		for(int i=0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
	
		
		
		// Map에 저장된 데이터 전체를 순회하기
		// get(key);
		// key전체를 가져오는 메소드를 이용
		// KeySet() 메소드 -> Set 반환함
		System.out.println("==iterator로 출력==");
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key+" "+map.get(key));
		}
		
		
		System.out.println("==for each로 출력==");
		for(Object key : keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		
		// key와 value를 동시에 봔한해주는 메소드를 제공
		// entrySet() 메소드 => Map.Entry 형으로 반환
		Set entry = map.entrySet();
		Iterator it2 = entry.iterator();
		
		while(it2.hasNext()) {
			Map.Entry all =(Map.Entry)it2.next();
			System.out.println(all.getKey());
			System.out.println(all.getValue());
		}	
		
		
		// 과일을 저장하는 클래스를 생성
		// 이름,원산지,수량,가격
		// 귤, 제주도, 10, 15000,
		// 사과, 예산, 5, 25000,
		// 포도, 영동, 10, 35000,
		// 배, 나주, 10, 50000,
		// Map 방식으로 저장, key값 1~4로 저장
		
		// 1. 전체 데이터 조회하기
		// 2. 가격이 20000원 이상인 과일만 key와 value를 출력
		// 3. 이름이 한글자인 과일의 key와 value를 출력
		// 4. 포도의 가격을 40000원으로 수정하고 전체 데이터 출력
		// 5. 배를 찾아 삭제하기
		
		
		
		
		
		
		
		HashMap fruit = new HashMap();
	
		
		fruit.put(1, new Fruit("귤","제주도",10,15000));
		fruit.put(2, new Fruit("사과","예산",5,25000));
		fruit.put(3, new Fruit("포도","영동",10,35000));
		fruit.put(4, new Fruit("배","나주",10,50000));
		
		System.out.println("===전체 데이터 조회===");

// iterator 방식
//		Set fruitKey = fruit.keySet();
//		Iterator fit = fruitKey.iterator();
//		while(fit.hasNext()) {
//			Integer f = (Integer)fit.next();
//			System.out.println(f+" "+fruit.get(f));
//		}

// for each 방식
		Set fruitKey = fruit.keySet();
		for(Object key : fruitKey) {
			System.out.println(key+" "+fruit.get(key));
		}
		
		
		System.out.println("가격이 20000원 이상인 과일만 key와 value 출력");
		Set fruitEntry = fruit.entrySet();
		Iterator fruitIt = fruitEntry.iterator();
		while(fruitIt.hasNext()) {
			Map.Entry all =(Map.Entry)fruitIt.next();
			
			Fruit temp = (Fruit)all.getValue();
			
			if(temp.getPrice() >= 20000)
			{
				System.out.print("키 : " + all.getKey()+" 값 : "+all.getValue());
				System.out.println();
			}
		}	
		
		
		
//		for(Object o1 : fruitEntry) {
//			Map.Entry all = (Map.Entry)o1;
//			Fruit temp = (Fruit)all.getValue();
//			if(temp.getName().length() == 1) {
//				System.out.println(all.getKey()+" "+temp);
//			}
//		}
		
		
		
//		for(Object f : fruitKey) {
//			Fruit temp = (Fruit)fruit.get(f);
//			if(temp.getPrice()>=20000) {
//				System.out.println(f+" "+temp);
//			}
//		}
		
		
		
		
		
		
//		System.out.println("이름이 한글자인 과일의 key, value 수정하기");
//		
//		Iterator fruitIt1 = fruitEntry.iterator(); 
//		while(fruitIt1.hasNext()) {
//			Map.Entry all = (Map.Entry)fruitIt1.next();
//			
//			if(((Fruit)all.getValue()).getName().length() == 1)
//			{
//				System.out.print("키 : " + all.getKey()+" 값 : "+all.getValue());
//				System.out.println();
//			}
//		}
//		
//		
//		System.out.println("포도의 가격을 40000원으로 수정하고 전체데이터 출력");
//		
//		Iterator fruitIt2 = fruitEntry.iterator(); 
//		while(fruitIt2.hasNext()) {
//			Map.Entry all = (Map.Entry)fruitIt2.next();
//			
//			if(((Fruit)all.getValue()).getName().equals("포도"))
//			{
//				((Fruit)all.getValue()).setPrice(40000);
//				System.out.print("키 : " + all.getKey()+" 값 : "+all.getValue());
//				System.out.println();
//			}else {
//				System.out.print("키 : " + all.getKey()+" 값 : "+all.getValue());
//				System.out.println();
//			}
//		}
		
		
		
		for(Object o1 : fruitEntry) {
			Map.Entry all = (Map.Entry)o1;
			Fruit temp = (Fruit)all.getValue();
			if(temp.getName().equals("포도")) {
				temp.setPrice(40000);
			}
		}

		for(Object o1 : fruitEntry) {
			Map.Entry all = (Map.Entry)o1;
			System.out.println(all.getKey()+" "+all.getValue());
		}
		
		
		
		System.out.println("==배를 찾아 삭제하기==");
		Set fkeys = fruit.keySet();
		Iterator fit1 = fkeys.iterator();
		
		while(fit1.hasNext()) {
			Integer ikey = (Integer)fit1.next();
			if(((Fruit)fruit.get(ikey)).getName().equals("배")) {
				fruit.remove(ikey);
			}
		}
		
		System.out.println("===삭제 후 출력하기===");
		for(Object o1 : fruitEntry) {
			Map.Entry all = (Map.Entry)o1;
			System.out.println(all.getKey()+" "+all.getValue());
		}
		
//		
//		
//		
//		
//		System.out.println("==배를 찾아 삭제하기==");
//		
//		Iterator fruitIt3 = fruitEntry.iterator(); 
//		while(fruitIt3.hasNext()) {
//			Map.Entry all = (Map.Entry)fruitIt3.next();
//			
//			if(((Fruit)all.getValue()).getName().equals("배"))
//			{
//				
//				
//
//			}
//		}
		
		
		
		// Map도 of메소드를 이용해서 불변의 데이터를 생성할 수 있다.
		// 값을 수정할 수 없음
		// 키랑 값 쌍으로 넣어줘야함 (짝수개@)
		Map data1 = Map.of("name","유병승","age",19,"gender",'M');
		System.out.println(data1);
//		data1.put("address","경기도 시흥시"); 
//		data1.put("name","최주영");
		
		
		
		
		
		ArrayList dataList = new ArrayList();
		// 리스트안에 맵을 넣음
		dataList.add(Map.of("name","유병승","age",19));
		dataList.add(Map.of("name","정상준","age",26));
		dataList.add(Map.of("name","윤지환","age",25));
		dataList.add(Map.of("name","조장흠","age",26));
		
		for(int i=0; i<dataList.size(); i++) {
			
			System.out.println(((Map)dataList.get(i)).get("name"));
			System.out.println(((Map)dataList.get(i)).get("age"));

		}
		
		
		
		
		
		
		
	}

}
