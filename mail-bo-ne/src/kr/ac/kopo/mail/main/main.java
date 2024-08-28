package kr.ac.kopo.mail.main;

import kr.ac.kopo.mail.ui.EmailUI;

public class main {

	public static void main(String[] args) {

		EmailUI ui = new EmailUI();
				
				
		try {
			ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
