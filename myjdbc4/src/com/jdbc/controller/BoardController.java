package com.jdbc.controller;

import java.util.List;
import java.util.Map;

import com.jdbc.model.dto.BoardDTO;
import com.jdbc.model.service.BoardService;
import com.jdbc.view.MainView;

public class BoardController {
	
	private BoardService service = new BoardService();
	private MainView view = new MainView();
	
	public void mainMenu() {
		view.mainMenu();
	}
	
	
	public void selectBoardAll() {
		List<BoardDTO> boards = service.selectBoardAll();
		view.printBoard(boards);
	}
	
	public void selectSearchBoard() {
		// 검색할 항목(컬럼명), 검색어
		Map param = view.inputSearch();
		List<BoardDTO> boards= service.searchBoard(param);
		
		view.printBoard(boards);
	}
	
}
