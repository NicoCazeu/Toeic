package com.softcaze.toeic.model;

public class Reading extends Section {
	private Part5 part5;
	private Part6 part6;
	private Part7 part7;
	
	public Reading() {
		this.part5 = new Part5();
		this.part6 = new Part6();
		this.part7 = new Part7();
	}
	
	public Part5 getPart5() {
		return part5;
	}
	
	public Part6 getPart6() {
		return part6;
	}
	
	public Part7 getPart7() {
		return part7;
	}
	
	public void setPart5(Part5 part5) {
		this.part5 = part5;
	}
	
	public void setPart6(Part6 part6) {
		this.part6 = part6;
	}
	
	public void setPart7(Part7 part7) {
		this.part7 = part7;
	}
}
