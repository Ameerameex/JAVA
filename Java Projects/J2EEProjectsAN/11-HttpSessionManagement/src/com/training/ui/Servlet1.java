package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.Employee;


public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String s1,s2,s3;
		s1=request.getParameter("eid");
		s2=request.getParameter("ename");
		s3=request.getParameter("ebasic");
		
		int id=Integer.parseInt(s1);
		String name=s2;
		double basic=Double.parseDouble(s3);
		Employee employee=new Employee(id, name, basic);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>");
		out.print(id+","+name+","+basic);
		out.println("</h2>");
		HttpSession httpSession=request.getSession(true);
	
		
		out.print(httpSession.getId());
		System.out.println(httpSession.getId());
		httpSession.setAttribute("emp",employee);

		out.println("</body>");
		out.println("</html>");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
