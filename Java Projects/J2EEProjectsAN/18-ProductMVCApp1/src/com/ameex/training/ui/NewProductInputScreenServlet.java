package com.ameex.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Category;

 
public class NewProductInputScreenServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletContext context=getServletContext();
		String applicationtitle=context.getInitParameter("portalTitle");
		
		ServletConfig config=getServletConfig();
		String moduleName=config.getInitParameter("moduleTitle");
		String cssFile=config.getInitParameter("cssFile");
		out.println("<h1>"+applicationtitle+"</h1>");
		out.println("<h2>"+moduleName+"</h2>");
		out.println("<link href='"+cssFile+"' rel='stylesheet'>");
		
		
		
		List<Category> categories=(List<Category>) context.getAttribute("categories");

		
		request.setAttribute("categories",categories);



		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/ProductNewInput.jsp");
		dispatcher.include(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
