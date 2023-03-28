package com.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public static void main(String[] args) {
		
		// java에서 날짜 처리하기
		// java.util 패키지의 Date, Calendar, GregorianCalendar 클래스 이용
		// Date -> java.util.Date(자바프로그래밍) / java.sql.Date(DB연동날짜)
		// sql.Date가 util.Date를 상속받고 있음
		// java 8버전
		// java.util.time 패키지
		// LocalDate, LocalTime, LocalDateTime 클래스를 추가
		
		// 오늘날짜 출력하기
		Date today = new Date(); // java.util.Date 임포트해야함
		System.out.println(today);
		
		// long값을 대입해서 생성하기
		today = new Date(12345678l); // long타입이기 때문에 끝에 l 붙여야함
		System.out.println(today); // 규칙에 맞게 날짜가 바뀜
		
		// deprecated (언젠간 사라지는 메소드) 사용하지 않아야한다, 함수에 밑줄쳐져있음
		// today.getDate();
		
		
		// Calendar 클래스 이용하기
		// Calendar 클래스는 추상클래스임
		// Calendar c = new Calendar(); // 추상클래스라서 직접 생성이 불가능함
		Calendar c = Calendar.getInstance(); // 하나의 객체로 접근하게 함(싱글톤패턴) 
		System.out.println(c);
		
		// 년 월 일을 출력하려면 각 데이터를 따로 가져와야함
		// get(필드값)
		// 컴퓨터가 나타내는 값을 기준으로 출력함

		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		System.out.println(year+"년 "+month+"월 "+date+"일");
		System.out.println("시 : "+c.get(Calendar.HOUR));
		System.out.println("분 : "+c.get(Calendar.MINUTE));
		System.out.println("초 : "+c.get(Calendar.SECOND));

		
		//Calendar에 원하는 날짜 세팅하기
		//Calendar().set(항목,설정값) 메소드를 이용
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR, 1998);
		birthDay.set(Calendar.MONTH, 8-1);
		birthDay.set(Calendar.DATE, 3);
		year = birthDay.get(Calendar.YEAR);
		month = birthDay.get(Calendar.MONTH)+1;
		date = birthDay.get(Calendar.DATE);
		System.out.println(year+"."+month+"."+date);
		
		
		
		//GregorianCalendar 클래스 이용
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		// 날짜값을 가져오려면 get메소드를 이용해야한다.
		System.out.println("년 : "+gc.get(Calendar.YEAR));
		gc.set(Calendar.YEAR, 1998);   // 현재년을 1998년으로 바꿈
		System.out.println("년 : "+gc.get(Calendar.YEAR));
		// 생성과 동시에 날짜를 설정할 수 있음
		gc = new GregorianCalendar(1998,8-1,16);
		System.out.println("년 : "+gc.get(Calendar.YEAR));
		System.out.println("월 : "+(gc.get(Calendar.MONTH)+1));
		System.out.println("일 : "+gc.get(Calendar.DATE));
		
		
		//Date 클래스와 Calendar, GreorianCalendar 호환
		Date dday = new Date(c.getTimeInMillis()); // 저장되어있는 시간을 long으로 반환
		System.out.println(dday);
		
		dday = new Date(gc.getTimeInMillis());
		System.out.println(dday);
		
		
		
		// 날짜 클래스를 원하는 패턴의 문자열로 변경해주는 클래스를 제공
		// SimpleDateFormat 클래스
		// 지정기호
		// y : 년
		// M : 월
		// d : 일
		// E : 요일
		// h : 시간
		// m : 분
		// s : 초
		// SSS : 밀리세컨
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년/MM월/dd일 E요일 hh:mm:ss");
		// 매개변수로 Date 클래스를 선언해놓음
		String dateStr = sdf.format(new Date(c.getTimeInMillis()));
		System.out.println(dateStr);
		
		dateStr = sdf.format(new Date(gc.getTimeInMillis()));
		System.out.println(dateStr);
		
		
		// Web에서는 날짜데이터가 문자열처리
		// 2023-03-22 => Date로 변환하기
		String birthStr = "1997-12-21";
		String[] birthArr = birthStr.split("-");
		GregorianCalendar inputDate = new GregorianCalendar(
				Integer.parseInt(birthArr[0]),
				Integer.parseInt(birthArr[1])+1,
				Integer.parseInt(birthArr[2]));

		dateStr = sdf.format(inputDate.getTime());
		System.out.println(dateStr);
		
		
		
		//SimpleDateFormate 클래스가 제공한 메소드 이용하기
		// parse() 
		SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			dday = convert.parse(birthStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(dday);
		
		
		
		// java 8버전부터 날짜처리하는 클래스를 추가함
		// java.time 패키지를 제공함
		LocalDate ld = LocalDate.now(); // 현재날짜
		System.out.println(ld);
		
		//원하는 날짜를 세팅하기
		ld = LocalDate.of(1999, 4, 16);
		System.out.println(ld);
		
		// 년, 월, 일 출력하기
		year = ld.getYear();
		month = ld.getMonthValue();
		date = ld.getDayOfMonth();
		System.out.println(year+"."+month+"."+date);
		
		
		
		// LocalTime : 시간에 대한 설정하는 클래스
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		//시간을 설정해서 출력하기
		lt = LocalTime.of(12,50,00);
		System.out.println(lt);
		//시간, 분, 초 따로 출력하기
		lt = LocalTime.now();
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
		
		// LocalDateTime클래스 : 날짜와 시간을 모두 저장하는 클래스
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		ldt = LocalDateTime.of(2000,11,16,11,30);
		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getHour());
		
		// 날짜사이 간격을 계산해주는 메소드 이욯아기
		long result = ChronoUnit.DAYS.between(ldt, LocalDateTime.now());
		System.out.println("예린씨가 살아온 날 : "+result);
		
		result = ChronoUnit.MONTHS.between(ldt, LocalDateTime.now());
		System.out.println("예린씨가 살아온 개월 수 : "+result);
		
		
		// DB연동해야함 java.sql.Date 클래스를 이용함.
		
		// LocalDateTime -> Date
		Date temp = java.sql.Date.valueOf(LocalDate.now());
		System.out.println(temp);
		
		
		// LocalDateTime -> Date
		temp = java.sql.Timestamp.valueOf(ldt);
		System.out.println(temp);
		
		// Date -> LocalDate
		LocalDate ld2 = new java.sql.Date(gc.getTimeInMillis()).toLocalDate();
		System.out.println(ld2);
		
		// Date -> LocalDateTime
		LocalDateTime ldt2 = new java.sql.Timestamp(new Date().getTime())
				.toLocalDateTime();

	}
	
	
}
