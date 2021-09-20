package db;

public class DBEx1_driver {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
//		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
		}catch(Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}

	}

}
