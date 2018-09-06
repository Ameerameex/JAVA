package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewEmployeeInputScreenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
			
	       ServletContext context=getServletContext();
	       String appTitle=context.getInitParameter("portalTitle");
	       
	       ServletConfig config=getServletConfig();
	       String moduleName=config.getInitParameter("moduleTitle");
	       String cssFile=config.getInitParameter("cssFile");
	       
	       out.println("<h1>" + appTitle+"</h1>");
	       out.println("<h2>" + moduleName+"</h2>");
	       out.println("<link href='"+cssFile+"' rel='stylesheet'>");
	       RequestDispatcher dispatcher=request.getRequestDispatcher("EmployeeNewInput.jsp");
			dispatcher.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
