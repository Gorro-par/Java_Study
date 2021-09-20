package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx5_update {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB연결 성공!");
			stmt = conn.createStatement();
//			UPDATE 문
			String sql = update();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * DATA UPDATE
	 * @return sql
	 */
	public static String update() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		
		String sql = "UPDATE DBTEST3 SET PW='"+pw+"', ID='111', AGE=19, GRE_DATE=now() WHERE ID='"+id+"'";
		return sql;
	}
}
