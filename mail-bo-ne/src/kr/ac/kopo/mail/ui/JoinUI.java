package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class JoinUI extends BaseUI{

	@Override
	public void execute() throws Exception {

		System.out.println(" <<<<<<<<<<<<회원가입 서비스>>>>>>>>>>>> ");
		String id;
		
		while(true) {
			id = scanStr(" 아이디를 입력하세요 : ");
			String yid = Meservice.searchid(id);
			if(yid != null) {
				System.out.println("존재하는 아이디입니다");
			} else {
				System.out.println("존재하지 않는 아이디입니다");
				break;
			}	
			}
		String callno = scanStr(" 전화번호를 입력하세요 : ");
		String name = scanStr(" 이름을 입력하세요 : ");
		String pwd = scanStr(" 비밀번호를 입력하세요 : " );
			
		MemberVO member = new MemberVO(id, pwd, name, callno);
		Meservice.addMember(member);
		
		System.out.println(" <<<<<<<<<<<<회원가입 완료!!>>>>>>>>>>>>>");
//		list로 받아서 실험하기
	}

}
