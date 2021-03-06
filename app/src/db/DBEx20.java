package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx20 {

	/* JOIN
	 JOIN 은 데이터베이스 내의 여러 테이블에서 가져온 레코드를 조합하여
	 하나의 테이블이나 결과 집합으로 표현해 줍니다.
	 이러한 JOIN은 보통 SELECT 문과 함께 자주 사용됩니다.
	 표준 SQL에서는 레코드르르 조합하는 방식에 따라 JOIN을 다음과 같이 구분합니다.
	 1. CROSS JOIN
	 2. EQUI JOIN
	 3. LEFT JOIN
	 4. RIGHT JOIN
	 
	 1. CROSS JOIN Cartesian Product(카디션 곱)이라고도 하며 조인되는 두 테이블에서
	 곱집합을 반환한다.
	 크로스 조인은 가장 간단하고 조인의 기본
	 모든 행을 다 가져오기 떄문에 정규화된 데이터베이스에는 사용되지 않는다.
	 첫 번째 테이블의 행수를 두 번째 테이블의 행수로 곱한 것 만큼의 행을 반환
	 (명시적 표현, 암시적 표현)
	 	
	 2.EQUI JOIN(INSERT EQUI JOIN)
	 WHERE 절에 조건연산자"=" 를 사용하여 중복된(교집합) 값을 결과로 추출함.
	 (명시적 표현, 암시적 표현)
	 
	 3.LEFT OUTER JOIN(LEFT JOIN)
	 left라는 것을 FROM 절에서 지정된 왼쪽 또는 첫 번째 테이블을 참조.
	 기준 테이블의 값 + 테이블과 기준 테이블의 중복된 값을 보여줍니다.
	 왼쪽 테이블을 기준으로 JOIN, 결과값은 A테이블의 모든 데이터와
	 A테이블과 B테이블의 중복되는 값이 검색.
	 
	 4.RIGHT OUTER JOIN(RIGHT JOIN)
	 right 라는 것을 FROM 절에서 지정된 오른쪽 또는 2번쨰 테이블을 참조한다는것
	 LEFT OUTER JOIN의 반대입니다.
	 오른쪽 테이블을 기준으로 JOIN, 결과값은 B테이블의 모든 데이터와
	 A테이블과 B테이블의 중복되느느 값이 검색.
	 
	 
	 
	 [실습 테이블 만들기] : JITEST1
	 CREATE TABLE JNTEST1(
	 	ID INT PRIMARY KEY auto_increment,
	 	PHONE VARCHAR(15),
	 	NAME VARChAR(10)
	 	);

	 
	 [레코드 추가]
	 	INSERT INTO JNTEST1(PHONE,NAME) VALUES('011-1234-5678', '홍길동');
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('011-1234-5678', '이순신'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '만득이'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '개똥이'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('010-1234-5678', '칠득이'); 
		INSERT INTO JNTEST1(PHONE,NAME) VALUES('070-1234-5678', '갑돌이');
		
	 [실습 테이블 만들기] : JITEST2
	 CREATE TABLE JNTEST2(
	 	ID INT,
	 	NAME DATE,
	 	NAME VARChAR(10)
	 	);
	 [레코드 추가]
	 	String sql = "INSERT INTO JNTEST2 VALUES(1,'2001-01-01', '축구선수')";
		String sql = "INSERT INTO JNTEST2 VALUES(2,'2001-01-02', '농구선수')";
		String sql = "INSERT INTO JNTEST2 VALUES(3,'2001-01-03', '배구선수')";
		String sql = "INSERT INTO JNTEST2 VALUES(7,'2001-01-05', '배구선수2')";
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