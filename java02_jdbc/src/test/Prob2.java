package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.DeptVO;

public class Prob2 {

	public static void main(String[] args) {
		Prob2 p=new Prob2();
		p.show(10);
		System.out.println("============================");
		p.show(20);
		System.out.println("============================");
		DeptVO vo_50=p.getDept(50);
		DeptVO vo_20=p.getDept(20);
		System.out.println(vo_50);
		System.out.println(vo_20);
		System.out.println("============모든 부서 정보 출력================");
		p.getDeptAll().forEach(i->System.out.println(i));


	}
	
	 public void show(int DEPARTMENT_ID) {
			
			String sql = "select round(avg(sal),2) \"평균 급여\" from emp where deptno = ?";
			
			Connection con = null;
			PreparedStatement ps=null;
			ResultSet rs = null;
			int result = 0;
			
			try {
				con=JDBCUtil.getConnection();
				//3. 생성된Connection으로부터 Statement생성
				ps = con.prepareStatement(sql);
				ps.setInt(1, DEPARTMENT_ID);
				//4. 생성된 Statement를 이용해서 sql수행 (execute, executeUpdate, executeQuery)
				rs = ps.executeQuery();
				//5. 결과값 핸들링
				while(rs.next()) {
					System.out.print(rs.getString("평균 급여")+"\n");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
	              //7. 자원정리(connection, statement, resultset)
				JDBCUtil.close(con, ps, rs);
			}
	   		
	}
	 
	 public DeptVO getDept(int DEPARTMENT_ID) {
		 
		 	Connection con=null;
		 	PreparedStatement ps=null;
			
		 	ResultSet rs=null;
		 	int row=0;
			
		 	String sql="select *from dept where deptno=?";
		 	DeptVO vo=null;
			
		 	try {
		 		con=JDBCUtil.getConnection();
		 		ps=con.prepareStatement(sql);
		 		// ? 세팅작업
		 		ps.setInt(1, DEPARTMENT_ID);	
		 		rs=ps.executeQuery();    // select
		 		while(rs.next()) {
		 			vo=new DeptVO();
		 			vo.setDeptno(rs.getInt("DEPTNO"));
		 			vo.setDname(rs.getString("DNAME"));
		 			vo.setLoc(rs.getString("LOC"));
		 		}
				
		 		// 결과값 핸들링
				
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
		 		// ? 세팅작업
		 		rs=ps.executeQuery();    // select
		 		while(rs.next()) {
		 			DeptVO vo=new DeptVO();
		 			vo.setDeptno(rs.getInt("DEPTNO"));
		 			vo.setDname(rs.getString("DNAME"));
		 			vo.setLoc(rs.getString("LOC"));
		 			list.add(vo);
		 		}
				
		 		// 결과값 핸들링
				
				}catch(Exception e){
						e.printStackTrace();
				}finally {
					JDBCUtil.close(con, ps, rs);
				}
		 	return list;
	 }


}
