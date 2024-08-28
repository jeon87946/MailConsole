package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.service.MemberService;
import kr.ac.kopo.mail.vo.MemberVO;

public class FindidUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" 아이디 찾기 ");
		String name = scanStr(" 이름을 입력하세요 ");
		String callno = scanStr(" 전화번호를 입력하세요 ");
		
		MemberVO member = Meservice.findid(name, callno);
	
		LoginGoUI.loginVO = member;
		
		if( member != null) {
			System.out.println(" 아이디는 : " + member.getId() + " 입니다 ");
		} else {
			System.out.println(" 다시 입력하세요 ");
		}
		
	}

}
