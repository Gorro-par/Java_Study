package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;



public class DBEx11 {
	/*
	-FOREIGN KEY : �ܷ� Ű
		FOREIGN KEY ���� ������ ������ �ʵ�� �ܷ� Ű��� �θ���,
		�� ���̺��� �ٸ� ���̺�� �������ִ� ��Ȱ�� �մϴ�.
		�ܷ� Ű�� ������ ���̺� ���ڵ带 �Է��ϸ�, ������ �Ǵ� ���̺��� ������
		�����Ͽ� ���ڵ尡 �Էµ˴ϴ�.
		��, FOREIGN KEY ���� ������ �ϳ��� ���̺��� �ٸ� ���̺� �����ϰ� ����ϴ�.
		FOREIGN KEY ���� ������ ������ �� �����Ǵ� ���̺��� �ʵ�� �ݵ��
		UNIQUE�� PRIMARY KEY ���� ������ �����Ǿ� �־�� �մϴ�.
	 -> [���̺� ����]
 		CREATE TABLE TEST4(		-- parent
 						CODE		INT PRIMARY KEY,
 						ITMT		VARCHAR(30),
 						RDate		DATE
	 				);
	 	CREATE TABLE TEST5(		-- child
 						NUM		INT PRIMARY KEY auto_increment, ++
 						CODE		INT,
 						FOREIGN KEY	(CODE)
 						REFERENCES	TEST4(CODE)	ON UPDATE CASCADE
	 					ON DELETE CASCADE
	 				);
	 				���̺� ����
	 				DROP TABLE TEST5;
	 				DROP TABLE TEST4;
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
//		����1)
//		String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(1, '������1', '2021-09-08')";
//		����2)
		String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(2, '������2', '2021-09-08')";
//		����3)
//		String sql = "INSERT INTO TEST5(CODE) VALUES(1)";
//		����4)
//		String sql = "INSERT INTO TEST5(CODE) VALUES(2)";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select() {
//		����1)
		String sql = "SELECT * FROM TEST4";
		return sql;
//		����2)
//		String sql = "SELECT * FROM TEST5";
//		return sql;
	}
}
