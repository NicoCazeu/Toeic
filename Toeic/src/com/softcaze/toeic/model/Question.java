package com.softcaze.toeic.model;

public class Question {
	private TypeReponse userReponse;
	private TypeReponse correctReponse;
	
	public Question() {
	}
	
	public TypeReponse getCorrectReponse() {
		return correctReponse;
	}
	public TypeReponse getUserReponse() {
		return userReponse;
	}
	
	public void setCorrectReponse(TypeReponse correctReponse) {
		this.correctReponse = correctReponse;
	}
	public void setUserReponse(TypeReponse userReponse) {
		this.userReponse = userReponse;
	}
}
