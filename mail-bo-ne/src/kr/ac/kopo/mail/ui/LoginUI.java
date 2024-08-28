package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class LoginUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		String id = scanStr("���̵� �Է��ϼ���");
		String pwd = scanStr("��й�ȣ�� �Է��ϼ���");
		
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPwd(pwd);
//		member = Meservice.login(id, pwd);
		
		MemberVO loginVO = Meservice.login(id, pwd);
		
		if(loginVO == null) {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		} else {
			LoginGoUI.loginVO = loginVO;
			System.out.println(" ȯ���մϴ� [ " + loginVO.getName() + " ] ");
			LoginGoUI ui = new LoginGoUI();
			ui.execute();
		}		
		
	}
	
}