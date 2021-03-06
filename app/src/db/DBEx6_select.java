package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBEx6_select {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn  = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB 연결 성공!");
			stmt = conn.createStatement();
			String sql = select();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("ID");
				String pw = rs.getString("PW");
				int age = rs.getInt("AGE");
				String date = rs.getString("GRE_DATE");
				System.out.println("ID = " + id
						+ " PW = " + pw + " AGE = " + age + " GRE_DATE = " + date);
				
				
			}
		}catch(Exception e) {	
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}
	/**
	 * SELECT
	 * @return SQL
	 */
	public static String select() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID : ");
		String id = scan.next();
		String sql = "select * from DBTEST3 where id='"+id+"'";
		return sql;
	}
}
