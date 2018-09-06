package com.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.Question;
import com.training.service.QuestionService;
import com.training.service.QuestionServiceImpl;


public class CountServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int count=Integer.parseInt(request.getParameter("txt_count"));
		HttpSession session=request.getSession(true);
		session.setAttribute("count", count);
		
		QuestionService service=new QuestionServiceImpl();
		
		session.setAttribute("QS", service);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/QuestionScreen.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
