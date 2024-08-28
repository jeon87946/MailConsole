package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class Findpwd extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" ��й�ȣ ã�� ");
		String id = scanStr(" ���̵� �Է��ϼ��� ");
		String name = scanStr(" �̸��� �Է��ϼ��� ");
		String callno = scanStr(" ��ȭ��ȣ�� �Է��ϼ��� ");
		
		MemberVO member = Meservice.findpwd(id, name, callno);
		
		LoginGoUI.loginVO = member;
		
		if( member != null) {
			System.out.println(" ��й�ȣ�� : " + member.getPwd() + " �Դϴ� ");
		} else {
			System.out.println(" �ٽ� �Է��ϼ��� ");
		}
	}

}
