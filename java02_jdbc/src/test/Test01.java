package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test01 {

	public static void main(String[] args) {

		// oracle
		

		String sql = "select * from emp";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			//3. 생성된Connection으로부터 Statement생성
			st = con.createStatement();
			//4. 생성된 Statement를 이용해서 sql수행 (execute, executeUpdate, executeQuery)
			rs = st.executeQuery(sql);
			//5. 결과 처리(ResultSet, int)
			while(rs.next()) {
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getString("JOB")+"\t");
				System.out.print(rs.getDate("HIREDATE")+"\t");
				System.out.print(rs.getInt("SAL")+"\t");
				System.out.print(rs.getString("DEPTNO")+"\n");
			}


		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
              //7. 자원정리(connection, statement, resultset)
				JDBCUtil.close(con, st, rs);
		}

		
		System.out.println(" JDBC App  END ...");
	}

}

/*
 * jdbc 프로그래밍 순서
 * 
 * 0. 연결할 driver클래스를 classpath아래==>maven 설정으로 대체
 * 
 * 1. Driver클래스를 로딩
 * 
 * 2. 로딩된 Driver클래스를 이용해서 Connection요청(url, user, pwd)
 * 
 * 3. 생성된Connection으로부터 Statement생성
 * 
 * 4. 생성된 Statement를 이용해서 sql수행 (execute, executeUpdate, executeQuery)
 * 
 * 5. 결과 처리(ResultSet, int)
 * 
 * 6. SQLException 처리(try, catch, finally)
 * 
 * 7. 자원정리(connection, statement, resultset)
 * 
 */