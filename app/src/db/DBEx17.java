package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx17 {
//	EX1) NOW, SYSDATE : 현재 시간, 날짜 정보 출력
//	EX2) CURDATE, CURRENTDATE : 현재 날자 정보 출력
//	EX3) CURTIME, CURRENTTIME : 현재 시간정보 출력
	public static void main(String[] args) {
	DBAction db = DBAction.getInstance();
	Connection conn = db.getConnection();
	Statement stmt = null;
	ResultSet rs = null;
	ResultSetMetaData rsmd = null;
	String sql = select();
	try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		for(int i = 1; i <= cols; i++) {
			String columnName = rsmd.getCatalogName(i);
			System.out.print(columnName + "\t");
		}
		System.out.println("\n-------------------------------------------------------");
		while (rs.next()) {
			for (int i = 1; i <= cols; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
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
	public static String select() {
//		EX1) NOW, SYSDATE : 현재시간 날짜정보 출력
//		String sql = "SELECT SYSDATE() SYSDATE, NOW() NOW";
//		EX2) CURDATE, CURRENTDATE : 현재 날자 정보 출력
//		String sql = "SELECT CURDATE () CURDATE, CURRENT_DATE() CURRENTDATE";
//		EX3) CURTIME, CURRENTTIME : 현재 시간정보 출력
		String sql = "SELECT CURTIME() CURTIME, CURRENT_TIME() CURRENTTIME";
		return sql;
	}
}
