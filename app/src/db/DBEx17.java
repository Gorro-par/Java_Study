package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx17 {
//	EX1) NOW, SYSDATE : ���� �ð�, ��¥ ���� ���
//	EX2) CURDATE, CURRENTDATE : ���� ���� ���� ���
//	EX3) CURTIME, CURRENTTIME : ���� �ð����� ���
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
//		EX1) NOW, SYSDATE : ����ð� ��¥���� ���
//		String sql = "SELECT SYSDATE() SYSDATE, NOW() NOW";
//		EX2) CURDATE, CURRENTDATE : ���� ���� ���� ���
//		String sql = "SELECT CURDATE () CURDATE, CURRENT_DATE() CURRENTDATE";
//		EX3) CURTIME, CURRENTTIME : ���� �ð����� ���
		String sql = "SELECT CURTIME() CURTIME, CURRENT_TIME() CURRENTTIME";
		return sql;
	}
}
