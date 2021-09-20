package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;



public class DBEx9_unique {
	/*
	 * ex1) [테이블 생성]
	 * 		CREATE TABLE TEST2
 CREATE TABLE TEST2(
	 		ID		VARCHAR(10) UNIQUE,
	 		PW		VARCHAR(30),
	 		NAME	VARCHAR(30),
	 		MDate 	DATE,
	 		AGE 	INT
	 		)
	 */
	
	
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn  = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB 연결 성공!");
			stmt = conn.createStatement();
//			UNIQUE
//			String sql = insert();
			String sql = select();
//			int result = stmt.executeUpdate(sql);
//			String msg = result > -1 ? "성공" : "실패";
//			System.out.println(msg);
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i <= cnt; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		}catch(Exception e) {	
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}
	/**
	 * DATA INSERT
	 * @return sql
	 */
	public static String insert() {
		
		String sql = "INSERT INTO TEST2(ID, PW) VALUES('ABC', '123')";
//		String sql = "INSERT INTO TEST1(PW) VALU	ES('123')";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select() {
		String sql = "SELECT * FROM TEST2";
		return sql;
	}
}