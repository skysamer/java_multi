package service;

import java.util.List;

import vo.DeptVO;

public interface DeptService {
	
	public int insertDept(int deptno, String dname, String loc);
	public int insertDept(DeptVO vo);
	public void updateDept(DeptVO vo);
	public void deleteDept(int deptno);
	public DeptVO getDept(int deptno);
	public List<DeptVO> getDeptAll();

}
