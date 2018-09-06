package com.ameex.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ameex.training.business.User;

public class FrontControllerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("\n\n \t\t [ Front Controller ]");
		System.out.println("\n\n \t\t [ Front Controller " + request.getRequestURI() + "]");
		System.out.println("\n\n \t\t [ Front Controller " + request.getRequestURL() + "]");
		System.out.println("\n\n \t\t [ Front Controller " + request.getRequestedSessionId() + "]");

		String URI = request.getRequestURI();
		int dotIndex = URI.lastIndexOf('.');
		String actionRemovedURI = URI.substring(0, dotIndex);
		int slashIndex = actionRemovedURI.indexOf('/', 1);
		System.out.println(slashIndex);
		String appName = actionRemovedURI.substring(0, slashIndex);
		int length = appName.length();
		System.out.println(length);
		String computedURI = actionRemovedURI.substring(length + 1);
		System.out.println(computedURI);
		//// Calendar calendar=Calendar.getInstance();
		// int hrs=calendar.get(Calendar.HOUR_OF_DAY);
		// if(hrs>9 && hrs<17 ){
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		if (user == null) {
			if (!computedURI.equalsIgnoreCase("LoginValidator")) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage");
				request.setAttribute("message", "Enter a valid Email");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(computedURI);
				dispatcher.forward(request, response);
			}
		} else {

			RequestDispatcher dispatcher = request.getRequestDispatcher(computedURI);
			dispatcher.forward(request, response);
		}
		// }
		// else{
		// PrintWriter out=response.getWriter();
		// out.println("SORRY......Application under Maintanence.....Try
		// tomorrow");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
