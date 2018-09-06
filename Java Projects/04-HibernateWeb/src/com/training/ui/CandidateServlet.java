package com.training.ui;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.Question;
import com.training.service.QuestionService;
import com.training.service.QuestionServiceImpl;


public class CandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		session.setAttribute("values", 0);
		session.setAttribute("total", 0);
		session.setAttribute("score",0);
		
		QuestionService service=new QuestionServiceImpl();
		 List<Question> questions=service.getAllQuestions();
		    int size=questions.size();
		   
		    session.setAttribute("qnSize", size);
		    session.setAttribute("questions", questions);
		session.setAttribute("QS",service);
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/Candidate.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
