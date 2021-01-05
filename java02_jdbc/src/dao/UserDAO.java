package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.UserVO;

public class UserDAO {
	
	public int insertUser(String id, String pw, String name) {

		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="CREATE TABLE user(\r\n" + 
				"   id  VARCHAR2(30) ,\r\n" + 
				"   pw  VARCHAR2(30) ,\r\n" + 
				"   name  VARCHAR2(30)";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			// ? 세팅작업
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			row=ps.executeUpdate();  // insert, delete, update
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return row;
	}
	
	public int insertUser(UserVO vo) {
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="INSERT INTO user(id, pw, name) VALUES (?, ?, ?)";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			// ? 세팅작업
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			row=ps.executeUpdate();  // insert, delete, update
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return row;
	}
	
	public void deleteUser(String id) {
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="delete from dept where deptno=?";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			
			row=ps.executeUpdate();  // insert, delete, update
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
	
	public UserVO getUser(String id) {
		Connection con=null;
	 	PreparedStatement ps=null;
		
	 	ResultSet rs=null;
	 	int row=0;
		
	 	String sql="select *from dept where deptno=?";
	 	UserVO vo=null;
		
	 	try {
	 		con=JDBCUtil.getConnection();
	 		ps=con.prepareStatement(sql);
	 		ps.setString(1, id);	
	 		rs=ps.executeQuery();    // select
	 		while(rs.next()) {
	 			vo=new UserVO();
	 			vo.setId(rs.getString("DEPTNO"));
	 			vo.setPw(rs.getString("DNAME"));
	 			vo.setName(rs.getString("LOC"));
	 		}
			
			
			}catch(Exception e){
					e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}
	 	return vo;
	}
	
	public List<UserVO> getUserAll(){
		Connection con=null;
	 	PreparedStatement ps=null;
		
	 	ResultSet rs=null;
	 	int row=0;
		
	 	String sql="select *from dept order by deptno";
	 	List<UserVO> list=new ArrayList<UserVO>();
		
	 	try {
	 		con=JDBCUtil.getConnection();
	 		ps=con.prepareStatement(sql);
	 		rs=ps.executeQuery();    // select
	 		while(rs.next()) {
	 			UserVO vo=new UserVO();
	 			vo.setId(rs.getString("id"));
	 			vo.setPw(rs.getString("pw"));
	 			vo.setName(rs.getString("name"));
	 			list.add(vo);
	 		}
			
			
			}catch(Exception e){
					e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}
	 	return list;
		
	}
	
	public void updateUser(UserVO vo) {
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="update user set dname=?, loc=? where deptno=?";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			
			row=ps.executeUpdate();  // insert, delete, update
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}
