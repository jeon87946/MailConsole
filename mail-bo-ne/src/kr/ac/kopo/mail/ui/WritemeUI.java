package kr.ac.kopo.mail.ui;

import java.util.List;

import kr.ac.kopo.mail.vo.MailVO;

public class WritemeUI extends BaseUI {
//���� �� ������

	@Override
	public void execute() throws Exception {
		
		List<MailVO> list = Maservice.Writeme(LoginGoUI.loginVO); 	
		
		System.out.println("���� �� ������");
		System.out.println("--------------------------------------");
		System.out.println(" ����\t���� ");
		if(list.isEmpty()) {
			System.out.println(" ������ �����ϴ� ");
		} else {
			for(MailVO mail : list) {
				System.out.println(mail.getTitle() + "\t" + mail.getMsg());
				}
			}
	}
}
