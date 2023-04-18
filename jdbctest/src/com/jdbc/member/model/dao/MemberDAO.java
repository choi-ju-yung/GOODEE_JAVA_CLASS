package com.jdbc.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.jdbc.member.model.dto.MemberDTO;

public class MemberDAO {
	
	
	public List<MemberDTO> selectAllMember(){
		// DB에 접속해서 member 테이블에 있는 전체데이터를 가져오는 기능 -> select -> ResultSet이 필요함
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBER";
		List<MemberDTO> members = new ArrayList();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"student",
					"student");
			conn.setAutoCommit(false); // 커밋 자동으로 설정하지 않는 문구
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery(sql);
			
			// 다수 값 -> while문, 0~1개로 출력되면 -> if
			while(rs.next()) {
//				MemberDTO member = new MemberDTO(); 
//				member.setMemberId(rs.getString("member_id"));
//				member.setMemberPwd(rs.getString("member_pwd"));
//				member.setMemberName(rs.getString("member_name"));
//				member.setAge(rs.getInt("age"));
//				member.setGender(rs.getString("gender").charAt(0));
//				member.setPhone(rs.getString("phone"));
//				member.setEmail(rs.getString("email"));
//				member.setAddress(rs.getString("address"));
//				member.setHobby(rs.getString("hobby").split(","));
//				member.setEnrollDate(rs.getDate("enroll_Date"));
				members.add(getMember(rs)); // getMember 메소드로 코드를 간결하게 가능
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return members;
	}
	
	
	
	
	public MemberDTO selectMemberById(String id){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		MemberDTO m = null;
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = '"+id+"'";
//		List<MemberDTO> members = selectAllMeber();
//		members.stream().filter(m1->m1.getMemberId().equals(id))
//		.collect(Collectors.toList()).get(0);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","student");
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if(rs.next()) {
				m = getMember(rs);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt!= null)stmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return m;
	}
	
	
	
	public List<MemberDTO> selectMemberByName(String name){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<MemberDTO> members = new ArrayList();
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE  '%"+name+"%'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@lOCALHOST:1521:XE",
							"student","student");
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				members.add(getMember(rs));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt!= null)stmt.close();
				if(conn!= null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return members;
	}
	
	
	
	public int insertMember(MemberDTO m) {
		Connection conn =null;
		Statement stmt = null;
		int result = 0;
		
		String sql = "INSERT INTO MEMBER VALUES('"+m.getMemberId()+"','"
				+ m.getMemberPwd()+"','"+m.getMemberName()+"','"
				+m.getGender()+"',"+m.getAge()+",'"+m.getEmail()+"','"
				+m.getPhone()+"','"+m.getAddress()+"','"
				+String.join(",",m.getHobby())+"',DEFAULT)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@lOCALHOST:1521:XE",
					"student","student"); 
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			// 트렌젝션 처리하기
			if(result >0) conn.commit();
			else conn.rollback();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
	
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	

	// SQLException 처리를 throws 예외처리로 함
	private MemberDTO getMember(ResultSet rs) throws SQLException{
		MemberDTO m = new MemberDTO();
		m.setMemberId(rs.getString("member_id"));
		m.setMemberPwd(rs.getString("member_pwd"));
		m.setMemberName(rs.getString("member_name"));
		m.setAge(rs.getInt("age"));
		m.setGender(rs.getString("gender").charAt(0));
		m.setPhone(rs.getString("phone"));
		m.setEmail(rs.getString("email"));
		m.setAddress(rs.getString("address"));
		m.setHobby(rs.getString("hobby").split(","));
		m.setEnrollDate(rs.getDate("enroll_Date"));	
		return m;
	}
	
	
	
	
	public int updateMember(MemberDTO member) {
		Connection conn =null;
		Statement stmt = null;
		int result = 0;
		
		String sql = "UPDATE MEMBER SET MEMBER_NAME = '"+member.getMemberName()
				+ "',AGE="+member.getAge()+",email='"+member.getEmail()
				+ "',address='"+member.getAddress()
				+"' WHERE MEMBER_ID ='"+member.getMemberId()+"'";
			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@lOCALHOST:1521:XE",
					"student","student"); 
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			// 트렌젝션 처리하기
			if(result >0) conn.commit();
			else conn.rollback();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
	
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
}
