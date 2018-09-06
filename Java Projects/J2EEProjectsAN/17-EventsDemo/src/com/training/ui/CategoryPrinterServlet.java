package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.Category;

public class CategoryPrinterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		out.println(10/0);
		ServletContext context=getServletContext();
		List<Category> categories=(List<Category>)context.getAttribute("categories");
		

		String myName="Ameer";
		HttpSession httpSession=request.getSession(true);
		httpSession.setAttribute("MYNAME", myName);
		
		out.println("<h1>"+context.getAttribute("appTitle")+"</h1>");
		out.println(categories);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
