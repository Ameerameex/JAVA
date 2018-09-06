package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.hibernate.Session;

import com.training.business.Answer;
import com.training.business.Question;
import com.training.service.QuestionService;
import com.training.service.QuestionServiceImpl;


public class QuestionCountServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int count=Integer.parseInt(request.getParameter("txt_Qn"));
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/Question.jsp");
		QuestionService questionService=new QuestionServiceImpl();
		questionService.createBatch(count);
		HttpSession session=request.getSession(true);
		session.setAttribute("service", questionService);
		Question question=new Question();
		Answer answer=new Answer();
		Answer answer1=new Answer();
		Answer answer2=new Answer();
		Answer answer3=new Answer();
		Answer answer4=new Answer();
		List<Answer> answers=new ArrayList<Answer>();
		answers.add(answer);
		answers.add(answer1);
		answers.add(answer2);
		answers.add(answer3);
		answers.add(answer4);
		question.setAnswers(answers);
		request.setAttribute("question", question);
		
		dispatcher.forward(request, response);
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
