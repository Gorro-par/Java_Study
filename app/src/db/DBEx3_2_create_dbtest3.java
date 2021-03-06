package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBEx3_2_create_dbtest3 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
		String url ="jdbc:mysql://localhost:3306/webapp?characterEncoding=UTF-8&serverTimezone=UTC";

		Connection conn  = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("데이터베이스 연결 성공!");
			String sql = "CREATE TABLE USERINFO(\r\n"
					+ "ID		VARCHAR(50) PRIMARY KEY NOT NULL COMMENT"
					+ "PW		VARCHAR(30) NOT NULL COMMENT"
					+ "NAME 	VARCHAR(20) NOT NULL COMMENT)";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e) {	
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {}
		}
	}
}
