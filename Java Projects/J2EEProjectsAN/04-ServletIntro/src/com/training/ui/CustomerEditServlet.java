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

public class CustomerEditServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Contact contact = new Contact("ameerkhan1030@gmail.com", "8883970825");
		Bank bank = new Bank(104, "Axis Bank");

		Customer customer = new Customer(401, "Ameer", contact, bank,'M',false);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		String str1 = "<form action='' method='get'>";

		String str2 = "</form>";
		StringBuffer buffer;

		out.println(str1);
		out.println("<table>");

		out.print("<tr>");
		out.print("<td class='caption'>");
		out.println("ID");
		out.print("</td>");
		out.print("<td class='editData'>");
		buffer=new StringBuffer();
		buffer.append("<input ");
		buffer.append( " name='txt_id' ");
		buffer.append("value= ");
		buffer.append(" '");
		buffer.append(customer.getId());
		buffer.append("'");
		buffer.append(">");
		out.println(buffer.toString());
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td class='caption'>");
		out.println("NAME");
		out.print("</td>");
		out.print("<td class='editData'>");
		buffer=new StringBuffer();
		buffer.append("<input ");
		buffer.append( " name='txt_name' ");
		buffer.append("value= ");
		buffer.append(" '");
		buffer.append(customer.getName());
		buffer.append("'");
		buffer.append(">");
		out.println(buffer.toString());
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td class='caption'>");
		out.println("GENDER");
		out.print("</td>");
		out.print("<td class='editData'>");
		buffer=new StringBuffer();
		if(customer.getGender()=='M'){
		buffer.append("<input ");
		buffer.append( " type='radio' ");
		buffer.append("name='rad_gender' ");
		buffer.append(" value='M' checked>");
		buffer.append("MALE");
		}else{
		buffer.append("<input ");
		buffer.append( " type='radio' ");
		buffer.append("name='rad_gender' ");
		buffer.append(" value='F'>");
		buffer.append("FEMALE");
		}
		if(customer.getGender()=='F'){
			buffer.append("<input ");
			buffer.append( " type='radio' ");
			buffer.append("name='rad_gender' ");
			buffer.append(" value='F' checked>");
			buffer.append("FEMALE");
			}else{
			buffer.append("<input ");
			buffer.append( " type='radio' ");
			buffer.append("name='rad_gender' ");
			buffer.append(" value='M'>");
			buffer.append("MALE");
			}
		out.println(buffer.toString());
		out.print("</td>");
		out.print("</tr>");
		

		out.print("<tr>");
        out.print("<td class='caption'>");
		out.println("EMAIL");
		out.print("</td>");
		out.print("<td class='editData'>");
		buffer=new StringBuffer();
		buffer.append("<input ");
		buffer.append( " name='txt_email' ");
		buffer.append("value= ");
		buffer.append(" '");
		buffer.append(customer.getContact().getEmail());
		buffer.append("'");
		buffer.append(">");
		out.println(buffer.toString());
		out.print("</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.print("<td class='caption'>");
		out.println("PHONE");
		out.print("</td>");
		out.print("<td class='editData'>");
		buffer=new StringBuffer();
		buffer.append("<input ");
		buffer.append( " name='txt_phone' ");
		buffer.append("value= ");
		buffer.append(" '");
		buffer.append(customer.getContact().getPhone());
		buffer.append("'");
		buffer.append(">");
		out.println(buffer.toString());
		out.print("</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.print("<td class='caption'>");
		out.println("BANK");
		out.print("</td>");
		
		buffer=new StringBuffer();
		out.print("<td class='editData'>");
		buffer.append("<select ");
		buffer.append( " name='combo_Bank'");
		buffer.append(">");
		
		Bank bank5=new Bank(101, "HDFC Bank Ltd");
		Bank bank1=new Bank(102, "SBI Ltd");
		Bank bank2=new Bank(103, "ICICI Bank Ltd");
		Bank bank3=new Bank(104, "Axis Bank");
		Bank bank4=new Bank(105, "City Union Bank ");
		List<Bank> banks = new ArrayList<>();
		banks.add(bank5);
		banks.add(bank1);
		banks.add(bank2);
		banks.add(bank3);
		banks.add(bank4);
		for (Bank bank6 : banks) {
			if(bank6.getName()==customer.getBank().getName()){
				
				buffer.append("<option ");
				buffer.append("value=");
				buffer.append("'");
				buffer.append(bank6.getId());
				buffer.append("'");
				buffer.append(" selected");
				buffer.append(">");
				buffer.append(bank6.getName());
				buffer.append("</option>");
			}else{
			buffer.append("<option ");
			buffer.append("value=");
			buffer.append("'");
			buffer.append(bank6.getId());
			buffer.append("'");
			buffer.append(">");
			buffer.append(bank6.getName());
			buffer.append("</option>");
			}

		}
		buffer.append("</select>");
		out.println(buffer.toString());
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td colspan='2'>");
		buffer=new StringBuffer();
		if(customer.isSendSMSAlerts()==true)
		{
			buffer.append("<input ");
			buffer.append("type='checkbox' ");
			buffer.append("name=chck_smx ");
			buffer.append("value='YES' checked>");
			buffer.append("SEND SMS ALERTS");
		}else{
			buffer.append("<input ");
			buffer.append("type='checkbox' ");
			buffer.append("name=chck_smx ");
			buffer.append("value='YES' >");
			buffer.append("SEND SMS ALERTS");
		}

		out.println(buffer.toString());

		out.println("</td>");

		out.println("</tr>");

		out.print("<tr>");
		out.print("<td colspan='2'>");
		out.print("<input type='submit' value='UPDATE'>");
		out.println("</td>");

		out.println("</tr>");
		

		out.println("</table>");
		out.println(str2);


		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
