package kr.ac.kopo.mail.ui;

import java.util.List;

import kr.ac.kopo.mail.vo.MailVO;
import kr.ac.kopo.mail.vo.MemberVO;

public class InboxUI extends BaseUI {

	@Override
	public void execute() throws Exception {

	List<MailVO> list = Maservice.Inbox(LoginGoUI.loginVO); 	
	
	System.out.println("----------------------------------------���� ������----------------------------------------");
	System.out.println("-------------------------------------------------------------------------------------------");
	System.out.println(" ����\t�ۼ���\t\t���� ");
	if(list.isEmpty()) {
		System.out.println("���� ������ �����ϴ�");
	} else {
		for(MailVO mail : list) {
			System.out.println(mail.getTitle() + "\t" + mail.getWriter() + "\t" + mail.getMsg());
			}
		}
	}

	
	
}
