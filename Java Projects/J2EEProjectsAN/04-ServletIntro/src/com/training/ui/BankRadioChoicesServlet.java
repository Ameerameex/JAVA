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
import com.training.business.Category;


public class BankRadioChoicesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bank bank = new Bank(101, "HDFC Bank Ltd");
		Bank bank1 = new Bank(102, "SBI Ltd");
		Bank bank2 = new Bank(103, "ICICI Bank Ltd");
		Bank bank3 = new Bank(104, "Axis Bank");
		Bank bank4 = new Bank(105, "City Union Bank ");
		List<Bank> banks = new ArrayList<>();
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
		String str1 = "<select name='combo_Bank'";
		String str2 = "</select>";

		out.print("<form action='' mehod='get'>");
		out.print("Choose Bank <br>");
		for (int i = 0; i <banks.size(); i++) {
			if (i==banks.size()-1) {
				out.println("<input type='radio' name=rad_cat value='" + banks.get(i).getId() + "' checked>");
			} else {
				out.println("<input type='radio' name=rad_cat value='" + banks.get(i).getId() + "'>");
			}
			out.print(banks.get(i).getName());
			out.println("<br>");
		}

		out.print("<br>");
		out.print("<input type='submit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
