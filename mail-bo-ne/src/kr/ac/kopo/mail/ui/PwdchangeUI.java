package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;
//��ȭ��ȣ �ٲٱ�
public class PwdchangeUI extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" ��й�ȣ ���� ");
		
		String id = scanStr(" ���̵� �Է��ϼ���");
		String pwd = scanStr(" ������ ��й�ȣ�� �Է��ϼ���");
		
		Meservice.pchange(id, pwd);
		
	
		if(id == null) {
			System.out.println(" �߸��Է��Ͽ����ϴ�");
		} else {
			System.out.println(" ���� �Ϸ�Ǿ����ϴ� ");
			System.out.println(" �ٽ� �α����ϼ��� ");
			System.out.println();
			
			LoginUI ui = new LoginUI();
			ui.execute();
		
	}
	}

}
