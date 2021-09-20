package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class DBEx5_delete {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn  = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB 연결 성공!");
			stmt = conn.createStatement();
//			DELETE 문
			String sql = delete();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
		}catch(Exception e) {	
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {}
		}
	}
	public static String delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할려는DB의 ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		String sql = "DELETE FROM DBTEST2 WHERE ID='"+id+"' || PW='"+pw+"'";
		return sql;
	}
}