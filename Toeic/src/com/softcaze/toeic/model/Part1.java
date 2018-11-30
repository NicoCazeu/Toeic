package com.softcaze.toeic.model;

public class Part1 extends Part {
	@Override
	public int nbrQuestion() {
		if(Toeic.type == TypeToeic.NEW) {
			return 6;
		}
		else {
			return 10;
		}
	}

	@Override
	public int getBegin() {
		return 0;
	}
	
	@Override
	public int getEnd() {		
		if(Toeic.type == TypeToeic.NEW) {
			return 6;
		}
		
		return 10;
	}
}
