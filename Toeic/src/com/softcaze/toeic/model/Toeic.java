package com.softcaze.toeic.model;

import java.io.IOException;

import com.softcaze.toeic.Fenetre;

public class Toeic {
	public static TypeToeic type;
	private Listenning listenning;
	private Reading reading;
	private int numToeic;
	private String urlListenning;
	private String urlReading;
	private long date;
	private Fenetre fenetre;
	private String titleListenning;
	private String titleReading;
	
	public Toeic(int numToeic, long date) throws IOException {
		this.listenning = new Listenning();
		this.reading = new Reading();
		this.numToeic = numToeic;
		this.date = date;
		this.fenetre = new Fenetre(1100, 700);
		this.urlListenning = this.fenetre.getUrlListenning();
		this.urlReading = this.fenetre.getUrlReading();
		this.titleListenning = this.fenetre.getTitleListenning();
		this.titleReading = this.fenetre.getTitleReading();
		
		if(this.fenetre.getTypeToeic().equals(TypeToeic.NEW.name())) {
			Toeic.type = TypeToeic.NEW;
		}
		else {
			Toeic.type = TypeToeic.OLD;
		}
		
		this.fenetre.creationFeuilleReponse();
		this.fenetre.recupererReponse();
	}
	
	public Listenning getListenning() {
		return listenning;
	}
	
	public String getTitleListenning() {
		return titleListenning;
	}
	
	public Fenetre getFenetre() {
		return fenetre;
	}
	
	public String getTitleReading() {
		return titleReading;
	}
	
	public String getUrlListenning() {
		return urlListenning;
	}
	
	public static TypeToeic getType() {
		return type;
	}
	
	public String getUrlReading() {
		return urlReading;
	}
	
	public Reading getReading() {
		return reading;
	}
	
	public int getNumToeic() {
		return numToeic;
	}
	
	public long getDate() {
		return date;
	}
	
	public void setListenning(Listenning listenning) {
		this.listenning = listenning;
	}
	
	public void setReading(Reading reading) {
		this.reading = reading;
	}
	
	public void setNumToeic(int numToeic) {
		this.numToeic = numToeic;
	}
	
	public void setDate(long date) {
		this.date = date;
	}
	
	public void setFenetre(Fenetre fenetre) {
		this.fenetre = fenetre;
	}
	
	public void setTitleListenning(String titleListenning) {
		this.titleListenning = titleListenning;
	}
	
	public void setTitleReading(String titleReading) {
		this.titleReading = titleReading;
	}
	
	public static void setType(TypeToeic type) {
		Toeic.type = type;
	}
	
	public void setUrlListenning(String urlListenning) {
		this.urlListenning = urlListenning;
	}
	
	public void setUrlReading(String urlReading) {
		this.urlReading = urlReading;
	}
}