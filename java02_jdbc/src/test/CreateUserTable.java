package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class CreateUserTable {

	public static void main(String[] args) {
		String sql = " CREATE TABLE USER( ID VARCHAR2(20) PRIMARY KEY, " 
				+ "PASSWORD VARCHAR2(20)," 
				+ "NAME VARCHAR2(20))";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			row = ps.executeUpdate(); // insert, delete, update
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}
