package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;



public class DBEx10 {
	/*
	 - PRIMARY KEY
	 PRIMARY KEY 제약 조건을 설정하면, 해당 필드는 NOT NULL과 UNIQUE
	 제약 조건의 특징을 모두 가집니다.
	 따라서 이 제약 조건이 설정된 필드는 NULL 값을 가질 수 없으며,
	 또한 중복된 값ㅇ르 가져서도 안 됩니다.
	 이러한 PRIMARY KEY 제약 조건을 기본 키라고 합니다.
	 UNIQUE는 한 테이블의 여러 필드에 설정할 수 있지만, PRIMARY KEY는테이블당
	 오직 하나의 필드에만 설정할 수 있습니다.
	 이러한 PRIMARY KEY 제약 조건은 테이블의 데이터를 쉽고 빠르게 찾도록
	 도아주는 역활을 합니다.
	 -> [테이블 생성]
 		CREATE TABLE TEST2(
	 		ID		VARCHAR(10) PRIMARY KEY,
	 		PW		VARCHAR(30),
	 		NAME	VARCHAR(30),
	 		MDate 	DATE,
	 		AGE 	INT
	 		)
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
			System.out.println("DB 연결 성공!");
			stmt = conn.createStatement();
//			PRIMARY KEY
			String sql = insert();
//			String sql = select();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
//			rs = stmt.executeQuery(sql);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int cnt = rsmd.getColumnCount();
//			while(rs.next()) {
//				for(int i = 1; i <= cnt; i++) {
//					System.out.print(rs.getString(i) + "\t");
//				}
//				System.out.println();
//			}
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
		
		String sql = "INSERT INTO TEST3 VALUES('abc', '123', '홍길동','2021-09-08',10)";
//		String sql = "INSERT INTO TEST1(PW) VALU	ES('123')";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select() {
		String sql = "SELECT * FROM TEST3";
		return sql;
	}
}
