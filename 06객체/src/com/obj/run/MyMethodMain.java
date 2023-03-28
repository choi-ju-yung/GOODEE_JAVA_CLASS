package com.obj.run;

import java.util.Arrays;

import com.obj.basicController.MyMethod;
import com.obj.model.vo.Animal;

public class MyMethodMain {

	public static void main(String[] args) {
		
		MyMethod m1 = new MyMethod();
//		m1.enjoyEat();
//		System.out.println(m1.numberPlus());
//		System.out.println(m1.message());
//		m1.printCal(2, 3, '+');
//		System.out.println(m1.returnCal(2, 3, '+'));
//		System.out.println(m1.dupleString("apled"));
		
		int[] intArr = m1.testReturn(); // 배열을 intArr로 리턴받음
		System.out.println(Arrays.toString(intArr));
		
		Animal a = m1.makeAnimal();
		System.out.println(a);
		System.out.println(a.kindof+a.name+a.weight);
		
		m1.paramArr(intArr);
		m1.paramObj(a, "강아지");
		System.out.println(a.kindof+a.name+a.weight);
		
		// 매개변수, 반환형으로 배열이나 객체를 선언했을 때는 heap 영역의
		// 주소를 공유하게됨 -> 원본값을 수정할 수 있게됨
		
		int su = 10;
		m1.changeInt(su);
		int[] numbers = {1,2,3,4};
		m1.changeIntArr(numbers);
		System.out.println(su)	;
		System.out.println(numbers[0]);
		
		//main 메소드 매개변수 넣기!
		
	}

}
