package db;

public class DBEx1_driver {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
//		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
		}

	}

}
