package com.training.ui;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.business.Question;
import com.training.service.QuestionService;
import com.training.service.QuestionServiceImpl;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		 List<Question> questions=(List<Question>) session.getAttribute("questions");
	    int size=(int) session.getAttribute("qnSize");
	   
	    
	    int lastId=questions.get(questions.size()-1).getId();
	    
	    
	    int i=(int) session.getAttribute("values");
	    
	   

	    	if(size>0){
	    		Question question=questions.get(i);
	    		i++;size--;
	    		 session.setAttribute("values", i);
	    		 session.setAttribute("qnSize", size);
	    	
	    	RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/TestScreen.jsp");
	    	
	    	
	    	
	    	session.setAttribute("question", question);
			dispatcher.forward(request, response);
		}else{

			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/jsp/Status.jsp");
			request.setAttribute("cmd", "Test Completed Successfully");
			
			dispatcher.forward(request, response);
			
		}
	
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
