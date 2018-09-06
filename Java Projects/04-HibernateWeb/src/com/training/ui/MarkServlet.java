package com.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.Answer;
import com.training.business.Question;
import com.training.service.QuestionService;
import com.training.service.QuestionServiceImpl;


public class MarkServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		
		
		int choice=Integer.parseInt(request.getParameter("Choice"));
		Question question=(Question) session.getAttribute("question");
		
		
		QuestionService service =(QuestionService) session.getAttribute("QS");
		int total;
		if(question.getCorrectAnswer().getAnswerNumber()==choice){
			int score=question.getMarkWeightage()+(int) session.getAttribute("score");
			total=question.getMarkWeightage()+(int) session.getAttribute("total");
			
			session.setAttribute("total", total);
			session.setAttribute("score",score);
		}else{
			total=question.getMarkWeightage()+(int) session.getAttribute("total");
			session.setAttribute("total", total);
		}
		
			
			service.addAnswer(question.getId(), choice);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("Test");
			dispatcher.forward(request, response);
		
		
	
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
