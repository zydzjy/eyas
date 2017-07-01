package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import eyas.base.bean.UserBean;
import eyas.base.bean.UserExtBean;
import eyas.base.service.ServiceException;
import eyas.base.service.UserService;

public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		this.doService(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		this.doService(req, resp);
	} 
	
	protected void doService(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		WebApplicationContext wac =   
	            WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		UserService userServiceImpl = (UserService) wac.getBean("userServiceImpl");
		//UserExtService userExtServiceImpl = (UserExtService) wac.getBean("userExtServiceImpl");
		UserBean user = new UserBean();
		user.setUserLoginName(userName);
		user.setUserPwd(password);
		UserExtBean userExt = new UserExtBean();
		userExt.setUserId(user.getUserId());
		userExt.setUserEmail("xxaaaddbb");
		try {
			userServiceImpl.addUser(user,userExt);
		} catch (ServiceException e) {
			throw new ServletException(e);
		}
		System.out.println("xxxx");
	} 
}
