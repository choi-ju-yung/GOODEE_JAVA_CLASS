package com.inherit.run;

import com.inherit.model.vo.FinalTestClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new InheriteController().basicInheritTest();
//		new InheriteController().overrideTest();
		
		
		FinalTestClass ftc = new FinalTestClass();
		ftc.setTest("사용은 문제없음");
		System.out.println(ftc.getTest());
		
	}

}
