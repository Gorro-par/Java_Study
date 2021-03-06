package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx19 {

	/*
	 	- LIKE 검색 : 문자열부분일치 검색(LIKE)
	 		Equal 연산자 (=) 의 경우 비교대상값과 정확히 일치하는 값을 대상으로 검색합니다.
	 		반면에, 문자값이 부분적으로만 일치해도 데이터 검색을 하고자 하는 경우에 LIKE 명령어를 사용합니다.
	 		문자열컬럼 내에 검색 문자값이 부분이라도 일치하는 데이터르르 조회대상으로 잡을 떄 사용합니다.
	 		부분 일치 검색을 위해서 특정 문자값 이회의 위치에는 **('_', '%')**를 사용합니다.
	 	- 와일드 카드 종류('_', '%')
	 	의미)
	 		1. % : 0개 이상의 자리값을 갖는 문자열
	 		2. _ : 1자리수 문자.
	 	[형식]				[설명]
	 	컬럼명 LIKE '%CD%'	컬럼값 중 CD가 포함된 문자열이 모두 대상
	 	컬럼명 LIKE 'CD%'		컬럼값 중 CD로 시작하는 문자열이 대상
	 	컬럼명 LIKE 'C%D'		컬럼값 중 C로 시작하고 중간 값들은 무엇이든 상관없이
	 						(자리수도 상관없이) 끝자리값이 D인 문자열이 대상
	 	
	 	컬럼명 LIKE '_CD_'	컬럼값 자리수가 4자리이고 1, 4번째 자리값은 무엇이든 
	 						상관없고 2~3번째에 CD가 들어간 문자열
	 	컬럼명 LIKE 'CD_'		컬럼값이 3자리고 CD로 사작하고 3번째 값은
	 						무엇이든지 상관없는 문자열이 대상
	 		
	 	컬럼명 LIKE 'C_D'		컬럼값이 3자리이고 1번쨰 값이 C, 3번쨰 값이 D이고
	 						중간값 1자리는 무엇이든 상관없는 문자열이 대상
	 	
		[실습테이블 만들기] : LSTEST
		CREATE TABLE LSTEST(
			PHONE VARCHAR(15),
			NAME VARCHAR(10));
		[레코드 추가]
		INSERT INTO LSTEST VALUES('010-1234-5678', '홍길동');
		INSERT INTO LSTEST VALUES('030-1234-5678', '이순신');
		INSERT INTO LSTEST VALUES('050-1234-5678', '만득이');
		INSERT INTO LSTEST VALUES('014-1234-5678', '개똥이');
		INSERT INTO LSTEST VALUES('020-1234-5678', '칠득이');
		INSERT INTO LSTEST VALUES('012-1234-5678', '갑돌이');
		INSERT INTO LSTEST VALUES('070-1234-5678', '갑순이');
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
//			ex1)
//			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '%011'"; 
//			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '011%'"; 
//			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE PHONE LIKE '%070%'"; 
//			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '_순_'"; 
//			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '칠__'"; 
//			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '__이'"; 
			String sql = "SELECT PHONE, NAME FROM LSTEST WHERE NAME LIKE '갑_이'"; 
		return sql;
		
		/*
		 실습문제)
		 CREATE TABLE ZIPCODE (7),
		 SIDO VARCHAR(4),
		 GUGUN VARCHAR(17),
		 DONG VARCHAR(26),
		 RI VARCHAR(15),
		 BLDG VARCHAR(42),
		 BUNJI VARCHAR(17),
		 SEQ VARCHAR(5),
		 PRIMARY KEY (SEQ)
		 )
		 */
	}
}
