package com.softcaze.toeic.model;

import java.util.List;

import com.softcaze.toeic.constance.AppConstants;

public abstract class Part {
	private int begin;
	private int end;
	private int score;
	private long time;
	private List<Question> questions;
	
	public int nbrQuestion() {
		return AppConstants.nbrQuestionPartDefault;
	}
	
	public int nbrChoixReponse() {
		return 4; 
	}
	
	public int getScore() {
		return score;
	}
	
	public long getTime() {
		return time;
	}
	
	public int getBegin() {
		return begin;
	}
	
	public int getEnd() {
		return end;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setTime(long time) {
		this.time = time;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
