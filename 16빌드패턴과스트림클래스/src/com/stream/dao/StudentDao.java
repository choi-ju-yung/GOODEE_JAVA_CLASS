package com.stream.dao;

import java.util.ArrayList;
import java.util.List;

import com.stream.common.Gender;
import com.stream.vo.Student;

public class StudentDao {
	
	private static List<Student> students = new ArrayList(); //싱글톤패턴
	
	public StudentDao() {}
	
	static {
		for(int i=0; i<100; i++) {
			// 빌더팬터으로 이용해서 객체를 생성해보자 (만들고 싶은 타입으로 객체생성 가능)
			students.add(Student.builder()
					.stdNo(i+1)
					.name("test"+i)
					.age((int)(Math.random()*50)+10)
					.height(Math.random()*(190-150)+150)
					.gender(i%2==0 ? Gender.M : Gender.F)
					.address("test"+i)
					.build());
		}
	}
	
	public static List<Student> getStudents(){ 
		return StudentDao.students;
	}
	
	
	
}
