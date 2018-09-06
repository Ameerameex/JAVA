package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Bank;
import com.training.business.Contact;
import com.training.business.Customer;

public class CustomerDisplayServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Contact contact = new Contact("ameerkhan1030@gmail.com", "8883970825");
		Bank bank = new Bank(101, "HDFC Bank Ltd");
		Customer customer = new Customer(501, "Ameer Khan", contact, bank);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		String cssFileLocation = "Styles/Style1.css";
		String linkStr = "<link href='" + cssFileLocation + "'" + " rel='" + "stylesheet" + "'>";
		out.println(linkStr);
		
	
		out.println("</head>");
		out.println("<body>");
		String imageFileName = "banner-homepage-hr-managers.jpg";
		String location = "images/Banners";
		String imageLocation = location + "/" + imageFileName;
		int height = 40;
		int width = 100;
		out.println("<img src='");
		out.println(imageLocation);
		out.println("' width='" + width + "%' height ='" + height + "%'>");
		out.println("<table>");
		out.print("<tr>");
		out.println("<td class='caption'>" + " Customer Id " + "</td>");
		out.println("<td class='data'>" + customer.getId() + "</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>" + " Customer Name " + "</td>");
		out.println("<td class='data'>" + customer.getName() + "</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>" + " Customer Email " + "</td>");
		out.println("<td class='data'>" + customer.getContact().getEmail() + "</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>" + " Customer Phone " + "</td>");
		out.println("<td class='data'>" + customer.getContact().getPhone() + "</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>" + " Customer Bank Name " + "</td>");
		out.println("<td class='data'>" + customer.getBank().getName() + "</td>");
		out.print("</tr>");

		out.println("</table>");

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
