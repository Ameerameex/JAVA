package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Employee;


public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employee employee1=new Employee(101, "Ameer", 10000.00, new Date());
		Employee employee2=new Employee(102, "Suriya", 13000.00, new Date());
		Employee employee3=new Employee(103, "Dhoni", 17000.00, new Date());
		Employee employee4=new Employee(104, "Faf", 19000.00, new Date());
		
		List<Employee> employees=new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		//response.setHeader("content-type", "text/html");
		response.setContentType("text/xml");
		PrintWriter out=response.getWriter();
		
		
		out.println("<?xml version='1.0' ?>");
		out.println("<employees>");
		for(Employee employee:employees)
		{
			out.println("<employee>");
			out.println("<id>" +employee.getId()+"</id>");
			out.println("<name>" +employee.getName()+"</name>");
			out.println("<salary>" +employee.getSalary()+"</salary>");
			out.println("<doj>" +employee.getDateOfJoin()+"</doj>");
			out.println("</employee>");

		}
		
		out.println("</employees>");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}