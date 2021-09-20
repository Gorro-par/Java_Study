package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBEx4_insert {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn  = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("�����ͺ��̽� ���� ����!");
			stmt = conn.createStatement();
			String sql = insert();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "����" : "����";
			System.out.println(msg);
		}catch(Exception e) {	
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			}catch(SQLException e) {}
		}
	}
	/**
	 *  DaTA INSERT
	 *  @return sql
	 */
	public static String insert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("DBTEST ���̺� �� �Է��ϱ�");
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		System.out.print("AGE : ");
		int age = scan.nextInt();
//		String sql = "insert into DBTEST values('" + id + "')";
//		String sql = "insert into DBTEST2 values('" + id + "', '" + pw + "' )";
		String sql = "insert into DBTEST3 values('" + id + "', '" + pw + "', " + age + " , NOW())";
		return sql;
	}
	// �������� DBTEST2 TABLE ����� ID, PW �÷����� �����͸� �����Ͻÿ�. ID, PW, AGE, DATE
// ����)
//	String sql = "CREATE TABLE DATEST2(ID VARCHAR(10), PW VARCHAR(10), AGE, CRE_DATE DATETIME)";
// �� ����)
//	String sql = "INSERT INTO DBTEST2 VALUES('ABC', '123', 10, NEW())";
	
//	oracle [����]
}
