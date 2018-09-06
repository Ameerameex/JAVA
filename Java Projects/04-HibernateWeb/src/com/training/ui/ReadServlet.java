package com.training.ui;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


public class ReadServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession(true);
		
		
		int qnNo = 0;
		String qnNo1 = request.getParameter("txt_qnNo");
		if (qnNo1 != null && qnNo1.trim().length() > 0) {
			qnNo = Integer.parseInt(qnNo1);
		}

		String qn = request.getParameter("txt_qn");
		Question question = new Question();
		question.setId(qnNo);
		question.setQuestionText(qn);
		String[] strings=request.getParameterValues("choices");
	
		List<String> values=Arrays.asList(strings);
		

		List<Answer> choices = new ArrayList<Answer>();
		
		for (int i1 = 0; i1 < 4; i1++) {
			Answer answer = new Answer();
			answer.setAnswerNumber(i1 + 1);
			String answerText =strings[i1];
			answer.setAnswerText(answerText);
			choices.add(answer);
		}

		question.setAnswers(choices);

		String ca = "";
		int choiceNo = 0;

		String choiceNo1 = request.getParameter("choiceNo");

		if (choiceNo1 != null && choiceNo1.trim().length() > 0) {
			choiceNo = Integer.parseInt(choiceNo1);
		}

		switch (choiceNo) {
		case 1:
			ca = values.get(0);
			break;
		case 2:
			ca = values.get(1);
			break;
		case 3:
			ca = values.get(2);
			break;
		case 4:
			ca = values.get(3);
			break;
		default:
			break;
		}

		Answer answer5 = new Answer(ca, choiceNo);
		question.setCorrectAnswer(answer5);
		int mark = 0;
		String mark1 = request.getParameter("mark");
		if (mark1 != null && mark1.trim().length() > 0) {
			mark = Integer.parseInt(mark1);
		}

		question.setMarkWeightage(mark);
		
		request.setAttribute("question", question);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Save");
		dispatcher.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
