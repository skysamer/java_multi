package service;

import java.util.List;

import vo.UserVO;

public interface UserService {
	public int insertUser(String id, String pw, String name);
	public int insertUser(UserVO vo);
	public void updateUser(UserVO vo);
	public void deleteUser(String id);
	public UserVO getUser(String id);
	public List<UserVO> getUserAll();
	

}
