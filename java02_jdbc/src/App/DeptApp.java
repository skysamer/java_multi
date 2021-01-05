package App;

import dao.DeptDAO;
import service.DeptService;
import service.DeptServiceImpl;
import vo.DeptVO;

public class DeptApp {

	public static void main(String[] args) {
		
		DeptDAO dao=new DeptDAO();
		DeptService service=new DeptServiceImpl(dao);
		
		//DeptService service<- Spring
		
		// 등록
		DeptVO vo=new DeptVO();
		vo.setDeptno(99);
		vo.setDname("영업부");
		vo.setLoc("제주도");
		service.insertDept(vo);
		
		
		//수정
		vo.setDname("영업팀");
		service.updateDept(vo);
		
		//list
		service.getDeptAll().forEach(i->System.out.println(i));
		
		//삭제
		service.deleteDept(99);
	}

}
