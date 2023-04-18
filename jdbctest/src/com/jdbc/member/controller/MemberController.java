package com.jdbc.member.controller;

import java.util.List;

import com.jdbc.member.model.dao.MemberDAO;
import com.jdbc.member.model.dto.MemberDTO;
import com.jdbc.view.MainView;

public class MemberController {
	
	private MemberDAO dao = new MemberDAO();
	// private MainView view = new MainView();  -> 선언시 스택오버플루 오류 발생 (서로호출해서)
	
	public void mainMenu() {
		new MainView().mainMenu();
	}
	
	// 전체 회원 조회하기
	public void selectAllMember() {
		// Database의 Student 계정에 있는 Member 테이블의 모든 데이터를 
		// 가져와 출력하는 기능
		// 1. DB에서 Member 테이블의 모든 데이터(row) 가져오기  -> DAO 클래스 역할
		
		List<MemberDTO> members = dao.selectAllMember(); // 0~다수개의 데이터를 반환하기위해서 리스트 생성
				
		// 2. 가져온 데이터 출력하기 -> View 클래스 역할
		new MainView().printMembers(members);
	}
	
	
	
	public void selectMemberById() {
		// DB의 member 테이블에서 사용자가 작성한 아이디와 일치한 데이터 가져오기
		// 1. 사용자가 아이디를 작성할 수 있게 해줌 -> 화면상에 입력받아옴.
		
		String inputId = new MainView().inputData("아이디");
		
		// 2. 작성한 아이디와 일치하는 아이디를 DB에서 조회
		MemberDTO m = dao.selectMemberById(inputId);

		
		// 3. 조회한 회원 출력하기
		new MainView().printMember(m);
	}
	
	
	
	public void selectMemberByName() {
		// DB의 member 테이블에서 이름과 부분일치하는 데이터를 가져와 출력해주는 기능
		
		String name = new MainView().inputData("이름");
		List<MemberDTO> members = dao.selectMemberByName(name); 
		new MainView().printMembers(members);
	}
	
	
	
	public void insertMember() {
		MemberDTO member = new MainView().addMember();
		
		int result = dao.insertMember(member);
		
		new MainView().printMsg(result>0?"회원등록성공" : "회원등록실패");
	}
	
	
	public void updateMember() {
		MemberDTO member = new MainView().updateData();
		
		int result = dao.updateMember(member);
		
		new MainView().printMsg(result>0?"회원등록성공" : "회원등록실패");
	}
	
	
	
}
