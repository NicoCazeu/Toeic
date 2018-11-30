package com.softcaze.toeic.model;

public class Part2 extends Part {
	@Override
	public int nbrQuestion() {
		if(Toeic.type == TypeToeic.NEW) {
			return 25;
		}
		else {
			return 30;
		}
	}
	
	@Override
	public int nbrChoixReponse() {
		return 3; 
	}
	
	@Override
	public int getBegin() {
		if(Toeic.type == TypeToeic.NEW) {
			return 7;
		}
		
		return 11;
	}
	
	@Override
	public int getEnd() {		
		if(Toeic.type == TypeToeic.NEW) {
			return 31;
		}
		
		return 40;
	}
}
