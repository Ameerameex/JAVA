package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentInputReaderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String s1,s2,s3,s4,s5;
		s1=request.getParameter("txt_Roll");
		s2=request.getParameter("txt_Name");
		s3=request.getParameter("txt_DOB");
		s4=request.getParameter("txt_AVG");
		s5=request.getParameter("txt_GRADE");
		int rollNumber=Integer.parseInt(s1);
		String name=s2;
		Date DOB=null;
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			DOB=dateFormat.parse(s3);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		double average=Double.parseDouble(s4);
		char grade=s5.charAt(0);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.print(rollNumber+","+name+","+DOB+","+average+","+grade);
		out.println("</body>");
		out.println("</html>");
		

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
