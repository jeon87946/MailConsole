package kr.ac.kopo.mail.ui;

import java.util.Scanner;

import kr.ac.kopo.mail.service.MaServiceFactory;
import kr.ac.kopo.mail.service.MailService;
import kr.ac.kopo.mail.service.MeServiceFactory;
import kr.ac.kopo.mail.service.MemberService;

public abstract class BaseUI implements ImailUI {

	private Scanner sc;
	protected MailService Maservice;
	protected MemberService Meservice;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		Meservice = MeServiceFactory.getInstance();
		Maservice = MaServiceFactory.getInstance();
	}
	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	protected int ScanInt(String msg) {
//		System.out.println(msg);
//		return Integer.parseInt(sc.nextLine());
		return Integer.parseInt(scanStr(msg));
	}
}
