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


public class EmployeeDeletingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s;
		int id=0;
		s=request.getParameter("txt_id");
		if(s!=null && s.trim().length()>0){
			
			id=Integer.parseInt(s);
		}
		
		Employee employee=new Employee(); 
		employee.setId(id);
		
		boolean status=false;
		EmployeeDAO dao=new MySQLEmployeeDAOImpl1();
		try {
			status=dao.deleteEmployee(employee);
		}catch (Throwable e) {
			request.setAttribute("statusString", "There is problem deleting the Employee");

		}
		if(status==true){
			request.setAttribute("statusString", "Employee Deleted Successfully");

		}else
		{
			request.setAttribute("statusString", "Employee Not Deleted");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("StatusDisplayer.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
