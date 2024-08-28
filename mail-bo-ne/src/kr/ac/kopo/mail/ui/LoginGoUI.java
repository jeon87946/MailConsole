package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class LoginGoUI  extends BaseUI{
	
//	public static MemberVO loginVO;
	public static MemberVO loginVO = null;
	
	private int choiceMenu() {
		System.out.println(" ----------------------------------------MENU----------------------------------------" );
		System.out.println(" 1. 메일쓰기 ");
		System.out.println(" 2. 받은 메일함 ");
		System.out.println(" 3. 보낸 메일함 ");
		System.out.println(" 4. 내게 쓴 메일함 ");
		System.out.println(" 5. 회원정보 수정 ");
		System.out.println(" 6. 회원탈퇴 ");
		System.out.println(" 7. 로그아웃 ");
		int type = ScanInt (" 항목을 선택하세요 ");
		return type;
	}

	@Override
	public void execute() throws Exception {

		while(true) {
			ImailUI ui = null;
			int type = choiceMenu();
		switch(type) {
		case 1 :
			ui = new WriterMailUI(); 
			break;
		case 2 :
			ui = new InboxUI();
			break;
		case 3 : 
			ui = new OutboxUI();
			break;
		case 4 : 
			ui = new WritemeUI();
			break;
		case 5 : 
			ui = new UpdateUI();
			break;
		case 6 : 
			ui = new Memberout();
			break;
		case 7 : 
			ui = new LogoutUI();
			break;
			
			}
		
		if (ui != null) {
			ui.execute();
		}else {
			System.out.println(" 다시 선택하세요 ");
			}
		}
	}
}