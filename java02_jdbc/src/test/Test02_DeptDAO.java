package test;

import dao.DeptDAO;
import vo.DeptVO;

public class Test02_DeptDAO {
	public static void main(String[] args) {
		DeptDAO dao=new DeptDAO();
		
		//int row=dao.insertDept(51, "교육부", "서울시");
		
		DeptVO vo=new DeptVO();
		vo.setDeptno(60);
		vo.setDname("영업부");
		vo.setLoc("제주도");
		int row=dao.insertDept(vo);
		
		DeptVO data=dao.getDept(50);
		if(data!=null) {
			data.setDname("~~~~~~");
			data.setLoc("SEOUL");
			dao.updateDept(data);
		}
		
//		dao.deleteDept(60);

	}
}
