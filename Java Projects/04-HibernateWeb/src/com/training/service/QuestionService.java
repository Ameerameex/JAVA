package com.training.service;

import java.util.List;
import java.util.Map;

import com.training.business.Question;


public interface QuestionService {

	public void addQuestionToBatch(Question question);
	
	public void saveBatch();
		
	public void createBatch(int batchSize);
	
	public List<Question> getAllQuestions();
	
	public void addAnswer(int questionId,int answerIndex);
	
	
	public Map<Integer,Boolean> getResultMap();

	



}
