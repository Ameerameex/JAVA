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

public class SaveServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		int count = (Integer) session.getAttribute("count");

		Question question = (Question) request.getAttribute("question");
		QuestionService service = (QuestionService) session.getAttribute("QS");

		count--;
		service.addQuestionToBatch(question);
		if (count != 0) {

			session.setAttribute("count", count);

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/QuestionScreen.jsp");
			dispatcher.forward(request, response);
		} else {

			service.saveBatch();

			RequestDispatcher dispatcher = request.getRequestDispatcher("Home");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
