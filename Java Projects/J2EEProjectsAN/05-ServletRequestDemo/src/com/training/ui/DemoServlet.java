package com.training.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String s1,s2;
	s1=request.getParameter("myName");
	s2=request.getParameter("myAge");
	int age=Integer.parseInt(s2);
	String name=s1;
	System.out.println("\t\t"+name);
	System.out.println("\t\t"+age);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
