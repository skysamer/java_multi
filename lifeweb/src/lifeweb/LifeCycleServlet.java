package lifeweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String name="kang";
		System.out.println("service call");
		System.out.println(name);
	}

	@Override
	public void destroy() {
		System.out.println("destory call!!!!!!!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init call");
	}
	

}
