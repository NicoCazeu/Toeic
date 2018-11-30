package com.softcaze.toeic.model;

public enum TypeToeic {
	OLD(1),
	NEW(2);
	
	private int type;
	
	TypeToeic(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
