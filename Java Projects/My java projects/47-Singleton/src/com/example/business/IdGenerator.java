package com.example.business;

public class IdGenerator {

	int number;
	static IdGenerator instance;

	public static final IdGenerator getInstance() {

		if (instance == null) {

			instance = new IdGenerator();
		}

		return instance;
	}

	private IdGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public final int getNumber() {
		return ++number;
	}


}
