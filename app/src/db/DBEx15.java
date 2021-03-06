package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class DBEx15 {

	/* ORDER BY 문
	 	- ORDER BY (ASC[ascending], DESC[descending]) 정렬
	 	[테이블 생성] : OBTEST
	 	CREATE TABLE OBTEST(
	 				NUM INT,
	 				ID VARCHAR(10));
	 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql = insert();
//		String sql = orderBy();
		try {
//			insert!!
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
			
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			rsmd = rs.getMetaData();
//			int cols = rsmd.getColumnCount();
//			for(int i = 1; i <= cols; i++) {
//				String columnName = rsmd.getCatalogName(i);
//				System.out.print(columnName + "\t");
//			}
//			System.out.println("\n-------------------------------------------------------");
//			while (rs.next()) {
//				for (int i = 1; i <= cols; i++) {
//					System.out.print(rs.getString(i) + "\t");
//				}
//				System.out.println();
//			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)rs.close();
				if (stmt != null)stmt.close();
				if (conn != null)conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	/**
	 * DATA INSERT
	 * 
	 * @return sql
	 */
	public static String insert() {
//		String sql = "INSERT INTO OBTEST VALUES (1, 'abc')";
		String sql = "INSERT INTO OBTEST VALUES (2, 'def')";
//		String sql = "INSERT INTO OBTEST VALUES (3, 'ghi')";
		return sql;
	}
	public static String select() {
		String sql = "SELECT * FROM OBTEST ORDER BY NUM ASC";
		return sql;
	}
}	
