package kr.ac.kopo.mail.ui;

public class EmailUI extends BaseUI {

	private int choiceMenu() {
		System.out.println("----------------------------------------Main MENU----------------------------------------");
		System.out.println(" 1. 로그인 ");
		System.out.println(" 2. 회원가입 ");
		System.out.println(" 3. ID 찾기");
		System.out.println(" 4. 비밀번호 찾기");
		System.out.println(" 5. 종료 ");
		int type = ScanInt(" 번호를 입력하세요 ");
		return type;
	}
	
	@Override
	public void execute() throws Exception{
		
	
	while(true) {
		ImailUI ui = null;
		int type = choiceMenu();
		switch(type) {
			case 1 : 
				ui = new LoginUI();
				break;
			case 2 : 
				ui = new JoinUI();
				break;
			case 3 : 
				ui = new FindidUI ();
				break;
			case 4 : 
				ui = new Findpwd();
				break;
			case 5 : 
				ui = new ExitUI();
				break;
				
			}
		
		if(ui != null) {
			ui.execute();
		} else {
			System.out.println(" 잘못선택하셨습니다 ");
			}
		}
	}
}
