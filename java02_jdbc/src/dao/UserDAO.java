package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.UserVO;

public class UserDAO {
	
		// idcheck
		public boolean idCheck(String id) {
			boolean falg=false;
			
			
			Connection con=null;
			PreparedStatement ps=null;
			
			ResultSet rs=null;
			int row=0;
			
			String sql="select * from users where id=";
			
			try {
				con=JDBCUtil.getConnection();
				ps=con.prepareStatement(sql);
				// ? 세팅작업
				ps.setString(1, id);
				
				rs=ps.executeQuery();    // select
				row=ps.executeUpdate();  // insert, delete, update
				
				// 결과값 핸들링
				falg=rs.next();
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}
			
			return falg;

			
		}
		
		// 회원가입
		public void addUser(UserVO vo) {
			Connection con=null;
			PreparedStatement ps=null;
			
			ResultSet rs=null;
			int row=0;
			
			String sql="insert into user (id,password,name) values ('?,'?,'?)" ;
					
			
			try {
				con=JDBCUtil.getConnection();
				ps=con.prepareStatement(sql);
				// ? 세팅작업
				ps.setString(1, vo.getId());
				ps.setString(2, vo.getPassword());
				ps.setString(3, vo.getName());
				
				rs=ps.executeQuery();    // select
				row=ps.executeUpdate();  // insert, delete, update
				
				// 결과값 핸들링
				
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}

			
		}
		
		// 로그인
		public boolean login(String id, String pw) {
			
			boolean falg=false;
			Connection con=null;
			PreparedStatement ps=null;
			
			ResultSet rs=null;
			int row=0;
			
			String sql="select * from users where id=? and password=?";
			
			try {
				con=JDBCUtil.getConnection();
				ps=con.prepareStatement(sql);
				// ? 세팅작업
				ps.setString(1, id);
				ps.setString(2, pw);
				
				rs=ps.executeQuery();    // select
				row=ps.executeUpdate();  // insert, delete, update
				
				// 결과값 핸들링
				falg=rs.next();
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}

			
			
			return falg;
			
		}
	


}
