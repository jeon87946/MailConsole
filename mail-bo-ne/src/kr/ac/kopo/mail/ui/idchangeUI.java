package kr.ac.kopo.mail.ui;

public class idchangeUI extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println(" ----------------------------------------��ȭ��ȣ ����---------------------------------------- ");
		
		String id = scanStr(" ���̵� �Է��ϼ���");
		String callno = scanStr(" ������ ��ȭ��ȣ�� �Է��ϼ���");
		
		Meservice.ichange(id, callno);
		
		if(id == null) {
			System.out.println(" �߸��Է��Ͽ����ϴ�");
		} else {
			System.out.println(" ��ȭ��ȣ ���� �Ϸ� ");
			System.out.println(" �ٽ� �α����ϼ��� ");
			System.out.println();
			
			LoginUI ui = new LoginUI();
			ui.execute();
		
		}
	}

}
