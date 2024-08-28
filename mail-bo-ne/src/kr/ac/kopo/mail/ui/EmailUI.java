package kr.ac.kopo.mail.ui;

public class EmailUI extends BaseUI {

	private int choiceMenu() {
		System.out.println("----------------------------------------Main MENU----------------------------------------");
		System.out.println(" 1. �α��� ");
		System.out.println(" 2. ȸ������ ");
		System.out.println(" 3. ID ã��");
		System.out.println(" 4. ��й�ȣ ã��");
		System.out.println(" 5. ���� ");
		int type = ScanInt(" ��ȣ�� �Է��ϼ��� ");
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
			System.out.println(" �߸������ϼ̽��ϴ� ");
			}
		}
	}
}
