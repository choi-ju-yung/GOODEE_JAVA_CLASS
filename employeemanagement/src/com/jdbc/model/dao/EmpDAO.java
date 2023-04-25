package com.jdbc.model.dao;

import static com.jdbc.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.jdbc.model.dto.EmpDTO;

public class EmpDAO {
	
	private Properties sql = new Properties();
	
	{
	
	try{
		String path = EmpDAO.class.getResource("/sql/emp/emp_sql.propertie").getPath();
		sql.load(new FileReader(path));
	}catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	
	// 사원 전체조회하는 sql문 실행하는 곳
	public List<EmpDTO> selectEmpAll(Connection conn){
		Statement stmt = null;
		ResultSet rs = null;
		// String sql = "SELECT * FROM MEMBER";
		String sql = this.sql.getProperty("selectEmpAll");
		List<EmpDTO> members = new ArrayList();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				members.add(getEmp(rs));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
		}
		return members;
	}
	
	// 입력한 사원 정보를 바탕으로 값을 추가하는 sql문 실행하는곳
	public int insertMember(Connection conn, EmpDTO e) {
		PreparedStatement pstmt = null;
		int result = 0;
	
		String sql = this.sql.getProperty("insertEmp");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,e.getEmpId());
			pstmt.setString(2, e.getEmpName());
			pstmt.setString(3, e.getEmpNo());
			pstmt.setString(4, e.getEmail()); // 기본자료형에서 String으로 변환시킬때 사용
			pstmt.setString(5, e.getPhone()); 
			pstmt.setString(6, e.getDeptCode());
			pstmt.setString(7, e.getJobCode());
			pstmt.setString(8, e.getSalLevel());
			pstmt.setInt(9, e.getSalary());
			pstmt.setDouble(10, e.getBonus());
			pstmt.setInt(11, e.getManagerId());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException ee) {
			ee.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	// 입력받은 부서를 통해 사원을 조회하는 sql문을 실행하는곳
	public List<EmpDTO> selectEmpByDepart(Connection conn, String depart){
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		String sql = this.sql.getProperty("selectEmpByDepart");
		List<EmpDTO> emps = new ArrayList();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,depart);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emps.add(getEmp(rs));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return emps;
	}
	
	
	public List<EmpDTO> selectEmpByJob(Connection conn, String job){
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		String sql = this.sql.getProperty("selectEmpByJob");
		List<EmpDTO> emps = new ArrayList();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,job);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emps.add(getEmp(rs));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return emps;
	}
	
	public List<EmpDTO> selectEmpByName(Connection conn, String name){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = this.sql.getProperty("selectEmpByName");
		List<EmpDTO> emps = new ArrayList();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emps.add(getEmp(rs));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return emps;
	}
	
	public EmpDTO getEmp(ResultSet rs) throws SQLException{
		EmpDTO e = new EmpDTO();
		
		e.setEmpId(rs.getInt("emp_id"));
		e.setEmpName(rs.getString("emp_name"));
		e.setEmpNo(rs.getString("emp_no"));
		e.setEmail(rs.getString("email"));
		e.setPhone(rs.getString("phone"));
		e.setDeptCode(rs.getString("dept_code"));
		e.setJobCode(rs.getString("job_code"));
		e.setSalLevel(rs.getString("sal_Level"));
		e.setSalary(rs.getInt("salary"));
		e.setBonus(rs.getDouble("bonus"));
		e.setManagerId(rs.getInt("manager_id"));
		e.setHireDate(rs.getDate("hire_date"));
		e.setEntDate(rs.getDate("ent_date"));
		e.setEntYn(rs.getString("ent_Yn").charAt(0));
		
		return e;
	}
	
}
