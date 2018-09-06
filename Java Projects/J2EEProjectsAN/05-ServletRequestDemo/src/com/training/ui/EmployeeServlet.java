package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name="Ameer";
	int id=101;
	
	String s1=request.getParameter("rad_gender");
	char gender=s1.charAt(0);
String s2=request.getParameter("chk_manager");
boolean manager=false;
if(s2==null){
	manager=false;
}else{ 
	if(s2.equals("Yes")){
		manager=true;

	}
}
String s3=request.getParameter("combo_city");
char cityCode=s3.charAt(0);
String cityName=null;
switch (cityCode) {
case 'C':cityName="Chennai";
	
	break;
case 'B':cityName="Bengalore";

break;
case 'H':cityName="Hyderabad";

break;

default:
	break;
}

	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title> Demo</title>");
	out.println("</head>");
	out.println("<body>");
	
	out.print(name+",");
	out.println(id+",");
	out.print(gender+","+manager+","+cityName);
	out.println("</body>");
	out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
