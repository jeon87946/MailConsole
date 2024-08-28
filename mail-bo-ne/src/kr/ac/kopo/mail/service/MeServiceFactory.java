package kr.ac.kopo.mail.service;

public class MeServiceFactory {

	
	private static MemberService Meservice;
	
	public static MemberService getInstance() {
		if(Meservice == null) {
			Meservice = new MemberService();
		}
		return Meservice;
	}
}
