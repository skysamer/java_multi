package service;

import java.util.List;

import vo.UserVO;

public interface UserService {
	
	// idcheck
	boolean idCheck(String id);
	
	// 회원가입
	void addUser(UserVO vo);
	
	// 로그인
	boolean login(String id, String pw);
	
	

}
