//package db;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//
//public class ZipcodeEx {
//
//	public Map<Integer, String> zicode() {
//		System.out.println("우편검색을 시작합니다.");
//		System.out.print("원하는 동을 입력해 주세요");
//		HashMap<Integer, String> code = new HashMap<>();
//		Connection conn = DBAction.getInstance().getConnection();
//		Statement stmt = null;
//		ResultSet rs = null;
//		int rows = 0;
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery("SELECT ZIPCODE FROM ZIPCODE where DONG like '%" + scanner.next() + "%' order by SEQ");
//			ResultSetMetaData rsmd= rs.getMetaData();
//			int columnCnt = rsmd.getColumnCount();
//			System.out.println("검색결과 우편번호\n-------------------------------------------------------");
//			while (rs.next()) {
//					code.put(++rows, rs.getString(1));
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if (rs != null)rs.close();
//				if (stmt != null)stmt.close();
//				if (conn != null)conn.close();
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}	
//
//}