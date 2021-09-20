package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx20 {

	/* JOIN
	 JOIN �� �����ͺ��̽� ���� ���� ���̺��� ������ ���ڵ带 �����Ͽ�
	 �ϳ��� ���̺��̳� ��� �������� ǥ���� �ݴϴ�.
	 �̷��� JOIN�� ���� SELECT ���� �Բ� ���� ���˴ϴ�.
	 ǥ�� SQL������ ���ڵ帣�� �����ϴ� ��Ŀ� ���� JOIN�� ������ ���� �����մϴ�.
	 1. CROSS JOIN
	 2. EQUI JOIN
	 3. LEFT JOIN
	 4. RIGHT JOIN
	 
	 1. CROSS JOIN Cartesian Product(ī��� ��)�̶�� �ϸ� ���εǴ� �� ���̺���
	 �������� ��ȯ�Ѵ�.
	 ũ�ν� ������ ���� �����ϰ� ������ �⺻
	 ��� ���� �� �������� ������ ����ȭ�� �����ͺ��̽����� ������ �ʴ´�.
	 ù ��° ���̺��� ����� �� ��° ���̺��� ����� ���� �� ��ŭ�� ���� ��ȯ
	 (����� ǥ��, �Ͻ��� ǥ��)
	 	
	 2.EQUI JOIN(INSERT EQUI JOIN)
	 WHERE ���� ���ǿ�����"=" �� ����Ͽ� �ߺ���(������) ���� ����� ������.
	 (����� ǥ��, �Ͻ��� ǥ��)
	 
	 3.LEFT OUTER JOIN(LEFT JOIN)
	 left��� ���� FROM ������ ������ ���� �Ǵ� ù ��° ���̺��� ����.
	 ���� ���̺��� �� + ���̺�� ���� ���̺��� �ߺ��� ���� �����ݴϴ�.
	 ���� ���̺��� �������� JOIN, ������� A���̺��� ��� �����Ϳ�
	 A���̺�� B���̺��� �ߺ��Ǵ� ���� �˻�.
	 
	 4.RIGHT OUTER JOIN(RIGHT JOIN)
	 right ��� ���� FROM ������ ������ ������ �Ǵ� 2���� ���̺��� �����Ѵٴ°�
	 LEFT OUTER JOIN�� �ݴ��Դϴ�.
	 ������ ���̺��� �������� JOIN, ������� B���̺��� ��� �����Ϳ�
	 A���̺�� B���̺��� �ߺ��Ǵ��� ���� �˻�.
	 
	 
	 
	 [�ǽ� ���̺� �����] : JITEST1
	 CREATE TABLE JNTEST1(
	 	ID INT PRIMARY KEY auto_increment,
	 	PHONE VARCHAR(15),
	 	NAME VARChAR(10)
	 	);

	 
	 [���ڵ� �߰�]
	 	INSERT INTO JNTEST1(PHONE,NAME) VALUES('011-1234-5678', 'ȫ�浿');
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('011-1234-5678', '�̼���'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '������'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '������'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', 'ĥ����'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('070-1234-5678', '������');
		
	 [�ǽ� ���̺� �����] : JITEST2
	 CREATE TABLE JNTEST2(
	 	ID INT,
	 	NAME DATE,
	 	NAME VARChAR(10)
	 	);
	 [���ڵ� �߰�]
	 	String sql = "INSERT INTO JNTEST2 VALUES(1,'2001-01-01', '�౸����')";
		String sql = "INSERT INTO JNTEST2 VALUES(2,'2001-01-02', '�󱸼���')";
		String sql = "INSERT INTO JNTEST2 VALUES(3,'2001-01-03', '�豸����')";
		String sql = "INSERT INTO JNTEST2 VALUES(7,'2001-01-05', '�豸����2')";
	 */

	public static void main(String[] args) {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql = select();
		try {
//		select
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
//		ex1)
//		String sql = "SELECT * FROM JNTEST1 CROSS JOIN JNTEST2";
//		String sql = "SELECT * FROM JNTEST1, JNTEST2";
//		ex2)
//		String sql = "SELECT * FROM JNTEST1 T1, INNER JOIN JNTEST2 T2 ON T1.ID = T2.ID";
//		String sql = "SELECT * FROM JNTEST1 T1, JNTEST2 T2 WHERE T1.ID = T2.ID";
//		ex3)
//		String sql = "SELECT * FROM JNTEST1 T1 LEFT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID";
//		ex4)
		String sql = "SELECT * FROM JNTEST1 T1 LEFT OUTER JOIN JNTEST2 T2 ON T1.ID = T2.ID IS NULL";
		return sql;
			
	}
}