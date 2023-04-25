package com.jdbc.controller;

import java.util.List;

import com.jdbc.model.dto.EmpDTO;
import com.jdbc.model.service.EmpService;
import com.jdbc.view.MainView;

public class EmpController {
	
	private EmpService service = new EmpService();
	//private MainView view = new MainView();
	

	public void mainMenu() {
		new MainView().mainMenu();
	}
	

	public void selectEmpAll() {
		List<EmpDTO> Emps = service.selectEmpAll();
		new MainView().printEmpAll(Emps);
	}
	
	public void insertEmp() {
		EmpDTO e = new MainView().inputEmp();
		int cnt = service.insertEmp(e);
		
		new MainView().print(cnt > 0 ? "사원 추가 성공" : "사원 추가 실패");
	}
	
	// 2번 (사원조회 메뉴 보여주는 기능)
	public void empSubmenu() {
		new MainView().empSubmenu();
	}
	
	// 사원조회에서 부서 메뉴 기능
	public void selectEmpByDepart() {
		String depart = new MainView().inputData("부서");
		List<EmpDTO> emps = service.selectEmpByDepart(depart);
		new MainView().printEmpAll(emps);
	}
	
	// 사원조회에서 직책 메뉴 기능
	public void selectEmpByJob() {
		String job = new MainView().inputData("직책");
		List<EmpDTO> emps = service.selectEmpByJob(job);
		new MainView().printEmpAll(emps);
	}
	
	public void selectEmpByName() {
		String name = new MainView().inputData("이름");
		List<EmpDTO> emps = service.selectEmpByName(name);
		new MainView().printEmpAll(emps);
	}
	
	
	
}
