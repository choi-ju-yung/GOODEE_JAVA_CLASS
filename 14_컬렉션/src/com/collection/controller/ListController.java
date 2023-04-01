package com.collection.controller;

import java.util.ArrayList;
import java.util.Date;

import com.collection.common.aa;
import com.collection.model.vo.Food;

public class ListController {
	public static void main(String[] args) {

//		// 리스트, 맵 중요
//		// List 인터페이스
//		// List 인터페이스는 Collection 인터페이스를 상속받은 인터페이스
//		// 클래스를 다수 저장/ 관리하는 기능을 정의한 인터페이스
//		// List를 구현한 클래스
//		// ArrayList, LinkedList, Vector
//		// 선형자료구조를 갖는 클래스로 배열과 유사함
//		// 인덱스번호, 순서가 있음
//		// 삽입, 삭제 메소드가 구현이 되어있음
//		// 클래스가 제공하는 메소드를 이용해서 데이터를 관리함.
//
//		// ArrayList 클래스 이용하기
//		ArrayList list = new ArrayList(); // 저장공간 만들어준거임
//
//		// 생성된 list저장소에 데이터 저장하기
//		// ArrayList 객체에 저장가능한 데이터는 (자바에서 사용하는 모든 데이터)
//		// 저장하려면 add(저장할데이터) 메소드를 이용한다.
//		list.add(true); // 값 저장할때 add메소드 사용 => 인덱스 알아서 늘려줌
//		list.add(19);
//		list.add("유병승");
//		list.add('남');
//		list.add(180.5);
//		list.add(new Date());
//
//		// 저장된 데이터 가져오기(호출하기)
//		// get(인덱스번호) 메소드를 이용함 // get함수의 반환형은 object임
//		System.out.println(list.get(0)); // 1번째 인덱스에 있는 값 가져오기
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
//		System.out.println("========================");
//
//		// 기본적으로 ArrayList에 저장되는 데이터는
//		// Object 자료형으로 저장이 된다.
//		// 대입된 실제 데이터를 사용하려면 형변환을 해야한다.
//
//		// 전체 데이터에 접근(순회)할 때는 반복문을 사용하면 편리하다.
//		// List자료형의 길이는 size() 메소드를 이용한다.
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println("========================");
//
//		// 실제 vo객체를 저장하고 관리하는 역할함.
//
//		ArrayList foods = new ArrayList();
//
//		foods.add(new Food("돈까스", 10000, "일식", new Date()));
//		foods.add(new Food("초밥", 2000, "일식", new Date()));
//		foods.add(new Food("컵라면", 1400, "한식", new Date()));
//		foods.add(new Food("샐러드", 12000, "건강식", new Date()));
//
//		Food f = (Food) foods.get(1); // get 리턴타입은 Object이기 때문에
//										// Food타입으로 형변환 해야한다.

		ArrayList al = new ArrayList();
		al.add(new Food("돈까스", 10000, "일식", new Date()));
		al.add(new Food("초밥", 2000, "일식", new Date()));
		al.add(new Food("컵라면", 1400, "한식", new Date()));
		al.add(new Food("샐러드", 12000, "건강식", new Date()));
		
		for(int i=0; i<al.size(); i++) {
			Food f = (Food)al.get(i);
			System.out.println(f.getName());
		}
		
		for(Object o : al) {
			System.out.println(((Food)o).getName());
		}
		
		al.sort(new aa());
		
		al.forEach((o)->System.out.println(((Food)o).getPrice()));
		
		
		
//		System.out.println(f.getName() + " " + f.getPrice());
//
//		// 전체 음식의 타입, 이름, 가격을 출력
//		for (int i = 0; i < foods.size(); i++) {
//			Food f1 = (Food) foods.get(i); // get 리턴타입은 Object이기 때문에
//											// Food타입으로 형변환 해야한다.
//			System.out.println(f1.getType() + " " + f1.getName() + " " + f1.getPrice());
//		}
//		System.out.println("========================");
//
//		// 전체 음식중 가격이 5000원 이하인 음식의
//		// 타입, 이름, 가격을 출력하세요
//		for (int i = 0; i < foods.size(); i++) {
//
//			Food f1 = (Food) foods.get(i); // get 리턴타입은 Object이기 때문에
//
//			if (f1.getPrice() <= 5000) {
//				System.out.println(f1.getType() + " " + f1.getName() + " " + f1.getPrice());
//			}
//		}
//		System.out.println("========================");
//
//		// Animal 클래스를 선언하고
//		// 이름, 몸무게, 나이, 종류
//		// 뽀삐, 5.3, 10, 강아지
//		// 야옹이, 4.2, 5, 고양이
//		// 킥킥이, 15.3, 3, 원숭이
//		// 하하, 200.2, 9, 하마
//		// ArrayList에 저장하고
//		// 1. 전체 데이터 출력
//		// 2. 이름, 나이, 몸무게만 출력하기
//		// 3. 몸무게 10kg이상인 동물의 이름, 종류, 몸무게 출력
//		// 4. 나이가 5살이상인 동물의 이름, 나이 출력
//		// 5. 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체 동물 출력
//
//		ArrayList animal = new ArrayList();
//		animal.add(new Animal("뽀삐", 5.3, 10, "강아지"));
//		animal.add(new Animal("야옹이", 4.2, 5, "고양이"));
//		animal.add(new Animal("킥킥이", 15.3, 3, "원숭이"));
//		animal.add(new Animal("하하", 200.2, 9, "하마"));
//
//		// 1번
//		for (int i = 0; i < animal.size(); i++) {
//			System.out.println(animal.get(i));
//		}
//		System.out.println("========================");
//
//		// 2번 (for-each문으로 출력)
//		for (Object o : animal) {
//			Animal a = (Animal) o;
//			System.out.println(a.getName() + " " + a.getWeight() + " " + a.getAge());
//		}
//		System.out.println("========================");
//
//		// 3번
//		for (int i = 0; i < animal.size(); i++) {
//			Animal a1 = (Animal) animal.get(i);
//			if (a1.getWeight() >= 10) {
//				System.out.println(a1.getName() + " " + a1.getType() + " " + a1.getWeight());
//			}
//		}
//		System.out.println("========================");
//
//		// 4번
//		for (int i = 0; i < animal.size(); i++) {
//			Animal a1 = (Animal) animal.get(i);
//			if (a1.getAge() >= 5) {
//				System.out.println(a1.getName() + " " + a1.getAge());
//			}
//		}
//		System.out.println("========================");
//
//		// 5번
//
//		// ((Animal)animal.get(0)).setAge(20);
//
//		for (int i = 0; i < animal.size(); i++) {
//			Animal a1 = (Animal) animal.get(i);
//			int age = a1.getAge();
//			a1.setAge(age + 1);
//
//			System.out.println(a1.getName() + " " + a1.getWeight() + " " + a1.getAge() + " " + a1.getType());
//		}
//		System.out.println("========================");
//
//		// ArrayList가 데이터가 있는지 없는지 확인하기
//		// isEmpty()메소드, size()를 이용
//		ArrayList test = new ArrayList();
//
//		System.out.println(test.isEmpty()); // 비어있는지 확인하는 메소드 (비어있으면 true)
//		System.out.println(animal.isEmpty()); // 안비어있으니까 fasle 리턴
//
//		if (!animal.isEmpty()) { // 응용(비어있지 않으면 모두 출력)
//			for (Object a : animal) {
//				System.out.println(a);
//			}
//		}
//
////		if(animal.size() == 0) {  // isEmpty() 메소드와 기능 동일
////			
////		}
//
////		if(animal.size() > 0) {  // 1개이상 있다는 말 -> 비어있지 않다는 말
////		
////	}		
//
//		// ArrayList에 저장되어 있는 전체 데이터를 순회하는 방법
//		// for문, forEach문 사용
//		// iterator() 메소드를 이용하는 방법. -> Iterator 객체를 이용하는 것임
//		System.out.println("====== iterator 방식으로 출력하기 ========");
//		animal.add(new Animal("음메에", 30.5, 3, "양"));
//		Iterator it = animal.iterator(); // 0번~마지막까지 모든 인덱스를 이터레이터 방식으로 뽑음
////		while(it.hasNext()) {
////			//Animal a = (Animal)it.next();
//////			System.out.println(it.next());
//////			System.out.println(it.next());
////		}
//
//		System.out.println("========================");
//		// 원하는 인덱스 위치에 값 추가하기
//		// add(index, element);
//		animal.add(1, new Animal("부엉", 4.3, 5, "부엉이")); // 1번째에 값을넣고 그 뒤에는 밀림
//		for (int i = 0; i < animal.size(); i++) {
//			System.out.println(i + " " + animal.get(i));
//		}
//		System.out.println("========================");
//
//		// 원하는 인덱스의 값을 수정하기
//		// set(index, element);
//		animal.set(1, new Animal("고라", 20.2, 1, "고라니")); // 1번째 값을 삭제하고 거기에다 넣음
//		for (int i = 0; i < animal.size(); i++) {
//			System.out.println(i + " " + animal.get(i));
//		}
//		System.out.println("========================");
//
//		// 원하는 인덱스의 값을 삭제하기
//		// remove(index);
//		animal.remove(1); // 해당 인덱스의 값 제거한 후에 자동으로 앞으로 밀림
//		for (int i = 0; i < animal.size(); i++) {
//			System.out.println(i + " " + animal.get(i));
//		}
//		System.out.println("========================");
//
//		// 매개변수와 일치하는 값 삭제하기
//		// remove(Object o) -> 대상 클래스에 equals, hashCode가 오버라이딩 되어있어야한다.
//		// 대상 Animal 클래스안에 equals와 hashCode가 오버라이딩 되어있어야함
//		animal.remove(new Animal("음메에", 30.5, 3, "양"));
//		for (int i = 0; i < animal.size(); i++) {
//			System.out.println(i + " " + animal.get(i));
//		}
//		System.out.println("========================");
//
//		// ArrayList의 데이터들을 관리할 수 있는 메소드
//		// 1. 특정 객체가 리스트에 포함되어 있는지 확인하는 메소드
//		// contains(Object) : boolean형으로 반환함
//		boolean result = animal.contains(new Animal("야옹이", 4.2, 6, "고양이"));
//		System.out.println(result);
//		System.out.println("========================");
//
//		// 2. 동일한 객체를 찾아서 그 인덱스를 반환해주는 메소드
//		// indexOf(Object) / lastIndexOf(Object)
//		// 해당 객체를 못찾으면 -1로 리턴
//		int index = animal.indexOf(new Animal("야옹이", 4.2, 6, "고양이"));
//		System.out.println(index);
//		System.out.println("========================");
//
//		// 3. ArrayList로 저장된 데이터를 배열로 변환해주는 메소드
//		// toArray() : ArrayList -> [] 배열로 변경
//		System.out.println("리스트데이터 배열로 변환하기");
//		Object[] objArr = animal.toArray(); // ArrayList가 배열로 변환됨
//		for (Object o : objArr) {  // toArray 타입은 무조건 Object임
//			System.out.println(o);
//		}
//		System.out.println(objArr[0]);
//		// Arrays클래스의 asList() 메소드를 이용하면 배열을 List로 변경할 수 있음
//		List animal2 = Arrays.asList(objArr);
//		for (Object o : animal2) {
//			System.out.println(o);
//		}
//		System.out.println("========================");
//
//		// Collection, List 인터페이스는 부모타입으로
//		// ArrayList 객체를 저장할 수 있다.
//		Collection c; // = new Collection();
//		c = new ArrayList();
//		c = animal; // c가 animal보다 상위계층임
//		List listData = animal;
//		listData = new ArrayList();
//
//		// ArrayList에 저장된 데이터를 한번에 전체데이터 삭제하기
//		// clear()
//		System.out.println(animal.isEmpty()); // false
//		animal.clear(); // 다 지워버리기
//		System.out.println(animal.isEmpty()); // true
//		System.out.println("========================");
//		
//		
//		// List를 생성할 때 선언과 동시에 초기화해서 생성하기
////		String[] names = {"유병승","정상준","조윤진","최하리","이은지"};
////		names = new String[] {"1","2","3","4"};
//		List intList = List.of(1, 2, 3, 4, 5); // 고정값임 (수정이 불가능함) = final
//		// List.of로 생성한 list는 불변의 리스트
//		System.out.println(intList.size());
//		System.out.println(intList.get(0));
//		System.out.println(intList.get(1));
//		System.out.println(intList.get(2));
//		System.out.println(intList.get(3));
//		System.out.println(intList.get(4));
//
//		// intList.add(6); 수정불가능
//		// intList.set(0, 100); 수정불가능
//		List animalList = List.of(new Animal(), new Animal(), new Animal());
//		// animalList 배열의 주소값을 수정불가능한것이지, 안에있는 값들은 변경가능함
//		((Animal) animalList.get(0)).setName("햄찌");
//
//		for (Object o : animalList) {
//			System.out.println(o);
//		}
//		System.out.println("========================");
//
//
//
//		// 리스트는 순서!!!
//		// 순서가 있으면 정렬!!
//		// 정렬에 대한 메소드를 제공한다.
//		// Collection 클래스에서 제공하는 sort()
//		// List인터페이스에서 제공하는 sort()
//		
//		//foods.sort();   
//		// Comparator 인터페이스 알아보기
//		// 값을 비교할 기준을 정해줘서 Comparator을 재정의해줌
//		// 1. Comparator를 구현한 클래스 생성하기
//		System.out.println("오름차순으로 정렬하기");
//		System.out.println("===== 정렬전 =====");
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		foods.sort(new FoodPriceAes()); // FoodPriceAes 클래스를 통해서 가격을 기준으로 오름차순
//		System.out.println("===== 정렬후 =====");
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		
//		System.out.println("내림차순으로 정렬하기"); // 가격을 기준으로 내림차순
//		foods.sort(new FoodPriceDecending());
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		
//		// Collections 클래스가 제공하는 sort메소드 이용하기
//		Collections.sort(foods, new FoodPriceDecending()); 
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		
//		// 클래스가 가지고 있는 기본정렬방식으로 정렬
//		// Compareable 인터페이스를 구현해줘야함.
//		// compareTo() 메소드를 재정해서 사용
//		// 반환형이 +(변경), -(안바꿔), 0(안바꿔)
//		Collections.sort(foods);
//		System.out.println("Comparable로 정렬하기");
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		// 음식을 이름순으로 정렬하기
//		// a ~ z
//		// 가 ~ 하
//		// 사전순
//		
//		System.out.println("이름순으로 오름차순정렬하기");
//		foods.sort(new FoodNameAscending());
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//	
//		System.out.println("이름순으로 내림차순정렬하기");
//		foods.sort(new FoodDecending());
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		
//		System.out.println("타입으로 정렬하기");
//		foods.sort(new FoodTypeAscending());
//		for(Object o : foods) {
//			System.out.println(o);
//		}
//		
//		
//		
//		foods.sort(new Comparator() {  // 클래스를 생성하지 않고 익명클래스로 생성해서 만드는 방법
//			@Override
//			public int compare(Object o, Object o1) {
//				Food f = (Food)o;
//				Food f2 = (Food)o1;
//				return f.getPrice()-f2.getPrice();
//			}
//		});
//		
//		System.out.println("====for-each 문으로 출력====");
//		//리스트에 있는 전체 데이터를 순회할 때 forEach 메소드를 이용할 수 있다.
//		foods.forEach((o)->System.out.println(o));
////		foods.forEach(new Consumer() {  // 위 forEach 문장과 같은 결과값을 갖음
////			@Override
////			public void accept(Object o) {
////				System.out.println(o);
////			}
////		});
//		
//
//		System.out.println("====람다식으로 이름순으로 정렬 후 출력====");
//		foods.sort((o,o2)-> ((Food)o).getName()
//				.compareTo(((Food)o2).getName()));
//		
//		foods.forEach((o)-> System.out.println(o));
//		
//		
//		System.out.println("====중복값을 저장하고 출력====");
//		// ArrayList 클래스는 중복값을 저장함
//		ArrayList names2 = new ArrayList();
//		names2.add("유병승");
//		names2.add("유병승");
//		names2.add("유병승");
//		names2.add("유병승");
//		names2.add("유병승");
//		names2.add("유병승");
//		names2.forEach((o)-> System.out.println(o));
		
		
		
		
		// LinkedList 클래스 이용하기
		// List인터페이스를 구현한 클래스
		// 사용법은 ArrayList 클래스와 유사함
//		LinkedList linkList = new LinkedList();
//		// LinkedList에 값을 대입, 출력, 순회 방법은 ArrayList와 동일함
//		linkList.add("최주영");
//		linkList.add("이동제");
//		linkList.add("최인호");
//		System.out.println(linkList.get(0));
//		linkList.forEach((e)->System.out.println(e));
		
		
		// ArrayList 는 배열형식이며 순차적으로 인덱스 구조를 가짐
		// LinkedList 는 앞뒤로 서로 연결되있는 구조 
		// 둘의 차이는 수정할때 퍼포먼스 속도 차이이다.
		// 저장된 데이터를 조작(중간에 삽입, 수정, 삭제)이 많을 때는 LinkdeList 사용하는것이 좋다.
		// 기본적으로 데이터를 저장, 출력할 때에는 ArrayList 사용
		
//		System.out.println(linkList.getFirst()); 
//		System.out.println(linkList.getLast());
		
		
		
	}
}
