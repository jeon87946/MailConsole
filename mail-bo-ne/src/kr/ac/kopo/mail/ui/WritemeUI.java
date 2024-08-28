package kr.ac.kopo.mail.ui;

import java.util.List;

import kr.ac.kopo.mail.vo.MailVO;

public class WritemeUI extends BaseUI {
//내게 쓴 메일함

	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = Maservice.Writeme(LoginGoUI.loginVO); 	
		
		System.out.println("내게 쓴 메일함");
		System.out.println("--------------------------------------");
		System.out.println(" 제목\t내용 ");
		if(list.isEmpty()) {
			System.out.println(" 메일이 없습니다 ");
		} else {
			for(MailVO mail : list) {
				System.out.println(mail.getTitle() + "\t" + mail.getMsg());
				}
			}
	}
}
