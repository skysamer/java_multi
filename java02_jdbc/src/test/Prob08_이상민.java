package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Prob08_이상민 {

	private static void show(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pw = "TIGER";

		String sql = "select * from emp join dept on emp.deptno=dept.deptno";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		
		try {
			Class.forName(driver); // new 
			con =  DriverManager.getConnection(url,user,pw);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
				while(rs.next()) 
				{
					Map<String, String> map=new HashMap<String, String>();
					map.put(rs.getString("deptno"), rs.getString("sal"));
					System.out.println(map);
				}


			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			} finally 
			{
				try 
				{
					if(rs != null)	rs.close();
					if(st != null)	st.close();
					if(con != null)	con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
	}
	

	
	public static void main(String[] args) {
		
	}
	
}

	



