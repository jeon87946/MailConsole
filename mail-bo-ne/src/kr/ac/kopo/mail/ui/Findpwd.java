package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class Findpwd extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" 비밀번호 찾기 ");
		String id = scanStr(" 아이디를 입력하세요 ");
		String name = scanStr(" 이름을 입력하세요 ");
		String callno = scanStr(" 전화번호를 입력하세요 ");
		
		MemberVO member = Meservice.findpwd(id, name, callno);
		
		LoginGoUI.loginVO = member;
		
		if( member != null) {
			System.out.println(" 비밀번호는 : " + member.getPwd() + " 입니다 ");
		} else {
			System.out.println(" 다시 입력하세요 ");
		}
	}

}
