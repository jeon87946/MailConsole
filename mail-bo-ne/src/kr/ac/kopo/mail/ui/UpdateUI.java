package kr.ac.kopo.mail.ui;

public class UpdateUI extends BaseUI {


		private int choiceMenu() {
			System.out.println(" ----------------------------------------ȸ������ ���� ����---------------------------------------- ");
			System.out.println(" 1. ��й�ȣ �ٲٱ� ");
			System.out.println(" 2. ��ȭ��ȣ �ٲٱ� ");
			
			int type = ScanInt("��ȣ�� �Է��ϼ���");
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
			System.out.println(" �ٽ� �Է��ϼ��� ");
			}
		}		
	}
}
