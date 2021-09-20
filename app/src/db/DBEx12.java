package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;



public class DBEx12 {
	/*
	- DEFAULT
	DEFAULT ���� ������ �ش� �ʵ��� �⺻���� ������ �� �ְ� ���ݴϴ�.
	���� ���ڵ带 �Է��� �� �ش� �ʵ� ���� �������� ������,
	�ڵ����� ������ �⺻���� �����Ѵ�.
	[���̺� ����]
				CREATE TABLE TEST6(
					ID		VARCHAR(10),
					PW		VARCHAR(30),
					NAME	VARCHAR(30) DEFAULT 'Anonymous',
					MDate	DATE,
					AGE		INT
				);
	 */
	
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn  = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB ���� ����!");
			stmt = conn.createStatement();
//			�Է�
//			String sql = insert();
//			int result = stmt.executeUpdate(sql);
//			String msg = result > -1 ? "����" : "����";
//			System.out.println(msg);
//			���
			String sql = select();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i <= cols; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			/*��� ���
			 * 	TEST4
			 * 1	������1	2021-09-08
			 * 2	������2	2021-09-08
			 * 	TEST5
			 * 1	1
			 * 2	2
			 */
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
	/**
	 * DATA INSERT
	 * @return sql
	 */
	public static String insert() {
		String sql = "INSERT INTO TEST6(ID, PW, MDATE, AGE)VALUES('ABC', '123', '2021-09-08', 100)";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select() {
//		����1)
		String sql = "SELECT * FROM TEST6";
		return sql;
//		����2)
//		String sql = "SELECT * FROM TEST5";
//		return sql;
	}
	/**
	 * DATA UPDATA
	 * @return SQL Query
	 */
	public static String update() {
		String sql = "UPDATE TEST4 SET CODE=7 WHERE CODE=2";
		return sql;
	}
}
