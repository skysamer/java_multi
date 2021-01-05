package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	public static Connection getConnection()
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pw = "TIGER";
		
		Connection con = null;
		
		
		try 
		{
			// 1. Driver클래스를 로딩
			Class.forName(driver);
			// 2. 로딩된 Driver클래스를 이용해서 Connection요청(url, user, pwd)
			con =  DriverManager.getConnection(url,user,pw);
			
		}	
		catch (ClassNotFoundException e) 
		{
			System.out.println("jdbc driver 확인");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e);
		}
			
			return con;
	}
	
	public static void close(Connection con, Statement st, ResultSet rs)
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
