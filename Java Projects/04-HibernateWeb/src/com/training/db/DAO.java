package com.training.db;

import java.util.List;

import com.training.business.Question;

public interface DAO {

	boolean insertTesting(Question question);
	List<Question> listTesting();
	void loadTesting();
	

}
