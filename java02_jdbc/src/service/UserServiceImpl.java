package service;

import java.util.List;

import dao.UserDAO;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	
	private UserDAO dao;
	
	

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
	public int insertUser(String id, String pw, String name) {
		return dao.insertUser(id, pw, name);
		
	}

	@Override
	public int insertUser(UserVO vo) {
		return dao.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		dao.updateUser(vo);
	}

	@Override
	public void deleteUser(String id) {
		dao.deleteUser(id);
	}

	@Override
	public UserVO getUser(String id) {
		return dao.getUser(id);
	}

	@Override
	public List<UserVO> getUserAll() {
		return dao.getUserAll();
	}
	

}
