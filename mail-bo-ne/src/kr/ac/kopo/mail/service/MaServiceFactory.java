package kr.ac.kopo.mail.service;

public class MaServiceFactory {

	
	private static MailService maservice;
	
	public static MailService getInstance() {
	if(maservice == null) {
		maservice = new MailService();
		}
	return maservice;
	}
}
