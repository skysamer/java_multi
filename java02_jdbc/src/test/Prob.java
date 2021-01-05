package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Prob {

	public static void main(String[] args) {
		show(10);
		System.out.println("============================");
		show(20);

	}
	
	 private static void show(int DEPARTMENT_ID) {
			

			String sql = "select round(avg(sal),2) \"평균 급여\" from emp where deptno ="+DEPARTMENT_ID;
			
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
					System.out.print(rs.getString("평균 급여")+"\n");
				}


			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
	              //7. 자원정리(connection, statement, resultset)
				JDBCUtil.close(con, st, rs);
			}
	   		
	}

}
