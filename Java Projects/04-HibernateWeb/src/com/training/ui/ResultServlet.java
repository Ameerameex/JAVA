package com.training.ui;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.service.QuestionService;


public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		QuestionService service=(QuestionService) session.getAttribute("QS");
		
		Map<Integer, Boolean> results=service.getResultMap();
		Set<Integer> keys=results.keySet();
	
		session.setAttribute("keys", keys);
		session.setAttribute("results", results);
		
		
		
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/ResultScreen.jsp");
		
		dispatcher.include(request, response);
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
