package com.training.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements Serializable{

	
	int id;
	
	String questionText;
	int markWeightage;
	@OneToMany(mappedBy="question", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	List<Answer> answers = new ArrayList<Answer>();
	Answer correctAnswer;

	public Question(int id, String questionText, int markWeightage, Answer correctAnswer) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.markWeightage = markWeightage;
		this.correctAnswer = correctAnswer;
	}

	public Question() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int getMarkWeightage() {
		return markWeightage;
	}

	public void setMarkWeightage(int markWeightage) {
		this.markWeightage = markWeightage;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Answer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Question other = (Question) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", questionText=" + questionText + ", markWeightage=" + markWeightage
				+ ", answers=" + answers + ", correctAnswer=" + correctAnswer + "]";
	}
	
public void setChoices1(List<Answer> answer){
		
		this.answers.addAll(answer);
	}

}
