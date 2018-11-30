package com.softcaze.toeic;

import java.io.IOException;
import java.util.Date;

import javax.swing.SwingUtilities;

import com.softcaze.toeic.model.Toeic;

public class AppToeic {	
	private static Toeic toeic;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					toeic = new Toeic(1, new Date().getTime());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	}
}
