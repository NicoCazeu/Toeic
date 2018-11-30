package com.softcaze.toeic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.softcaze.toeic.constance.AppConstants;
import com.softcaze.toeic.model.Part1;
import com.softcaze.toeic.model.Part2;
import com.softcaze.toeic.model.Part3;
import com.softcaze.toeic.model.Part4;
import com.softcaze.toeic.model.Part5;
import com.softcaze.toeic.model.Part6;
import com.softcaze.toeic.model.Part7;
import com.softcaze.toeic.model.TypeElement;
import com.softcaze.toeic.model.TypeReponse;
import com.softcaze.toeic.view.QuestionLine;

public class Fenetre extends JFrame{
	private List<QuestionLine> listQuestion;
	private JButton button;
	private JLabel scoreListenning;
	private JLabel scoreReading;
	private JLabel scorePart1;
	private JLabel scorePart2;
	private JLabel scorePart3;
	private JLabel scorePart4;
	private JLabel scorePart5;
	private JLabel scorePart6;
	private JLabel scorePart7;
	
	private Part1 part1 = new Part1();
	private Part2 part2 = new Part2();
	private Part3 part3 = new Part3();
	private Part4 part4 = new Part4();
	private Part5 part5 = new Part5();
	private Part6 part6 = new Part6();
	private Part7 part7 = new Part7();
	
	public Fenetre(int width, int height) {
		super();
		
		setSize(width, height);
		setVisible(true);
		setTitle("Toeic");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		initialiser();
		
		this.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rafraichirScore();
			}
		});
	}
	
	public List<QuestionLine> getListQuestion() {
		return listQuestion;
	}
	
	public void setListQuestion(List<QuestionLine> listQuestion) {
		this.listQuestion = listQuestion;
	}
	
	public void creationFeuilleReponse() {
		int column = 0;
		
		for(int i = 1; i <= AppConstants.nbrQuestionToeic; i++) {	
			QuestionLine q = new QuestionLine(i, column);
			
			if(i%25 == 0) {
				column++;
			}
			
			q.afficher(this, getNombreReponse(i));
			
			this.listQuestion.add(q);
		}
	}
	
	public int getNombreReponse(int num) {
		
		
		if(num >= part1.getBegin() && num <= part1.getEnd()) {
			return part1.nbrChoixReponse();
		}
		else if(num >= part2.getBegin() && num <= part2.getEnd()) {
			return part2.nbrChoixReponse();
		}
		else if(num >= part3.getBegin() && num <= part3.getEnd()) {
			return part3.nbrChoixReponse();	
		}
		else if(num >= part4.getBegin() && num <= part4.getEnd()) {
			return part4.nbrChoixReponse();
		}
		else if(num >= part5.getBegin() && num <= part5.getEnd()) {
			return part5.nbrChoixReponse();
		}
		else if(num >= part6.getBegin() && num <= part6.getEnd()) {
			return part6.nbrChoixReponse();
		}
		else if(num >= part7.getBegin() && num <= part7.getEnd()) {
			return part7.nbrChoixReponse();
		}		
		
		return 0;
	}
	
	public void initialiser() {
		listQuestion = new ArrayList<>();
		scoreListenning = new JLabel();
		scoreReading = new JLabel();
		scorePart1 = new JLabel();
		scorePart2 = new JLabel();
		scorePart3 = new JLabel();
		scorePart4 = new JLabel();
		scorePart5 = new JLabel();
		scorePart6 = new JLabel();
		scorePart7 = new JLabel();
		
		button = new JButton("Valider");
		
		scoreListenning.setText("Listenning :  / " + AppConstants.nbrQuestionSection);
		scoreReading.setText("Reading :  / " + AppConstants.nbrQuestionSection);
		scorePart1.setText("Part 1 :  / " + part1.nbrQuestion());
		scorePart2.setText("Part 2 :  / " + part2.nbrQuestion());
		scorePart3.setText("Part 3 :  / " + part3.nbrQuestion());
		scorePart4.setText("Part 4 :  / " + part4.nbrQuestion());
		scorePart5.setText("Part 5 :  / " + part5.nbrQuestion());
		scorePart6.setText("Part 6 :  / " + part6.nbrQuestion());
		scorePart7.setText("Part 7 :  / " + part7.nbrQuestion());
		
		button.setBounds(10, 600, 80, 20);
		
		scoreListenning.setBounds(150, 550, 120, 20);
		scoreReading.setBounds(150, 580, 120, 20);
		scorePart1.setBounds(300, 550, 80, 20);
		scorePart2.setBounds(300, 580, 80, 20);
		scorePart3.setBounds(300, 610, 80, 20);
		scorePart4.setBounds(300, 640, 80, 20);
		scorePart5.setBounds(450, 550, 80, 20);
		scorePart6.setBounds(450, 580, 80, 20);
		scorePart7.setBounds(450, 610, 80, 20);
		
		add(button);
		add(scoreListenning);
		add(scoreReading);
		add(scorePart1);
		add(scorePart2);
		add(scorePart3);
		add(scorePart4);
		add(scorePart5);
		add(scorePart6);
		add(scorePart7);
	}
	
	public int getListenningScore() {
		int score = 0;
		
		for(int i = 0; i < AppConstants.nbrQuestionSection; i++) {
			if(listQuestion.get(i).isCorrect()) {
				score++;
			}
		}
		
		return score;
	}
	
	public int getReadingScore() {
		int score = 0;
		
		for(int i = AppConstants.nbrQuestionSection; i < AppConstants.nbrQuestionToeic; i++) {
			if(listQuestion.get(i).isCorrect()) {
				score++;
			}
		}
		
		return score;
	}
	
	public int getPartScore(int begin, int end) {
		int score = 0;
		
		if(begin > 0) {
			begin = begin -1;
		}
		
		for(int i = begin; i < end; i++) {
			if(listQuestion.get(i).isCorrect()) {
				score++;
			}
		}
		
		return score;
	}
	
	public void rafraichirScore() {
		scoreListenning.setText("Listenning :  " + getListenningScore() + " / " + AppConstants.nbrQuestionSection);
		scoreReading.setText("Reading :  " + getReadingScore() + " / " + AppConstants.nbrQuestionSection);
		scorePart1.setText("Part 1 :  " + getPartScore(part1.getBegin(), part1.getEnd())+ " / " + part1.nbrQuestion());
		scorePart2.setText("Part 2 :  " + getPartScore(part2.getBegin(), part2.getEnd())+ " / " + part2.nbrQuestion());
		scorePart3.setText("Part 3 :  " + getPartScore(part3.getBegin(), part3.getEnd())+ " / " + part3.nbrQuestion());
		scorePart4.setText("Part 4 :  " + getPartScore(part4.getBegin(), part4.getEnd())+ " / " + part4.nbrQuestion());
		scorePart5.setText("Part 5 :  " + getPartScore(part5.getBegin(), part5.getEnd())+ " / " + part5.nbrQuestion());
		scorePart6.setText("Part 6 :  " + getPartScore(part6.getBegin(), part6.getEnd())+ " / " + part6.nbrQuestion());
		scorePart7.setText("Part 7 :  " + getPartScore(part7.getBegin(), part7.getEnd())+ " / " + part7.nbrQuestion());
	}
	
	public File getFile() {
		File file = new File("C:\\Users\\Nicolas\\eclipse-workspace\\Toeic\\toeic\\toeic.txt");
		return file;
	}
	
	public String getLine(int numLine, TypeElement element) throws IOException {
		String result = "";
		String line = "";
		int lnum = 0;
		BufferedReader bufReader = new BufferedReader(new FileReader(getFile()));
		LineNumberReader lnr = new LineNumberReader(bufReader);
		
		while((line = lnr.readLine()) != null && (lnum = lnr.getLineNumber()) < numLine) {
			
		}
		
		if(lnum == numLine) {
			result = line.split(";")[element.getPosition()];
		}
		else {
			System.out.println("Le fichier a seulement " + lnum + " ligne");
		}
		
		return result;
	}
	
	public String getTypeToeic() throws IOException {
		return getLine(1, TypeElement.Type);
	}
	
	public String getTitleListenning() throws IOException {
		return getLine(2, TypeElement.Titre);
	}
	
	public String getTitleReading() throws IOException {
		return getLine(3, TypeElement.Titre);
	}
	
	public String getUrlListenning() throws IOException {
		return getLine(2, TypeElement.Url);
	}
	
	public String getUrlReading() throws IOException {
		return getLine(3, TypeElement.Url);
	}
	
	public void recupererReponse() throws IOException {
		String reponse = "";
		
		String line = "";
		int lnum = 0;
		BufferedReader bufReader = new BufferedReader(new FileReader(getFile()));
		LineNumberReader lnr = new LineNumberReader(bufReader);
		
		while((line = lnr.readLine()) != null) {
			if(lnr.getLineNumber() != 1 && lnr.getLineNumber() != 2 && lnr.getLineNumber() != 3) {
				listQuestion.get(lnr.getLineNumber() - 4).getQuestion().setCorrectReponse(getTypeReponse(line.split(";")[1]));
			}	
		}
		
		for(int i = 0; i < AppConstants.nbrQuestionToeic; i++) {
			System.out.println("REsponse user : " + listQuestion.get(i).getQuestion().getUserReponse() + " Correct : " + listQuestion.get(i).getQuestion().getCorrectReponse());
			
		}
	}
	
	public TypeReponse getTypeReponse(String name) {
		TypeReponse type = TypeReponse.VIDE;
		
		if(TypeReponse.A.name().equals(name)) {
			type = TypeReponse.A;
		}
		else if(TypeReponse.B.name().equals(name)) {
			type = TypeReponse.B;
		}
		else if(TypeReponse.C.name().equals(name)) {
			type = TypeReponse.C;
		}
		else if(TypeReponse.D.name().equals(name)) {
			type = TypeReponse.D;
		}
		
		return type;
	}
}
