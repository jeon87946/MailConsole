package kr.ac.kopo.mail.ui;

public class UpdateUI extends BaseUI {


		private int choiceMenu() {
			System.out.println(" ----------------------------------------회원정보 변경 서비스---------------------------------------- ");
			System.out.println(" 1. 비밀번호 바꾸기 ");
			System.out.println(" 2. 전화번호 바꾸기 ");
			
			int type = ScanInt("번호를 입력하세요");
			return type;
		
		}
		@Override
		public void execute() throws Exception {
	
		while(true) {
		ImailUI ui = null;
		int type = choiceMenu();
		switch(type) {
		case 1 :
			ui = new PwdchangeUI();
			break;
		case 2 :
			ui = new idchangeUI();
			break;
			}
		
		if(ui != null) {
			ui.execute();
		} else {
			System.out.println(" 다시 입력하세요 ");
			}
		}		
	}
}
