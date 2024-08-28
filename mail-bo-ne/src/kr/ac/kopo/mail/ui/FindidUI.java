package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.service.MemberService;
import kr.ac.kopo.mail.vo.MemberVO;

public class FindidUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" ���̵� ã�� ");
		String name = scanStr(" �̸��� �Է��ϼ��� ");
		String callno = scanStr(" ��ȭ��ȣ�� �Է��ϼ��� ");
		
		MemberVO member = Meservice.findid(name, callno);
	
		LoginGoUI.loginVO = member;
		
		if( member != null) {
			System.out.println(" ���̵�� : " + member.getId() + " �Դϴ� ");
		} else {
			System.out.println(" �ٽ� �Է��ϼ��� ");
		}
		
	}

}
