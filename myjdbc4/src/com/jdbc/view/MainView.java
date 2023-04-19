package com.jdbc.view;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.jdbc.controller.BoardController;
import com.jdbc.model.dto.BoardDTO;

public class MainView {
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		
		BoardController controller = new BoardController(); // 지역변수로 선언해도 가능(외부에서 사용안하기 때문)
		
		while(true) {
			System.out.println("==== 게시물 관리 프로그램 ====");
			System.out.println("1. 전체 댓글조회");
			System.out.println("2. 게시글 항목(제목,내용,작성자) 조회하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			int cho = sc.nextInt();
			
			switch(cho) {
				case 1: controller.selectBoardAll(); break;
				case 2: controller.selectSearchBoard(); break;
				case 0: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("0~1사이의 메뉴를 입력하세요");
			}
		}
	}
	
	
	public void printBoard(List<BoardDTO> boards) {
		System.out.println("===== 게시글 리스트 =====");
		if(boards.isEmpty()) {
			System.out.println("조회된 게시글이 없습니다.");
		}else {
			boards.forEach((b)-> System.out.println(""+b.getComments().size()+b));
		}
		System.out.println("=====================");
	}
	
	
	public Map inputSearch() {
		System.out.println("==== 게시글 항목별검색 ====");
		System.out.print("항목 1. 제목 2. 내용 3. 작성 : ");
		int colCho = sc.nextInt();
		sc.nextLine();
		String col = "";
		switch(colCho) {
			case 1 : col="board_title"; break;
			case 2 : col="board_content"; break;
			case 3 : col="board_writer"; break;
		}
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		return Map.of("col",col,"keyword",keyword); // 맵타입으로 반환
	}
	
}
