package com.training.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet5 extends HttpServlet {
	
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n\n\t\t"+request.getLocale().getCountry());
		System.out.println("\n\n\t\t"+request.getLocale().getDisplayCountry());
		System.out.println("\n\n\t\t"+request.getLocale().getLanguage());
		System.out.println("\n\n\t\t"+request.getRemoteAddr());
		System.out.println("\n\n\t\t"+request.getServerName());
		System.out.println("\n\n\t\t"+request.getRequestURI());
		System.out.println("\n\n\t\t"+request.getRequestURL());







	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
