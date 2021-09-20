package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx16 {
	
	/*
	 BETWEEN (����) : a AND b���� a�� b�� ������ (inclusive)
	 					�� ������ ��� ���� �ش��ϴ��� ���θ� �������� �Ѵ�.
	 [�ǚ����̺� �����] : BETWEST
	 CREATE TABLE BWTEST (
	 	IDX INT,
	 	BIRTH DATE,
	 	NAME VARCHAR(10));
	 */
	public static void main(String[] args) {
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql = insert();
//		String sql = select();
		try {
//			insert!
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "����" : "����";
			System.out.println(msg);
			
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
	public static String insert() {
//		String sql = "INSERT INTO BWTEST VALUES(1, '2021-01-01', 'ȫ�浿')";
//		String sql = "INSERT INTO BWTEST VALUES(2, '2021-02-02', '�̼���')";
//		String sql = "INSERT INTO BWTEST VALUES(3, '2021-03-03', '������')";
//		String sql = "INSERT INTO BWTEST VALUES(4, '2021-04-04', '������')";
//		String sql = "INSERT INTO BWTEST VALUES(5, '2021-05-05', 'ĥ����')";
//		String sql = "INSERT INTO BWTEST VALUES(6, '2021-06-06', '������')";
//		String sql = "INSERT INTO BWTEST VALUES(7, '2021-07-07', '������')";
		
//		String sql = "INSERT INTO GBTEST VALUES(1, 1, 'ȫ�浿')";
//		String sql = "INSERT INTO GBTEST VALUES(2, 2, '�̼���')";
//		String sql = "INSERT INTO GBTEST VALUES(3, 2, '������')";
//		String sql = "INSERT INTO GBTEST VALUES(4, 2, '������')";
//		String sql = "INSERT INTO GBTEST VALUES(5, 3, 'ĥ����')";
//		String sql = "INSERT INTO GBTEST VALUES(6, 3, '������')";
//		String sql = "INSERT INTO GBTEST VALUES(7, 4', '������')";
		
//		String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', 'ȫ�浿')";
//		String sql = "INSERT INTO LSTEST VALUES('030-1234-5678', '�̼���')";
//		String sql = "INSERT INTO LSTEST VALUES('050-1234-5678', '������')";
//		String sql = "INSERT INTO LSTEST VALUES('014-1234-5678', '������')";
//		String sql = "INSERT INTO LSTEST VALUES('020-1234-5678', 'ĥ����')";
		String sql = "INSERT INTO LSTEST VALUES('012-1234-5678', '������')";
		
		return sql;
//		��������) 2021-01-02 ~ 2021-01-08 ������ ���ڵ带 �����ϼ���
	}
	public static String select() {
//		String sql = "SELECT * FROM BWTEST WHERE IDX BETWEEN 2 AND 5";
//		String sql = "SELECT * FROM BWTEST WHERE IDX  >= 2 AND IDX <= 5";
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2021-01-02' AND '2021-01-08'";
//		Limit : ���� ����
//		ex1) 1 ~ n;
//		String sql  ="SELECT * FROM BWTEST LIMIT 2";
//		ex2) ������ �Խù� n�� ~ n ���� ����.
//		String sql = "SELECT * FROM BWTEST LIMIT 2 OFFSET 5";
//		ex3) �Խù� n ���� ���� ~ ������ �Խù� n��;
		String sql = "SELCECT * FROM BWTEST ORDER BY IDX DESC LIMIT 5, 2";
		return sql; 
	}
}