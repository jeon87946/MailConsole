package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class Memberout extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("회\t원\t탈\t퇴 ");
		String id;

		while(true) {
		id = scanStr(" 아이디를 입력하세요 ");
		
		if( id != null && id.equals(LoginGoUI.loginVO.getId())) {
			System.out.println(" <<<<<<<<<<<<<<<<<<<회원탈퇴 완료>>>>>>>>>>>>>>>>>>> ");
			
			EmailUI ui = new EmailUI();
			ui.execute();
			break;
		} else {
			System.out.println(" 다시 입력하세요 ");
		}
		}
//		Meservice.memberout(id);
	}
}
