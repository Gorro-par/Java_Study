package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class DBEx7_matadate {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
		String url ="jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn  = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB 연결 성공!");
			stmt = conn.createStatement();
			String sql = select();
			rs = stmt.executeQuery(sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int colums = rsmd.getColumnCount();
			
			UserData userdata;
			
			while(rs.next()) {
//				for(int i = 1; i <= colums; i++) {
//					System.out.println(rs.getString(i) + "\t");
//				}
				String id = rs.getString("ID");
				String pw = rs.getString("PW");
				int age = rs.getInt("age");
				String date = rs.getString("GRE_DATE");
				userdata = new UserData(id, pw, age, date);
				System.out.print("ID : " + userdata.getId()
									+ ", PW : " + userdata.getPw()
									+ ", AGE : " + userdata.getAge()
									+", GRE_DATE : " + userdata.getMdate());
				System.out.println();
				}
		}catch(Exception e) {	
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}
	/**
	 * SELECT
	 * @return SQL
	 */
	public static String select() {
		Scanner scan = new Scanner (System.in);
		System.out.print("ID : ");
		String id = scan.next();
		String sql = "select * from DBTEST3";
		return sql;
	}
}

class UserData{
	private String id;
	public UserData(String id, String pw, int age, String mdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.mdate = mdate;
	}
	private String pw;
	private int age;
	private String mdate;
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
