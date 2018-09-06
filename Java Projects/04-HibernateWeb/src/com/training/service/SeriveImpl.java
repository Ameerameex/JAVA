package com.training.service;

import java.util.List;

import com.training.business.Question;
import com.training.db.DAOImpl;

public class SeriveImpl implements Service {

	
	@Override
	public boolean add(Question question) {
		return new DAOImpl().insertTesting(question);
	}

	@Override
	public void find() {

		new DAOImpl().loadTesting();
	}

	@Override
	public List<Question> list() {

		return new DAOImpl().listTesting();
	}

	
}
