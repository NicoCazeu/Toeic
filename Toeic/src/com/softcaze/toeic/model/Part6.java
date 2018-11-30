package com.softcaze.toeic.model;

public class Part6 extends Part {
	@Override
	public int nbrQuestion() {
		if(Toeic.type == TypeToeic.NEW) {
			return 16;
		}
		else {
			return 12;
		}
	}
	
	public int getBegin() {
		if(Toeic.type == TypeToeic.NEW) {
			return 131;
		}
		
		return 141;
	}
	
	@Override
	public int getEnd() {	
		if(Toeic.type == TypeToeic.NEW) {
			return 146;
		}
		
		return 152;
	}
}
