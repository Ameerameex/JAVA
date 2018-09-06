package com.training.service;

import java.util.List;

import com.training.business.Question;

public interface Service {

	boolean add(Question question);
	void find();
	List<Question> list();
}
