package App;

import dao.UserDAO;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;

public class UserApp {

	public static void main(String[] args) {
		UserDAO dao=new UserDAO();
		
		UserService service=new UserServiceImpl(dao);
		
		UserVO vo=new UserVO();  //java01
		
		if(!service.idCheck("java02")) {
			vo.setPassword("1111");
			vo.setName("kim");
			dao.addUser(vo);
		}
		else {
			System.out.println("중복된 ID입니다.");
		}
		
		if(service.login("java02", "1234")) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

}




