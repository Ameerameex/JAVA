package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	
	
	
	String str1,str2,str3;
	
	public void init(){
		ServletConfig config=getServletConfig();
		str1=config.getInitParameter("company");
		str2=config.getInitParameter("appName");
		str3=config.getInitParameter("messagePrefix");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context=getServletContext();
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 style='background-color:blue;color:white';>"+str3+" to "+str1+" "+str2+"</h1>");
		out.print(context.getInitParameter("intersetRate"));
		context.log("\n\n \t\t This Is An Example Of Logging A Message");
		out.println("</body>");
		out.println("</html>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
