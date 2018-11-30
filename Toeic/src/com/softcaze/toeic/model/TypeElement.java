package com.softcaze.toeic.model;

public enum TypeElement {
	Type(0),
	Titre(0),
	Url(1);
	
	private int position;
	
	private TypeElement(int pos) {
		this.position = pos;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
}
