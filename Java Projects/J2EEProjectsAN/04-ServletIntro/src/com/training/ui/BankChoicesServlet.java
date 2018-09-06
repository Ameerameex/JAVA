package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Bank;
import com.training.business.Category;

public class BankChoicesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Bank bank = new Bank(1, "HDFC Bank Ltd");
		Bank bank1 = new Bank(2, "SBI Ltd");
		Bank bank2 = new Bank(3, "ICICI Bank Ltd");
		Bank bank3 = new Bank(4, "Axis Bank");
		Bank bank4 = new Bank(5, "City Union Bank ");
		Set<Bank> banks = new HashSet<>();
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
		String str1 = "<select name='combo_Bank'>";
		String str2 = "</select>";

		out.print("<form action='' mehod='get'>");
		out.print("Select The Bank<br>");

		out.print(str1);
		out.println("<option value='0'>Select a Bank</option>");
		for (Bank bank5 : banks) {
			out.println("<option value='" + bank5.getId() + "'>");
			out.println(bank5.getName());
			out.println("</option>");

		}

		out.println(str2);
		out.print("<br>");
		out.print("<input type='submit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
