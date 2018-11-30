package com.softcaze.toeic.model;

public class Listenning extends Section {
	private Part1 part1;
	private Part2 part2;
	private Part3 part3;
	private Part4 part4;
	
	public Listenning() {
		this.part1 = new Part1();
		this.part2 = new Part2();
		this.part3 = new Part3();
		this.part4 = new Part4();
	}
	
	public Part1 getPart1() {
		return part1;
	}
	
	public Part2 getPart2() {
		return part2;
	}
	
	public Part3 getPart3() {
		return part3;
	}
	
	public Part4 getPart4() {
		return part4;
	}
	
	public void setPart1(Part1 part1) {
		this.part1 = part1;
	}
	
	public void setPart2(Part2 part2) {
		this.part2 = part2;
	}
	
	public void setPart3(Part3 part3) {
		this.part3 = part3;
	}
	
	public void setPart4(Part4 part4) {
		this.part4 = part4;
	}
}
