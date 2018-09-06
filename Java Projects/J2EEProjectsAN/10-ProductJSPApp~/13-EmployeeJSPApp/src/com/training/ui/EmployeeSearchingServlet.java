package com.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.training.business.Employee;
import com.training.db.EmployeeDAO;
import com.training.db.MySQLEmployeeDAOImpl1;


public class EmployeeSearchingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s;
		int id=0;
		s=request.getParameter("txt_id");
		if(s!=null && s.trim().length()>0){
			
			id=Integer.parseInt(s);
		}
		
		
		EmployeeDAO dao=new MySQLEmployeeDAOImpl1();
		Employee employee=new Employee();
		employee.setId(id);
		
		try {
			employee = dao.findEmployee(id);
		} catch (Throwable e) {
			request.setAttribute("statusString", "there is a problem in finding the Employee");
			RequestDispatcher dispatcher = request.getRequestDispatcher("StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		}
		if (employee == null) {

			request.setAttribute("statusString", "Employee was not found");
			RequestDispatcher dispatcher = request.getRequestDispatcher("StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("employee",employee);
			RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeDisplayer.jsp");
			dispatcher.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
