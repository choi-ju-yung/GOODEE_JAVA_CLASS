package com.obj.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InitblockTest {
	// 초기화 블록 테스트
	public String test;
	public int testnum;
	
	
	// 초기화 블록 선언하기  (클래스를 객체화 할때마다 무조건 실행됨)
	{
		System.out.println("InitblockTest클래스 생성!");
		test = "야구 화이팅";
		testnum = 200;

		// 초기화 블록 안에서는 (조건문, 반복문 사용할 수 있음)
		// 하지만 초기화 블록 밖에서는 사용하지 못하고 초기값만 설정할 수 있음
		int count = 0;
		for(int i=1; i<=10; i++) {
			count += i;
		}
		
		if(test.charAt(0)=='야') {
			test += "이긴다";
		}
		
		testnum += count;
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		test = sdf.format(today)+(int)(Math.random()*10000)+1;
	}
	
	
}
