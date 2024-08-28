package kr.ac.kopo.mail.ui;

import java.util.List;

import kr.ac.kopo.mail.vo.MailVO;

public class OutboxUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = Maservice.Outbox(LoginGoUI.loginVO); 	
		
		System.out.println("----------------------------------------보낸 메일함----------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(" 제목\t받는사람\t내용 ");
		if(list.isEmpty()) {
			System.out.println("보낸 메일이 없습니다");
		} else {
			for(MailVO mail : list) {
				System.out.println(mail.getTitle() + "\t" + mail.getDear() + "\t" + mail.getMsg());
				}
			}
	}

	
}
