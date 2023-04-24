package com.jdbc.model.service;

import static com.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.jdbc.model.dao.EmpDAO;
import com.jdbc.model.dto.EmpDTO;



public class EmpService {
	private EmpDAO dao = new EmpDAO();
	

	public List<EmpDTO> selectEmpAll(){
		Connection conn = getConnection();
		List<EmpDTO> boards = dao.selectEmpAll(conn);
		close(conn);
		return boards;
	}
	
	
	public int insertEmp(EmpDTO e) {
		Connection conn = getConnection();
		int result = dao.insertMember(conn,e);
		
		// 트렌젝션처리
		if(result>0)commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	
	public List<EmpDTO> selectEmpByDepart(String depart){
		Connection conn = getConnection();
		List<EmpDTO> boards = dao.selectEmpByDepart(conn, depart);
		close(conn);
		return boards;
	}
	
	
	
}
