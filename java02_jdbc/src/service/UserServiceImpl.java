package service;

import java.util.List;

import dao.UserDAO;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	
	UserDAO dao;
	
	

	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}
	
	

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean idCheck(String id) {
		// TODO Auto-generated method stub
		return dao.idCheck(id);
	}

	@Override
	public void addUser(UserVO vo) {
		dao.addUser(vo);
		
	}

	@Override
	public boolean login(String id, String pw) {
		return dao.login(id, pw);
	}
	
	

}
