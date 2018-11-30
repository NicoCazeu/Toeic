package com.softcaze.toeic.model;

public class Part3 extends Part {
	@Override
	public int nbrQuestion() {
		if(Toeic.type == TypeToeic.NEW) {
			return 39;
		}
		else {
			return 30;
		}
	}
	
	@Override
	public int getBegin() {
		if(Toeic.type == TypeToeic.NEW) {
			return 32;
		}
		
		return 41;
	}
	
	@Override
	public int getEnd() {		
		return 70;
	}
}
