package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx18 {
	/*
	 - �׷�ȭ�Ͽ� ������ ��ȸ (GROUP BY)
	 	: ��ǥ���� �׷� �Լ� COUNT( ), AVG( ), MIN( ), MAX( ), SUM( ) �Լ� ���,
	 		HAVING ��(������)�� �����.
	 [���� ���̺� �����] : GBTEST
	 CREATE TABLE GBTEST(
	 		IDX  int,
	 		TYPE int,
	 		NAME VARCHAR(10));
	 [���ڵ� �߰�]
	 	INSERT INTO GBTEST VALUES(1, 1, 'ȫ�浿');
		INSERT INTO GBTEST VALUES(2, 2, '�̼���');
		INSERT INTO GBTEST VALUES(3, 2, '������');
		INSERT INTO GBTEST VALUES(4, 2, '������');
		INSERT INTO GBTEST VALUES(5, 3, 'ĥ����');
		INSERT INTO GBTEST VALUES(6, 3, '������');
		INSERT INTO GBTEST VALUES(7, 4', '������');
	 		
	 		����(type)���� ������ �������� ������, �ܼ���
	 		COUNT �Լ��� �����͸� ��ȸ�ϸ� ��ü ������ŭ �����ɴϴ�.
	 		ex1) �÷� �׷�ȭ : type �׷�ȭ�Ͽ� name ���� ��ȸ (�÷� �׷�ȭ)
	 		ex2) type 1 �ʰ���, type �׷�ȭ�Ͽ� name ���� ��ȸ(���� ó�� �� �÷� �׷�ȭ
	 */
	
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
	}	public static String select() {
//		String sql = "SELECT COUNT(TYPE) FROM GBTEST";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTESTGROUP BY TYPE";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE > 1 GROUP BY TYPE";
//		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST WHERE TYPE > 1 GROUP BY TYPE HAVING CNT >= 2";
		String sql = "SELECT TYPE, COUNT(NAME) AS CNT FROM GBTEST" +
					"WHERE TYPE > 1 GROUP BY HAVING CNT >= 2 ORDER BY TYPE DESC";
		return sql;
	}
}