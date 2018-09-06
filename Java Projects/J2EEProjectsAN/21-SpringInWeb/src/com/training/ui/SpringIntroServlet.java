package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.training.business.Circle;


public class SpringIntroServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context=getServletContext();
		WebApplicationContext applicationContext=WebApplicationContextUtils.getWebApplicationContext(context);
		
		Circle circle=(Circle) applicationContext.getBean("circleBean");
		PrintWriter out=response.getWriter();
		out.println(circle);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
