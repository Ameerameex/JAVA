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
import com.training.business.Contact;
import com.training.business.Customer;

public class CustomerListDisplayServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Bank bank = new Bank(101, "HDFC Bank Ltd");
		Bank bank1 = new Bank(102, "SBI Ltd");
		Bank bank2 = new Bank(103, "ICICI Bank Ltd");
		Bank bank3 = new Bank(104, "Axis Bank");
		Bank bank4 = new Bank(105, "City Union Bank ");

		Contact contact = new Contact("ameerkhan1030@gmail.com", "8883970821");
		Contact contact2 = new Contact("suriya.ameex@gmail.com", "8883970822");
		Contact contact3 = new Contact("madhan.ameex@gmail.com", "7883970825");
		Contact contact4 = new Contact("jayabalaji.ameex@gmail.com", "9883970825");
		Contact contact5 = new Contact("hari.ameex@gmail.com", "7883970823");
		Contact contact6 = new Contact("aashish.ameex@gmail.com", "8883970824");
		Contact contact7 = new Contact("parthiban.ameex@gmail.com", "8883970826");
		Contact contact8 = new Contact("javahari.ameex@gmail.com", "8883970827");
		Contact contact9 = new Contact("sanjay.ameex@gmail.com", "88839708298");
		Contact contact10 = new Contact("prasanna.ameex@gmail.com", "8883970829");

		Customer customer = new Customer(501, "Ameer Khan", contact, bank);
		Customer customer2 = new Customer(502, "Suriya Kumar", contact2, bank2);
		Customer customer3 = new Customer(503, "Madhan", contact3, bank3);
		Customer customer4 = new Customer(504, "JayaBalaji", contact4, bank4);
		Customer customer5 = new Customer(505, "Hari Baskar", contact5, bank1);
		Customer customer6 = new Customer(506, "ashish kare", contact6, bank2);
		Customer customer7 = new Customer(507, "parthiban", contact7, bank3);
		Customer customer8 = new Customer(508, "Java Hari", contact8, bank4);
		Customer customer9 = new Customer(509, "Sanjay kare", contact9, bank);
		Customer customer10 = new Customer(510, "Prasanna", contact10, bank1);
		
		List<Customer> customers=new ArrayList<>();
		customers.add(customer);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		customers.add(customer7);
		customers.add(customer8);
		customers.add(customer9);
		customers.add(customer10);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		String cssFileLocation = "Styles/Style2.css";
		String linkStr = "<link href='" + cssFileLocation + "'" + " rel='" + "stylesheet" + "'>";
		out.println(linkStr);
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>ID</th>");
		out.println("<th>NAME</th>");
		out.println("<th>EMAIL</th>");
		out.println("<th>PHONE</th>");
		out.println("<th>BANK</th>");
		out.println("</tr>");

		for (Customer customer11 : customers) {
			out.println("<tr>");
			out.print("<td>");
			out.println(customer11.getId());
			out.print("</td>");
			
			out.print("<td>");
			out.println(customer11.getName());
			out.print("</td>");
			
			out.print("<td>");
			out.println(customer11.getContact().getEmail());
			out.print("</td>");
			
			out.print("<td>");
			out.println(customer11.getContact().getPhone());
			out.print("</td>");
			
			out.print("<td>");
			out.println(customer11.getBank().getName());
			out.print("</td>");

			out.println("</tr>");

		}
		
		out.println("</table>");

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
