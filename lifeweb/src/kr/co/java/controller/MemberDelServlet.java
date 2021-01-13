package kr.co.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.java.dao.MemberDAO;

/**
 * Servlet implementation class MemberDelServlet
 */
@WebServlet("/memberDel2")
public class MemberDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.요청객체에서 아이디 값을 얻어온다. 
		String id = request.getParameter("id");
		//2. id에 해당하는 member를 DB에서 삭제한다. 
		MemberDAO dao = new MemberDAO();
		int count = dao.deleteMember(id);
		//3. memberList를 리다이렉트한다. 
		response.sendRedirect("memberList");
	}

}
