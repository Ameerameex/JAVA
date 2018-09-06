package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.crypto.CipherInputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Address;
import com.training.business.Contact;
import com.training.business.Customer;
import com.training.business.InterestPayment;


public class CustomerServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	InterestPayment interestPayment1=new InterestPayment(new Date(), 1500.00);
	InterestPayment interestPayment2=new InterestPayment(new Date(), 2500.00);
	InterestPayment interestPayment3=new InterestPayment(new Date(), 3500.00);

	String[] nominees={"Ameer","Dhoni","vijay","Raina"};
	
	Contact contact=new Contact();
	contact.setEmail("ameer.ameex@gmail.com");
	contact.setPhone("8883970825");
	
	Address address=new Address();
	address.setDoorNo("A-12");
	address.setAreaName("Retteri");
	address.setCity("chennai");
	address.setPincode("600099");
	
	Customer customer=new Customer(101,"Ameer", address, contact);
	
	customer.addNominees(4,nominees);
	
	List<InterestPayment> payments=new ArrayList<>();
	
	payments.add(interestPayment1);
	payments.add(interestPayment2);
	payments.add(interestPayment3);
	customer.setPayments(payments);
	
	request.setAttribute("customer",customer);
	RequestDispatcher dispatcher=request.getRequestDispatcher("Display1.jsp");
	dispatcher.forward(request, response);

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}


}
