package com.stream.controller;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.stream.common.Gender;
import com.stream.dao.StudentDao;
import com.stream.vo.Student;

public class StreamController {

	public static void main(String[] args) {
		//Builder 패턴으로 객체 생성하기
//		Student s = new Student();
//		s = Student.builder()
//				.stdNo(1)
//				.name("유병승")
//				.age(19)
//				.height(180.5)
//				.gender(Gender.M)
//				.address("경기도 시흥시")
//				.build();  // 리턴값 Student로 받음
//		
//		// Stream에 대해 알아보자
//		System.out.println(s);
//		
//		
//		//이름하고 번호만 만들고 싶을 때
//		s = Student.builder().stdNo(2).name("최주영").build();
//		System.out.println(s);
		
		
		
//		Student.Builder builder =new Student.Builder();
		
		
		
		
		
		
		List<Student> student = StudentDao.getStudents();
		System.out.println(student.size());
		for(Student s : student) {
			System.out.println(s);
		}
		
		
		
		
		//student에 저장된 데이터 중 20살이상인 남학생을 오름차순으로정렬하여 menList에 저장하기
		List<Student> menList = new ArrayList();
		
	
		for(Student s : student) {
			if(s.getGender() == Gender.M && s.getAge() >= 20) {
				menList.add(s);
			}
		}
		System.out.println("== 20살이상인 남학생을 오름차순 정렬하여 출력하기 ==");
		menList.forEach((o)->System.out.println(o));
		
		System.out.println("== 50살이상인 남학생을 람다로 오름차순 정렬하여 출력하기 ==");
		menList = student.stream()
			.filter((s)->s.getGender()==Gender.M)
			.filter((s)->s.getAge()>=50)
			.sorted((s,s1)-> s.getAge() - s1.getAge())
			.limit(5)  // 앞에서 5개만 뽑음
			
			.collect(Collectors.toList());  // 집계한 내용을 리스트로 반환
		menList.forEach((s)->System.out.println(s));
		
		
//		java.util.function.Predicate
		
		// 여학생 중 나이가 30세 이상인 학생 조회
		// womenList에 저장 출력
		System.out.println("==여학생 중 나이가 30세 이상인 학생 조회==");
		List<Student> womenList = new ArrayList();

		womenList = student.stream()
				.filter((s)->s.getAge()>=30)
				.filter((s)->s.getGender() == Gender.F)
				.collect(Collectors.toList());
		womenList.forEach((o)->System.out.println(o));
		
		
		// 학생나이 평균구하기
		double avgAge = student.stream()
		.collect(Collectors.averagingDouble(s->s.getAge()));

		System.out.println("학생의 평균 나이 : "+avgAge);
		
		
		// 학생 키 평균구하기
		double avgHeight = student.stream()
				.collect(Collectors.averagingDouble(Student::getHeight)); //메소드 참조
		System.out.println("학생의 키 평균 : "+avgHeight);
		
		
		//원하는 값만 출력하기
		//여학생 중 나이가 20대인 학생이름만 출력하기
		List<String> names = student.stream()
		.filter((s)->s.getGender()==Gender.F && s.getAge()>=20 && s.getAge()<30)
		.map((s)->s.getName()) // 맵 안에있는 타입으로 리턴되서 제네릭표시해야함
		.collect(Collectors.toList());
		System.out.println(names);
		
		
		//나이에 대한 합계, 평균, 수를 한번에 구하기
		IntSummaryStatistics iss = student.stream()
				.collect(Collectors.summarizingInt(Student :: getAge));
		System.out.println("수 "+iss.getCount());
		System.out.println("합계 "+iss.getSum());
		System.out.println("평균 "+iss.getAverage());
	
		


		// 데이터를 그룹별로 집계하기
		// 10대, 20대, 30대, 40, 50대 까지 연령별로 분리하기
		Map<String,List<Student>> studentGroup =
					student.stream()
					.collect(Collectors.groupingBy(
							s->{
								if(s.getAge()>=20 && s.getAge()<30)
									return "20대";
								else if(s.getAge()>=30 && s.getAge()<40)
									return "30대";
								else if(s.getAge()>=40 && s.getAge()<50)
									return "40대";
								else if(s.getAge()>=50 && s.getAge()<60)
									return "50대";
								else
									return "10대";
							}));
		
		System.out.println(studentGroup.get("20대").size());
		System.out.println(studentGroup.get("30대").size());
		System.out.println(studentGroup.get("40대").size());
		System.out.println(studentGroup.get("50대").size());
		
		
		
	}
}
