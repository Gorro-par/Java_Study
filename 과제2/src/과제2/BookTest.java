package 과제2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class BookTest {
	
	  public void insertStudent(BookDTO book) {
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
				String sql = insert();
				int result = stmt.executeUpdate(sql);
				String msg = result > -1 ? "성공" : "실패";
				System.out.println(msg);
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
	  
//      public void printAllBooks(){
//    	  String driver = "com.mysql.cj.jdbc.Driver"; 
//			String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
//			Connection conn  = null;
//			Statement stmt = null;
//			ResultSet rs = null;
//			try {
//				Class.forName(driver);
//				conn = DriverManager.getConnection(url, "root", "java");
//				System.out.println("DB 연결 성공!");
//				stmt = conn.createStatement();
//				String sql = select();
//				rs = stmt.executeQuery(sql);
//				ResultSetMetaData rsmd = rs.getMetaData();
//				int cols = rsmd.getColumnCount();
//				while(rs.next()) {
//					for(int i = 1; i <= cols; i++) {
//						System.out.print(rs.getString(i) + "\t");
//					}
//					System.out.println();
//				}
//			}catch(Exception e) {	
//				e.printStackTrace();
//			}finally {
//				try {
//					if(rs != null)rs.close();
//					if(stmt != null) stmt.close();
//					if(conn != null) conn.close();
//				}catch(SQLException e) {}
//			}
//      }
	/**
	 * DATA INSERT
	 * @return sql
	 */
	public static String insert() {
		String sql = "INSERT INTO BOOKDTO VALUES(21424, 'Java Basic', '김하나', 'Jaen.kr', 15000, 'Java 기본 문법')";
//		String sql = "INSERT INTO BOOKDTO VALUES(21424, 'Java Basic', '김하나', 'Jaen.kr', 15000, 'Java 기본 문법')";
//		String sql = "INSERT INTO BOOKDTO VALUES(21424, 'Java Basic', '김하나', 'Jaen.kr', 15000, 'Java 기본 문법')";
//		String sql = "INSERT INTO BOOKDTO VALUES(21424, 'Java Basic', '김하나', 'Jaen.kr', 15000, 'Java 기본 문법')";
//		String sql = "INSERT INTO BOOKDTO VALUES(21424, 'Java Basic', '김하나', 'Jaen.kr', 15000, 'Java 기본 문법')";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select() {
		String sql = "";
		return sql;
	}
}