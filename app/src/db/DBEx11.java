package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;



public class DBEx11 {
	/*
	-FOREIGN KEY : 외래 키
		FOREIGN KEY 제약 조건을 설정한 필드는 외래 키라고 부르며,
		한 테이블을 다른 테이블과 연결해주는 역활을 합니다.
		외래 키가 설정된 테이블에 레코드를 입력하면, 기준이 되는 테이블의 내용을
		참조하여 레코드가 입력됩니다.
		즉, FOREIGN KEY 제약 조건은 하나의 테이블을 다른 테이블에 의존하게 만듭니다.
		FOREIGN KEY 제약 조건을 설정할 때 참조되는 테이블의 필드는 반드시
		UNIQUE나 PRIMARY KEY 제약 조건이 설정되어 있어야 합니다.
	 -> [테이블 생성]
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
	 				테이블 삭제
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
			System.out.println("DB 연결 성공!");
			stmt = conn.createStatement();
//			입력
//			String sql = insert();
//			int result = stmt.executeUpdate(sql);
//			String msg = result > -1 ? "성공" : "실패";
//			System.out.println(msg);
//			출력
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
			/*출력 결과
			 * 	TEST4
			 * 1	아이템1	2021-09-08
			 * 2	아이템2	2021-09-08
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
//		실행1)
//		String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(1, '아이템1', '2021-09-08')";
//		실행2)
		String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(2, '아이템2', '2021-09-08')";
//		실행3)
//		String sql = "INSERT INTO TEST5(CODE) VALUES(1)";
//		실행4)
//		String sql = "INSERT INTO TEST5(CODE) VALUES(2)";
		return sql;
	}
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select() {
//		실행1)
		String sql = "SELECT * FROM TEST4";
		return sql;
//		실행2)
//		String sql = "SELECT * FROM TEST5";
//		return sql;
	}
}
