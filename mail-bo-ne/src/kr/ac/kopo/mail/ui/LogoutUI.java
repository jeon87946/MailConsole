package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class LogoutUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		MemberVO loginVO = null;
//		System.out.println(" �α׾ƿ� ");
		
		if(loginVO == null) {
			System.out.println(" �α׾ƿ� �Ǿ����ϴ� ");
			EmailUI ui = new EmailUI();
			ui.execute();
		}
	}
}