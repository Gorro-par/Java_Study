package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx16 {
	
	/*
	 BETWEEN (범위) : a AND b에서 a와 b를 포함한 (inclusive)
	 					그 사이의 모든 값에 해당하는지 여부를 조건으로 한다.
	 [실슽테이블 만들기] : BETWEST
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
			String msg = result > -1 ? "성공" : "실패";
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
//		String sql = "INSERT INTO BWTEST VALUES(1, '2021-01-01', '홍길동')";
//		String sql = "INSERT INTO BWTEST VALUES(2, '2021-02-02', '이순신')";
//		String sql = "INSERT INTO BWTEST VALUES(3, '2021-03-03', '만득이')";
//		String sql = "INSERT INTO BWTEST VALUES(4, '2021-04-04', '개똥이')";
//		String sql = "INSERT INTO BWTEST VALUES(5, '2021-05-05', '칠득이')";
//		String sql = "INSERT INTO BWTEST VALUES(6, '2021-06-06', '갑돌이')";
//		String sql = "INSERT INTO BWTEST VALUES(7, '2021-07-07', '갑순이')";
		
//		String sql = "INSERT INTO GBTEST VALUES(1, 1, '홍길동')";
//		String sql = "INSERT INTO GBTEST VALUES(2, 2, '이순신')";
//		String sql = "INSERT INTO GBTEST VALUES(3, 2, '만득이')";
//		String sql = "INSERT INTO GBTEST VALUES(4, 2, '개똥이')";
//		String sql = "INSERT INTO GBTEST VALUES(5, 3, '칠득이')";
//		String sql = "INSERT INTO GBTEST VALUES(6, 3, '갑돌이')";
//		String sql = "INSERT INTO GBTEST VALUES(7, 4', '갑순이')";
		
//		String sql = "INSERT INTO LSTEST VALUES('010-1234-5678', '홍길동')";
//		String sql = "INSERT INTO LSTEST VALUES('030-1234-5678', '이순신')";
//		String sql = "INSERT INTO LSTEST VALUES('050-1234-5678', '만득이')";
//		String sql = "INSERT INTO LSTEST VALUES('014-1234-5678', '개똥이')";
//		String sql = "INSERT INTO LSTEST VALUES('020-1234-5678', '칠득이')";
		String sql = "INSERT INTO LSTEST VALUES('012-1234-5678', '갑돌이')";
		
		return sql;
//		연습문제) 2021-01-02 ~ 2021-01-08 범위의 레코드를 추출하세요
	}
	public static String select() {
//		String sql = "SELECT * FROM BWTEST WHERE IDX BETWEEN 2 AND 5";
//		String sql = "SELECT * FROM BWTEST WHERE IDX  >= 2 AND IDX <= 5";
//		String sql = "SELECT * FROM BWTEST WHERE BIRTH BETWEEN '2021-01-02' AND '2021-01-08'";
//		Limit : 범위 추출
//		ex1) 1 ~ n;
//		String sql  ="SELECT * FROM BWTEST LIMIT 2";
//		ex2) 가져올 게시물 n개 ~ n 이후 부터.
//		String sql = "SELECT * FROM BWTEST LIMIT 2 OFFSET 5";
//		ex3) 게시물 n 이후 부터 ~ 가져올 게시물 n개;
		String sql = "SELCECT * FROM BWTEST ORDER BY IDX DESC LIMIT 5, 2";
		return sql; 
	}
}
