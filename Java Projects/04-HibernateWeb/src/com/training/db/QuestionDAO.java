package com.training.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.business.Question;

public interface QuestionDAO {

	boolean addQuestion(Question question, Session session, Transaction transaction);

	Question findQuestion(int id, Session session);

	List<Question> getAllQuestion( Session session);

	boolean updateQuestion(Question question, Session session, Transaction transaction);

	boolean deleteQuestion(Question question, Session session, Transaction transaction);
	
	
}
