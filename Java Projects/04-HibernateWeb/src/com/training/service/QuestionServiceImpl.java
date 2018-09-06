package com.training.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.business.Answer;
import com.training.business.Question;
import com.training.db.QuestionDAO;
import com.training.db.QuestionDAOImpl;
import com.training.db.SessionManager;
import com.training.db.TransactionManager;

public class QuestionServiceImpl implements QuestionService {
	int score;
	int total;
	List<Question> questions;
	int index;
	Map<Integer, Integer> answerMap;

	public void addQuestionToBatch(Question question) {
		if (questions == null) {
			questions = new ArrayList<>();
		}
		questions.add(question);

	}

	public void saveBatch() {

		Session session = SessionManager.createSession();

		Transaction transaction = session.beginTransaction();
		for (Question question : questions) {

			QuestionDAO dao = new QuestionDAOImpl();

			dao.addQuestion(question, session, transaction);

		}
		transaction.commit();
		SessionManager.closeSession(session);

	}

	public void createBatch(int batchSize) {

		questions = new ArrayList<Question>();
		for (int i = 0; i < batchSize; i++) {
			questions.add(new Question());

		}

	}

	public List<Question> getAllQuestions() {
		Session session = SessionManager.createSession();
		QuestionDAO dao = new QuestionDAOImpl();
		List<Question> questions = dao.getAllQuestion(session);

		SessionManager.closeSession(session);
		return questions;

	}

	public void addAnswer(int questionId, int answerIndex) {
		if (answerMap == null)
			answerMap = new TreeMap<>();
		answerMap.put(questionId, answerIndex);

	}

	public Map<Integer, Boolean> getResultMap() {
		Map<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
		List<Question> list = getAllQuestions();

		for (Question question : list) {

			if (question.getCorrectAnswer().getAnswerNumber() == answerMap.get(question.getId())) {
				map.put(question.getId(), true);
				score += question.getMarkWeightage();
				total += question.getMarkWeightage();

			} else {
				map.put(question.getId(), false);
				total += question.getMarkWeightage();

			}
		}

		return map;
	}

}
