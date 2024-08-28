package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;
//전화번호 바꾸기
public class PwdchangeUI extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" 비밀번호 변경 ");
		
		String id = scanStr(" 아이디를 입력하세요");
		String pwd = scanStr(" 변경할 비밀번호를 입력하세요");
		
		Meservice.pchange(id, pwd);
		
	
		if(id == null) {
			System.out.println(" 잘못입력하였습니다");
		} else {
			System.out.println(" 변경 완료되었습니다 ");
			System.out.println(" 다시 로그인하세요 ");
			System.out.println();
			
			LoginUI ui = new LoginUI();
			ui.execute();
		
	}
	}

}
