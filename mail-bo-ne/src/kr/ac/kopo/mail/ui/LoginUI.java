package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class LoginUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		String id = scanStr("아이디를 입력하세요");
		String pwd = scanStr("비밀번호를 입력하세요");
		
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPwd(pwd);
//		member = Meservice.login(id, pwd);
		
		MemberVO loginVO = Meservice.login(id, pwd);
		
		if(loginVO == null) {
			System.out.println("잘못입력하셨습니다");
		} else {
			LoginGoUI.loginVO = loginVO;
			System.out.println(" 환영합니다 [ " + loginVO.getName() + " ] ");
			LoginGoUI ui = new LoginGoUI();
			ui.execute();
		}		
		
	}
	
}