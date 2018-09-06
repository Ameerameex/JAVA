package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.business.Employee;

public class EmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context=getServletContext();
		WebApplicationContext applicationContext=WebApplicationContextUtils.getWebApplicationContext(context);
		
		Employee employee=(Employee) applicationContext.getBean("employeeBean");
		RequestDispatcher dispatcher=request.getRequestDispatcher("employeeDisplayer.jsp");
		request.setAttribute("emp",employee);
		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
