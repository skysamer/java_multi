package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Temp {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			// ? 세팅작업
			
			rs=ps.executeQuery();    // select
			row=ps.executeUpdate();  // insert, delete, update
			
			// 결과값 핸들링
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}
