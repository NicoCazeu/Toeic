package com.softcaze.toeic.model;

public class Part7 extends Part {
	@Override
	public int nbrQuestion() {
		if(Toeic.type == TypeToeic.NEW) {
			return 54;
		}
		else {
			return 48;
		}
	}
	
	public int getBegin() {
		if(Toeic.type == TypeToeic.NEW) {
			return 146;
		}
		
		return 153;
	}
	
	@Override
	public int getEnd() {			
		return 200;
	}
}
