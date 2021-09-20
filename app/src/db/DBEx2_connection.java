package db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBEx2_connection {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
//		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle
//		String url = "jdbc:mysql://localhost:3306/app"; 
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
//		String url = "jdbc:oralce:tin"@localhost:1521:xe"; // oracel
		Connection conn  = null;
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
			conn = DriverManager.getConnection(url, "root", "java");
//			conn = DriverManager.getConnection(url, "hr", "hr"); // oracle
			System.out.println("데이터베이스 연결 성공!");
		}catch(Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}

	}

}
