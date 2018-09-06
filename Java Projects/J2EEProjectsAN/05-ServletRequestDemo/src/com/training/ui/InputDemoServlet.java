package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputDemoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	Enumeration<String> allNames=request.getParameterNames();
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title> Demo</title>");
	out.println("</head>");
	out.println("<body>");
	while (allNames.hasMoreElements()) {
		
		out.print(allNames.nextElement());
		out.print("<br>");
		
	
	}
	out.println("</body>");
	out.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
