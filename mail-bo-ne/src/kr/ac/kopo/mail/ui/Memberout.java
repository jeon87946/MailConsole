package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class Memberout extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ȸ\t��\tŻ\t�� ");
		String id;

		while(true) {
		id = scanStr(" ���̵� �Է��ϼ��� ");
		
		if( id != null && id.equals(LoginGoUI.loginVO.getId())) {
			System.out.println(" <<<<<<<<<<<<<<<<<<<ȸ��Ż�� �Ϸ�>>>>>>>>>>>>>>>>>>> ");
			
			EmailUI ui = new EmailUI();
			ui.execute();
			break;
		} else {
			System.out.println(" �ٽ� �Է��ϼ��� ");
		}
		}
//		Meservice.memberout(id);
	}
}
