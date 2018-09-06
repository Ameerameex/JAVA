package com.training.ui;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.training.business.Employee;
import com.training.db.EmployeeDAO;
import com.training.db.MySQLEmployeeDAOImpl1;


public class EmployeeListingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO dao=new MySQLEmployeeDAOImpl1();
		try {
			List<Employee> employees=dao.getAllEmployees();
			request.setAttribute("employeeList", employees);
			RequestDispatcher dispatcher=request.getRequestDispatcher("EmployeeListDisplayer.jsp");
			dispatcher.forward(request, response);
		} catch (Throwable e) {
			request.setAttribute("statusString", "There is Problem in retriving Employee List");
			RequestDispatcher dispatcher=request.getRequestDispatcher("StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
