package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ErrorhandlingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Exception e=(Exception) request.getAttribute("EXC");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>");
		
		
		out.println("Error Report :");

		out.println("</td>");
		
		out.println("<td>");
		
		
		out.println(new Date());

		out.println("</td>");

		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan='2'>");
		
		out.println("Error Message"+":"+e.getMessage());
		
		

		out.println("</td>");
		
		

		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td colspan='2'>");
		
		e.printStackTrace(out);
		
		

		out.println("</td>");
		
		

		out.println("</tr>");

		out.println("</table>");

		out.println("</body>");
		out.println("</html>");

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
