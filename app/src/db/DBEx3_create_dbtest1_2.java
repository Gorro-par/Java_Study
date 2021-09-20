package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBEx3_create_dbtest1_2 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
//		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle
//		String url = "jdbc:mysql://localhost:3306/app"; 
		String url ="jdbc:mysql://localhost:3306/webapp?characterEncoding=UTF-8&serverTimezone=UTC";
//		String url = "jdbc:oralce:tin"@localhost:1521:xe"; // oracel
		Connection conn  = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
			conn = DriverManager.getConnection(url, "root", "java");
//			conn = DriverManager.getConnection(url, "hr", "hr"); // oracle
			System.out.println("데이터베이스 연결 성공!");
//			String sql = "CREATE TABLE ZIPCODE ("
//					+ "		 ZIPCODE VARCHAR(7),\r\n"
//					+ "		 SIDO VARCHAR(4),\r\n"
//					+ "		 GUGUN VARCHAR(17),\r\n"
//					+ "		 DONG VARCHAR(26),\r\n"
//					+ "		 RI VARCHAR(15),\r\n"
//					+ "		 BLDG VARCHAR(42),\r\n"
//					+ "		 BUNJI VARCHAR(17),\r\n"
//					+ "		 SEQ VARCHAR(5),\r\n"
//					+ "		 PRIMARY KEY (SEQ)\r\n"	
//					+ "		 )"; 
//			String sql = "	 CREATE TABLE JNTEST1(\r\n"
//					+ "	 	ID INT PRIMARY KEY auto_increment,\r\n"
//					+ "	 	PHONE VARCHAR(15),\r\n"
//					+ "	 	NAME VARChAR(10)\r\n"
//					+ "	 	)";
			   String sql = "create table USERINFO("
		                 + " ID varchar(50) PRIMARY KEY NOT NULL,"
		                 + " PW varchar(30) NOT NULL,"
		                 + " NAME varchar(20) NOT NULL)";

//			String sql = "create table DBTEST2(ID varchar(10), PW varchar(10))";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e) {	
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}

	}

}
