package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Bank;


public class BankDisplayServlet extends HttpServlet {

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Bank bank=new Bank(1001, "HDFC Bank Ltd");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>Bank Details</h1>");
		out.println("<hr>");
		out.println("Bank Id : "+"<b>"+bank.getId()+"</b>");
		out.println("<br>");
		out.println("Bank Name : "+"<b>"+bank.getName()+"</b>");

		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
