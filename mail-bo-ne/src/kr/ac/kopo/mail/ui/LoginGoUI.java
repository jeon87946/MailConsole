package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class LoginGoUI  extends BaseUI{
	
//	public static MemberVO loginVO;
	public static MemberVO loginVO = null;
	
	private int choiceMenu() {
		System.out.println(" ----------------------------------------MENU----------------------------------------" );
		System.out.println(" 1. ���Ͼ��� ");
		System.out.println(" 2. ���� ������ ");
		System.out.println(" 3. ���� ������ ");
		System.out.println(" 4. ���� �� ������ ");
		System.out.println(" 5. ȸ������ ���� ");
		System.out.println(" 6. ȸ��Ż�� ");
		System.out.println(" 7. �α׾ƿ� ");
		int type = ScanInt (" �׸��� �����ϼ��� ");
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
			System.out.println(" �ٽ� �����ϼ��� ");
			}
		}
	}
}