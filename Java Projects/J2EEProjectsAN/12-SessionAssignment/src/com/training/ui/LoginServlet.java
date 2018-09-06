package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.User;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		PrintWriter out=response.getWriter();
		
		String userName;
		String password;
		
		userName=request.getParameter("txt_username");
		
		
		password=request.getParameter("txt_password");
		
		User user=new User(userName,password);
		
		
		 HttpSession session=request.getSession(true);
			
			session.setAttribute("user", user);
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Demo</title>");
			out.println("</head>");
			out.println("<body>");
			out.print("<form Action='Display.jsp'>");
			out.print("Welcome "+userName);out.println("<br>");
			out.println("<input type='submit' value='go'>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
			
			
	
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
