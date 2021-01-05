package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.DeptVO;

// dept table CURD 작업을 하는 JDBC 코드
public class DeptDAO {
	
	public int insertDept(int deptno, String dname, String loc) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="INSERT INTO dept(deptno, dname, loc) VALUES (?, ?, ?)";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			// ? 세팅작업
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
			row=ps.executeUpdate();  // insert, delete, update
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return row;
	}
	
	public int insertDept(DeptVO vo) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="INSERT INTO dept(deptno, dname, loc) VALUES (?, ?, ?)";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			// ? 세팅작업
			ps.setInt(1, vo.getDeptno());
			ps.setString(2, vo.getDname());
			ps.setString(3, vo.getLoc());
			row=ps.executeUpdate();  // insert, delete, update
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return row;
	}
	
	public void updateDept(DeptVO vo) {
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="update dept set dname=?, loc=? where deptno=?";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getDname());
			ps.setString(2, vo.getLoc());
			ps.setInt(3, vo.getDeptno());
			
			row=ps.executeUpdate();  // insert, delete, update
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}

	}
	
	public void deleteDept(int deptno) {
		Connection con=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		int row=0;
		
		String sql="delete from dept where deptno=?";
		
		try {
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, deptno);
			
			row=ps.executeUpdate();  // insert, delete, update
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}

	}
	
	public DeptVO getDept(int deptno) {
		 
	 	Connection con=null;
	 	PreparedStatement ps=null;
		
	 	ResultSet rs=null;
	 	int row=0;
		
	 	String sql="select *from dept where deptno=?";
	 	DeptVO vo=null;
		
	 	try {
	 		con=JDBCUtil.getConnection();
	 		ps=con.prepareStatement(sql);
	 		ps.setInt(1, deptno);	
	 		rs=ps.executeQuery();    // select
	 		while(rs.next()) {
	 			vo=new DeptVO();
	 			vo.setDeptno(rs.getInt("DEPTNO"));
	 			vo.setDname(rs.getString("DNAME"));
	 			vo.setLoc(rs.getString("LOC"));
	 		}
			
			
			}catch(Exception e){
					e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}
	 	return vo;
 }
 
	public List<DeptVO> getDeptAll() {
	 
	 	Connection con=null;
	 	PreparedStatement ps=null;
		
	 	ResultSet rs=null;
	 	int row=0;
		
	 	String sql="select *from dept order by deptno";
	 	List<DeptVO> list=new ArrayList<DeptVO>();
		
	 	try {
	 		con=JDBCUtil.getConnection();
	 		ps=con.prepareStatement(sql);
	 		rs=ps.executeQuery();    // select
	 		while(rs.next()) {
	 			DeptVO vo=new DeptVO();
	 			vo.setDeptno(rs.getInt("DEPTNO"));
	 			vo.setDname(rs.getString("DNAME"));
	 			vo.setLoc(rs.getString("LOC"));
	 			list.add(vo);
	 		}
			
			
			}catch(Exception e){
					e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}
	 	return list;
 }

}
