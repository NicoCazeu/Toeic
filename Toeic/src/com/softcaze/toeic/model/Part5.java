package com.softcaze.toeic.model;

public class Part5 extends Part {
	@Override
	public int nbrQuestion() {
		if(Toeic.type == TypeToeic.NEW) {
			return 30;
		}
		else {
			return 40;
		}
	}
	
	public int getBegin() {		
		return 101;
	}
	
	@Override
	public int getEnd() {	
		if(Toeic.type == TypeToeic.NEW) {
			return 130;
		}
		
		return 140;
	}
}
