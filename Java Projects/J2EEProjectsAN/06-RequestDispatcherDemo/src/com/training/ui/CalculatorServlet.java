package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int a = 100;
		int b = 0;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		try {
			int c = a / b;
			out.print(c);
		} catch (Exception e) {

			RequestDispatcher dispatcher=request.getRequestDispatcher("Errorhandling");
			request.setAttribute("EXC",e);
			dispatcher.forward(request, response);
			
		}
		
		
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
