package com.training.business;

public class Answer {

	String answerText;
	int answerNumber;
	
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public int getAnswerNumber() {
		return answerNumber;
	}
	public void setAnswerNumber(int answerNumber) {
		this.answerNumber = answerNumber;
	}
	public Answer(String answerText, int answerNumber) {
		super();
		this.answerText = answerText;
		this.answerNumber = answerNumber;
	}
	public Answer() {
		super();
	}
	@Override
	public String toString() {
		return "Answer [answerText=" + answerText + ", answerNumber=" + answerNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answerNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		if (answerNumber != other.answerNumber)
			return false;
		return true;
	}
	
	
	

}
