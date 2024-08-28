package kr.ac.kopo.mail.ui;

import java.util.List;

import kr.ac.kopo.mail.vo.MailVO;
import kr.ac.kopo.mail.vo.MemberVO;

public class InboxUI extends BaseUI {

	@Override
	public void execute() throws Exception {

	List<MailVO> list = Maservice.Inbox(LoginGoUI.loginVO); 	
	
	System.out.println("----------------------------------------받은 메일함----------------------------------------");
	System.out.println("-------------------------------------------------------------------------------------------");
	System.out.println(" 제목\t작성자\t\t내용 ");
	if(list.isEmpty()) {
		System.out.println("받은 메일이 없습니다");
	} else {
		for(MailVO mail : list) {
			System.out.println(mail.getTitle() + "\t" + mail.getWriter() + "\t" + mail.getMsg());
			}
		}
	}

	
	
}
