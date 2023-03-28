package com.obj.run;
import com.obj.basicController.MyMethod;
import com.obj.model.vo.Employee;
public class SetterGetterMain {

	public static void main(String[] args) {
//		Employee e = new Employee("유병승","강사부",500,0.5);
//		System.out.println(e.imfoEmp());
		//e.name = "최주영";  // 불가능 name필드는 private이기 때문
		//System.out.println(e.name); // 불가능 name필드는 private이기 때문
		
		// 그래서 필드를 수정, 출력하기 위한 메소드를 선언한다 
		// 수정 : setter()
		// 출력 : getter()
		// setter / getter 메소드는 public으로 선언하고 
		// 각 필드당 한개씩 선언  
		// ex) empNo필드의 대한 setter, getter   name필드에 대한 setter,getter ...등등
		// setter/getter 은 명명 규칙이 있음
		// set필드명 / get필드명 -> 카멜케이스를 준비  ex) setName, getName
		// 클래스 생성하면, 필드는 private으로, 기본생성자, setter, getter 함수 각각 만들거임
		// setter 메소드는 대입할 데이터가 필요하기 때문에 매개변수로 필드에 대입할 값을 받는다.
		// getter 메소드는 데이터를 출력하는 것으로 반환형이 있다.
		
//		e.setName("최");  
//		System.out.println(e.getName()); 
		
		
		// Employee 클래스에 empNo 필드를 제외한 모든 필드에
		// setter getter 메소드를 추가하고
		// 기본생성자로 사원 5명을 생성하고 setter로 값을 대입 후 getter로 출력하기
		// 유병승 강사부 500 0.5
		// 홍길동 강사부 200 0.2
		// 이순신 인사부 300 0.3
		// 최주영 인턴 10 0
		// 김중근 인턴 10 0.2
		
		
		// makeEmployee 와 makeEmployee2를 접근하기 위해서 객체 emp 생성
		Employee emp = new Employee();  

		Employee you = new Employee(); 
		// makeEmployee 안에 첫번째 인수에 클래스 객체를 넣기 위해 객체 you 생성
		emp.makeEmployee(you, "유병승", "강사부", 500, 0.5);
			
		Employee hong = new Employee();
		
		emp.makeEmployee(hong, "홍길동", "강사부", 100, 0.2);
		
		Employee esoonsin = new Employee();
		emp.makeEmployee(esoonsin, "이순신", "인사부", 300, 0.3);
		
		Employee choi = emp.makeEmployee2("최주영", "인턴", 10, 0);
		
		Employee kim = emp.makeEmployee2("김중근", "인턴", 10, 0.2);
		
		
		
		
		
//		you.setName("유병승");
//		you.setDepartment("강사부");
//		you.setSalary(500);
//		you.setBonus(0.5);
//		
//		hong.setName("홍길동");
//		hong.setDepartment("강사부");
//		hong.setSalary(200);
//		hong.setBonus(0.2);
//		
//		esoonsin.setName("이순신");
//		esoonsin.setDepartment("인사부");
//		esoonsin.setSalary(300);
//		esoonsin.setBonus(0.3);
//		
//		choi.setName("최주영");
//		choi.setDepartment("인턴");
//		choi.setSalary(10);
//		choi.setBonus(0);
		
//		kim.setName("김중근");
//		kim.setDepartment("인턴");
//		kim.setSalary(10);
//		kim.setBonus(0.2);
		
		
		System.out.println(you.getEmpNo()+you.getName()+"은 "+you.getDepartment()+"이고 월급은 "
				+ you.getSalary()+"만원 이며 보너스는 "+you.getBonus()+"입니다.");
		
		System.out.println(hong.getEmpNo()+hong.getName()+"은 "+hong.getDepartment()+"이고 월급은 "
				+ hong.getSalary()+"만원 이며 보너스는 "+hong.getBonus()+"입니다.");
		
		System.out.println(esoonsin.getEmpNo()+esoonsin.getName()+"은 "+esoonsin.getDepartment()+"이고 월급은 "
				+ esoonsin.getSalary()+"만원 이며 보너스는 "+esoonsin.getBonus()+"입니다.");
		
		System.out.println(choi.getEmpNo()+choi.getName()+"은 "+choi.getDepartment()+"이고 월급은 "
				+ choi.getSalary()+"만원 이며 보너스는 "+choi.getBonus()+"입니다.");
		
		System.out.println(kim.getEmpNo()+kim.getName()+"은 "+kim.getDepartment()+"이고 월급은 "
				+ kim.getSalary()+"만원 이며 보너스는 "+kim.getBonus()+"입니다.");
		
	}
	
	
	
	

}
