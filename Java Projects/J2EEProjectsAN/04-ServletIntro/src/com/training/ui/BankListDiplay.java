package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Bank;

public class BankListDiplay extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Bank bank=new Bank(101, "HDFC Bank Ltd");
		Bank bank1=new Bank(102, "SBI Ltd");
		Bank bank2=new Bank(103, "ICICI Bank Ltd");
		Bank bank3=new Bank(104, "Axis Bank");
		Bank bank4=new Bank(105, "City Union Bank ");
		
		List<Bank> banks=new ArrayList<>();
		banks.add(bank);
		banks.add(bank1);
		banks.add(bank2);
		banks.add(bank3);
		banks.add(bank4);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>Bank List</h1>");
		out.println("<hr>");
		out.println("<ol>");
		for (Bank bank5 : banks) {
			out.println("<li>");
			out.println(bank5.getName());
			out.println("</li>");

		}
		
		
		out.println("</ol>");
		//out.println("<p>"+"Number Of Banks : "+banks.size()+"<p>");

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
