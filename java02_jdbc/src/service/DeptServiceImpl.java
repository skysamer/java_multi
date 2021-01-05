package service;

import java.util.List;

import dao.DeptDAO;
import vo.DeptVO;

public class DeptServiceImpl implements DeptService{
	
	private DeptDAO dao;
	
	

	public DeptServiceImpl() {
		super();
	}

	public DeptServiceImpl(DeptDAO dao) {
		super();
		this.dao = dao;
	}
	
	

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public int insertDept(int deptno, String dname, String loc) {
		return dao.insertDept(deptno, dname, loc);
	}

	@Override
	public int insertDept(DeptVO vo) {
		return dao.insertDept(vo);
	}

	@Override
	public void updateDept(DeptVO vo) {
		dao.updateDept(vo);
		
	}

	@Override
	public void deleteDept(int deptno) {
		dao.deleteDept(deptno);
		
	}

	@Override
	public DeptVO getDept(int deptno) {
		return dao.getDept(deptno);
	}

	@Override
	public List<DeptVO> getDeptAll() {
		return dao.getDeptAll();
	}

}
