package com.softcaze.toeic.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.softcaze.toeic.model.Question;
import com.softcaze.toeic.model.TypeReponse;

public class QuestionLine {
	private JCheckBox cbA;
	private JCheckBox cbB;
	private JCheckBox cbC;
	private JCheckBox cbD;
	private Question question;
	private JLabel num;
	
	public QuestionLine(int num, int col) {
		question = new Question();
		this.cbA = new JCheckBox();
		this.cbB = new JCheckBox();
		this.cbC = new JCheckBox();
		this.cbD = new JCheckBox();
		this.num = new JLabel();
		this.num.setText(String.valueOf(num));
		
		if(col > 0) {
			num = num - (col*25);
		}
								
		this.num.setBounds((5 + (135*col)) + 5, (20 * num) + 5, 30, 25);
		this.cbA.setBounds((30 + (135*col)) + 5, (20 * num) + 5, 20, 25);
		this.cbB.setBounds((55 + (135*col)) + 5, (20 * num) + 5, 20, 25);
		this.cbC.setBounds((80 + (135*col)) + 5, (20 * num) + 5, 20, 25);
		this.cbD.setBounds((105 + (135*col)) + 5, (20 * num) + 5, 20, 25);
		
	}
	
	public JLabel getNum() {
		return num;
	}
	
	public JCheckBox getCbA() {
		return cbA;
	}
	
	public JCheckBox getCbB() {
		return cbB;
	}
	
	public JCheckBox getCbC() {
		return cbC;
	}
	
	public JCheckBox getCbD() {
		return cbD;
	}
	
	public Question getQuestion() {
		return question;
	}
	
	public void setCbA(JCheckBox cbA) {
		this.cbA = cbA;
	}
	
	public void setCbB(JCheckBox cbB) {
		this.cbB = cbB;
	}
	
	public void setCbC(JCheckBox cbC) {
		this.cbC = cbC;
	}
	
	public void setCbD(JCheckBox cbD) {
		this.cbD = cbD;
	}
	
	public void setNum(JLabel num) {
		this.num = num;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public void afficher(JFrame jf, int nbrReponse) {
		jf.add(this.num);
		jf.add(this.cbA);
		jf.add(this.cbB);
		jf.add(this.cbC);
		
		this.cbA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(cbA.isSelected()) {
					question.setUserReponse(TypeReponse.A);
				}
				else {
					question.setUserReponse(TypeReponse.VIDE);
				}
				
			}
		});
		
		this.cbB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cbB.isSelected()) {
					question.setUserReponse(TypeReponse.B);
				}
				else {
					question.setUserReponse(TypeReponse.VIDE);
				}
			}
		});
		
		this.cbC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cbC.isSelected()) {
					question.setUserReponse(TypeReponse.C);
				}
				else {
					question.setUserReponse(TypeReponse.VIDE);
				}
			}
		});
		
		if(nbrReponse == 4) {
			jf.add(this.cbD);
			
			this.cbD.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {				
					if(cbD.isSelected()) {
						question.setUserReponse(TypeReponse.D);
					}
					else {
						question.setUserReponse(TypeReponse.VIDE);
					}
				}
			});
		}
	}
	
	public boolean isCorrect() {
		if(question.getUserReponse() == question.getCorrectReponse()) {
			return true;
		}
		
		return false;
	}
}
