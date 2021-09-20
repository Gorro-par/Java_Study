package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBEx13 {
	public DBEx13() {
		DBAction db = DBAction.getInstance();
		Connection conn = db.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String sql = "SELECT * FROM TEST3";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i = 1; i<= cols; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
// 	��������) TEST6 ��
}
