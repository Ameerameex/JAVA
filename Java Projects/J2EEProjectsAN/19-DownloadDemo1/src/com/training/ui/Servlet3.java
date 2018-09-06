package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		response.setHeader("Content-Type","text/html");
		response.setIntHeader("Content-length", 21);
		response.setHeader("MyName", "Suriya");
		response.setIntHeader("MyAge",6);
		response.setHeader("MyDOB", "12-12-1030");
		out.print("hello");
		out.print("<br>");
		out.print("<h1>World</h1>");



	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
