package com.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Employee;

public class EmployeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

Employee employee=new Employee();
employee.setName("ameer");
employee.setId(101);
try{
employee.setBasic(10000.00);
}catch (Exception e) {
	RequestDispatcher dispatcher=request.getRequestDispatcher("Errorhandling");
	request.setAttribute("EXC",e);
	dispatcher.forward(request, response);
}
RequestDispatcher dispatcher=request.getRequestDispatcher("EmpoyeeDisplay");
request.setAttribute("EMP",employee);
dispatcher.forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
