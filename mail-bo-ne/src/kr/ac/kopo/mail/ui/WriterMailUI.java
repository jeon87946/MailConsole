package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MailVO;

public class WriterMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" ----------------------------------------[ 이메일 쓰기 ]---------------------------------------- ");
		String title = scanStr(" 제목을 입력하세요 ");
		String writer = LoginGoUI.loginVO.getId();
		String dear = scanStr(" 받는 사람을 입력하세요 ");
		String msg = scanStr(" 내용을 입력하세요 ");
		
		MailVO mail = new MailVO();
		mail.setTitle(title);
		mail.setWrite(writer);
		mail.setDear(dear);
		mail.setMsg(msg);
		Maservice.addMail(mail);
		
		System.out.println(" ----------------------------------------메일 쓰기 완료---------------------------------------- ");
		
	}

}
