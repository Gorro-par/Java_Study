package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBEx14 {

//  ALTER 문
//	- TABLE 변경
//	[테이블 생성] : ATTEST
	/*
	 String sql = "CREATE TABLE ATTEST(" +
	 "ID VARCHAR(10) NOT NULL, " +
	 "PW VARCHAR(10))"; 
	 
	실습1) 테이블에 새로운 컬럼 추가
	실습2) 테이블에 컬럼 타입 변경
	실습3) 테이블의 컬럼 이름 변경
	실습4) 테이블 컬럼 삭제
	연습문제) MEMBER 테이블에 primary key 추가
	
	*/
	String sql = alter();
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		String sql = alter();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		}catch (SQLException e) {e.printStackTrace();}
		finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
		
	}
	public static String alter() {
//		String sql = "ALTER TABLE ATTEST ADD COLUMN AGE VARCHAR(10)" ;
//		String sql = "ALTER TABLE ATTEST MODIFY COLUMN AGE INT" ;
//		String sql = "ALTER TABLE ATTEST CHANGE COLUMN PW PASSWORD VARCHAR(30)NOT NULL";
		String sql = "ALTER TABLE ATTEST DROP COLUMN AGE";
		return sql;
		
	}
}
