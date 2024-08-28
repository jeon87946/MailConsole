package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MailVO;

public class WriterMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" ----------------------------------------[ �̸��� ���� ]---------------------------------------- ");
		String title = scanStr(" ������ �Է��ϼ��� ");
		String writer = LoginGoUI.loginVO.getId();
		String dear = scanStr(" �޴� ����� �Է��ϼ��� ");
		String msg = scanStr(" ������ �Է��ϼ��� ");
		
		MailVO mail = new MailVO();
		mail.setTitle(title);
		mail.setWrite(writer);
		mail.setDear(dear);
		mail.setMsg(msg);
		Maservice.addMail(mail);
		
		System.out.println(" ----------------------------------------���� ���� �Ϸ�---------------------------------------- ");
		
	}

}
