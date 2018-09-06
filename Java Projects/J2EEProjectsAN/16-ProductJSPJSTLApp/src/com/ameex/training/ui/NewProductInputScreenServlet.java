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
		
		Category category=new Category('L',"LAPTOP");
		Category category2=new Category('M',"MOBILE");
		Category category3=new Category('T',"TELEVISION");
		Category category4=new Category('A',"AIR CONDITIONER");
		
		List<Category> categories=new ArrayList<>();
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		
		request.setAttribute("categories",categories);



		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ProductNewInput.jsp");
		dispatcher.include(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
