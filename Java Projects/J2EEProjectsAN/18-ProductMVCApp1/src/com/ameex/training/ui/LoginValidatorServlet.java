package com.ameex.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ameex.training.business.User;
import com.ameex.training.db.MySQLUserDAOImpl;
import com.ameex.training.db.UserDAO;


public class LoginValidatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String userName=request.getParameter("txt_username");
		String passWord=request.getParameter("txt_password");

		User user=new User();
		if(userName!=null && userName.trim().length()>0){
			user.setUserName(userName);
			
		}
		else{
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/LoginPage.jsp");
			request.setAttribute("message", "Invalid Login Details");
			dispatcher.forward(request, response);
		}
		if(passWord!=null && passWord.trim().length()>0){
			user.setPassword(passWord);
		}
		else{
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/LoginPage.jsp");
			request.setAttribute("message", "Invalid Login Details");
			dispatcher.forward(request, response);
			
		}
		UserDAO dao=new MySQLUserDAOImpl();
		User dbUser=dao.FindUser(userName);
		if(user.equals(dbUser)){
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/MenuPage.jsp");
			HttpSession session=request.getSession(true);
			session.setAttribute("user",user);
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/LoginPage.jsp");
			request.setAttribute("message", "Invalid Login Details");
			dispatcher.forward(request, response);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
