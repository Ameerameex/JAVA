package com.training.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.training.business.Question;

public class QuestionDAOImpl implements QuestionDAO {
Transaction transaction;

public boolean addQuestion(Question question, Session session, Transaction transaction) {

	try {
		
		
		session.persist(question);
		
	
		
		return true;
	} catch (Exception e) {
		return false;
	}
}

public Question findQuestion(int id, Session session) {
	try {
		Question question = session.load(Question.class, id);
	
		return question;
	} catch (Exception e) {
		return null;
	}
}

public List<Question> getAllQuestion(Session session) {
	try {
		String HQL = "from Question";
		Query query = session.createQuery(HQL);
		List<Question> questions = query.list();
		
		return questions;
	} catch (Exception e) {
		return null;
	}
}

public boolean updateQuestion(Question question, Session session, Transaction transaction) {
	try {
		
		Question question2 = session.load(Question.class, question.getId());
		question2.setQuestionText("changed the question??");
		session.merge(question2);
		
		
		return true;
	} catch (Exception e) {
		return false;
	}
}

public boolean deleteQuestion(Question question, Session session, Transaction transaction) {
	try {
		
		Question question2 = session.load(Question.class, question.getId());

		session.delete(question2);
		transaction.commit();
	
		return true;

	} catch (Exception e) {
		return false;
	}
}

	
	
}
