package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx18 {
	/*
	 - 그룹화하여 데이터 조회 (GROUP BY)
	 	: 대표적인 그룹 함수 COUNT( ), AVG( ), MIN( ), MAX( ), SUM( ) 함수 등과,
	 		HAVING 절(조건절)을 사용함.
	 [연습 테이블 만들기] : GBTEST
	 CREATE TABLE GBTEST(
	 		IDX  int,
	 		TYPE int,
	 		NAME VARCHAR(10));
	 [레코드 추가]
	 	INSERT INTO GBTEST VALUES(1, 1, '홍길동');
		INSERT INTO GBTEST VALUES(2, 2, '이순신');
		INSERT INTO GBTEST VALUES(3, 2, '만득이');
		INSERT INTO GBTEST VALUES(4, 2, '개똥이');
		INSERT INTO GBTEST VALUES(5, 3, '칠득이');
		INSERT INTO GBTEST VALUES(6, 3, '갑돌이');
		INSERT INTO GBTEST VALUES(7, 4', '갑순이');
	 		
	 		유형(type)별로 갯수를 가져오고 싶은데, 단순히
	 		COUNT 함수로 데이터를 조회하면 전체 갯수만큼 가져옵니다.
	 		ex1) 컬럼 그룹화 : type 그룹화하여 name 갯수 조회 (컬럼 그룹화)
	 		ex2) type 1 초과인, type 그룹화하여 name 갯수 조회(조건 처리 후 컬럼 그룹화
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
