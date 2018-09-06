package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Loan;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Loan loan1 = new Loan(101, 20000.00, "personal", "Ameer", 3, new Date());
		Loan loan2 = new Loan(102, 20450.00, "Education", "Balaji", 2, new Date());
		Loan loan3 = new Loan(103, 20023.00, "Home", "Java", 4, new Date());
		Loan loan4 = new Loan(104, 20000.00, "personal", "Ameer", 3, new Date());
		Loan loan5 = new Loan(105, 2045000.00, "Education", "Balaji", 2, new Date());
		Loan loan6 = new Loan(106, 20023.00, "Home", "Java", 4, new Date());	
		Loan loan7 = new Loan(107, 20000.00, "personal", "Ameer", 3, new Date());
		Loan loan8 = new Loan(108, 20450.00, "Education", "Balaji", 2, new Date());
		Loan loan9 = new Loan(109, 20023.00, "Home", "Java", 4, new Date());
		Loan loan10 = new Loan(110, 20023.00, "Home", "Java", 4, new Date());

		List<Loan> loans = new ArrayList<>();
		loans.add(loan1);
		loans.add(loan2);
		loans.add(loan3);
		loans.add(loan4);
		loans.add(loan5);
		loans.add(loan6);
		loans.add(loan7);
		loans.add(loan8);
		loans.add(loan9);
		loans.add(loan10);
		
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Test3.jsp");
		request.setAttribute("LOANS", loans);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
