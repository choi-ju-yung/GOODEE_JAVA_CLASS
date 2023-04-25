package com.jdbc.view;

import java.util.List;
import java.util.Scanner;

import com.jdbc.controller.EmpController;
import com.jdbc.model.dto.EmpDTO;


public class MainView {
	Scanner sc = new Scanner(System.in);
	EmpController controller = new EmpController();
	public void mainMenu() {
		 // 지역변수로 선언해도 가능(외부에서 사용안하기 때문)
		
		while(true) {
			System.out.println("==== 사원관리 프로그램 ====");
			System.out.println("1. 전체 사원 조회");
			System.out.println("2. 사원 조회 SubMenu(1.부서, 2.직책, 3.이름, 4. 급여(크고 작고))");
			System.out.println("3. 사원 등록");
			System.out.println("4. 사원 수정 (직책, 부서, 급여, 전화번호, 이메일)");
			System.out.println("5. 사원 삭제");
			System.out.println("6. 부서 관리 submenu(1.등록, 2.수정,3.삭제)");
			System.out.println("7. 직책 관리 submenu(1.등록, 2.부서수정,3.삭제)");
			System.out.println("0. 프로그램 종료");
		
			System.out.print("메뉴선택 : ");
			int cho = sc.nextInt();
			
			switch(cho) {
				case 1: controller.selectEmpAll(); break;
				case 2: controller.empSubmenu(); break;
				case 3: controller.insertEmp(); break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 7: break;
				case 0: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("0~7사이의 메뉴를 입력하세요");
			}
		}
	}
	
	// 전체 사원을 조회하는 메소드
	public void printEmpAll(List<EmpDTO> Emps) {
		System.out.println("===== 사원 리스트 =====");
		if(Emps.isEmpty()) {
			System.out.println("조회된 사원이 없습니다.");
		}else {
			Emps.forEach((e)-> System.out.println(e));
		}
		System.out.println("====================");
	}
	
	
	// 사원에 대한 정보를 등록하는 뷰 화면
	public EmpDTO inputEmp() {
		EmpDTO e = new EmpDTO();
		System.out.println("===== 사원등록 =====");
		System.out.print("등록할 사원 번호 입력 : ");
		int empId = sc.nextInt();
		e.setEmpId(empId);
		sc.nextLine();
		System.out.print("등록할 사원 이름 입력 : ");
		String empName = sc.nextLine();
		e.setEmpName(empName);
		System.out.print("등록할 사원 주민번호 입력 : ");
		String empNo = sc.nextLine();
		e.setEmpNo(empNo);
		System.out.print("등록할 사원 이메일 입력 : ");
		String email = sc.nextLine();
		e.setEmail(email);
		System.out.print("등록할 사원 전화번호 입력 : ");
		String phone = sc.nextLine();
		e.setPhone(phone);
		System.out.print("등록할 사원 부서코드 입력 : ");
		String deptCode = sc.nextLine();
		e.setDeptCode(deptCode);
		System.out.print("등록할 사원 직원코드 입력 : ");
		String jobCode = sc.nextLine();
		e.setJobCode(jobCode);
		System.out.print("등록할 연봉레벨 입력 : ");
		String salLevel = sc.nextLine();
		e.setSalLevel(salLevel);
		System.out.println("등록할 사원 월급 입력 : ");
		int salary = sc.nextInt();
		e.setSalary(salary);
		System.out.println("등록할 사원 보너스 입력 : ");
		double bonus = sc.nextDouble();
		e.setBonus(bonus);
		System.out.println("등록할 사원 매니저 번호 입력 : ");
		int managerNo = sc.nextInt();
		e.setManagerId(managerNo);
		return e;
	}
	
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	
	public String inputData(String title) {
		System.out.println("==== 검색할 "+title+" 입력 ====");
		System.out.print("입력 : ");
		return sc.nextLine();
	}
	
	public void empSubmenu() {
		int cho = 0;
		
		while(true) {
			System.out.println("==== 사원조희 기준 선택 ====");
			System.out.println("1. 부서로 사원조회");
			System.out.println("2. 직책으로 사원 조회");
			System.out.println("3. 이름으로 사원 조회");
			System.out.println("4. 급여 크기로 사원 조회");
			System.out.println("0. 메인화면으로 이동");
			
			System.out.print("메뉴선택 : ");
			cho = sc.nextInt();
			
			if(cho >=0 && cho <5) {
				break;
			}else {
				System.out.println("0~4사이의 번호를 입력하세요");
			}
		}

		switch(cho) {
			case 1: controller.selectEmpByDepart(); break;
			case 2: controller.selectEmpByJob(); break;
			case 3: controller.selectEmpByName(); break;
			case 4: //controller.selectEmpBySalary(); break; break;
			case 0: System.out.println("메인화면으로 이동합니다."); return;

		}
	}
	
}
