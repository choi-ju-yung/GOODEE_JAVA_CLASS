package com.jdbc.model.service;

import static com.jdbc.common.JDBTemplate.close;
import static com.jdbc.common.JDBTemplate.getConnection;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.jdbc.model.dao.BoardDAO;
import com.jdbc.model.dto.BoardDTO;

public class BoardService {
	private BoardDAO dao = new BoardDAO();
	
	//1. DB에 연결하는 Connection 객체를 관리
	//2 .트렌젝션처리(commit, rollback)를 여기서함
	//3. 서비스에 해당하는 DAO 클래스를 호출해서 연결 DB에서 SQL문을 실행시키는 기능
	
	public List<BoardDTO> selectBoardAll(){
		Connection conn = getConnection();
		List<BoardDTO> boards = dao.selectBoardAll(conn);
//		for(BoardDTO b : boards) {
//			b.setComments(dao.selectBoardComment(conn, b.getBoardNo()));
//		}
		close(conn);
		return boards;
	}
	
	public List<BoardDTO> searchBoard(Map param){
		Connection conn = getConnection();
		List<BoardDTO> boards = dao.searchBoard(conn,param);
		close(conn);
		return boards;
	}
}
