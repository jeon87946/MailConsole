package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class LogoutUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		MemberVO loginVO = null;
//		System.out.println(" 로그아웃 ");
		
		if(loginVO == null) {
			System.out.println(" 로그아웃 되었습니다 ");
			EmailUI ui = new EmailUI();
			ui.execute();
		}
	}
}