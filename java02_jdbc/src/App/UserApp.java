package App;

import dao.UserDAO;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;

public class UserApp {

	public static void main(String[] args) {
		UserDAO dao=new UserDAO();
		UserService service=new UserServiceImpl(dao);
		
		UserVO vo=new UserVO();
		
		vo.setId("ID");
		vo.setPw("PW");
		vo.setName("NAME");
		service.insertDept(vo);

	}

}
