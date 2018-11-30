package com.softcaze.toeic.model;

import com.softcaze.toeic.constance.AppConstants;

public abstract class Section {
	private int score;
	private long time;
	
	public int nbrQuestion() {
		return AppConstants.nbrQuestionSection;
	}
	
	public int getScore() {
		return score;
	}
	
	public long getTime() {
		return time;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setTime(long time) {
		this.time = time;
	}
}
