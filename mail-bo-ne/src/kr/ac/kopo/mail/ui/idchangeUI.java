package kr.ac.kopo.mail.ui;

public class idchangeUI extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println(" ----------------------------------------전화번호 변경---------------------------------------- ");
		
		String id = scanStr(" 아이디를 입력하세요");
		String callno = scanStr(" 변경할 전화번호를 입력하세요");
		
		Meservice.ichange(id, callno);
		
		if(id == null) {
			System.out.println(" 잘못입력하였습니다");
		} else {
			System.out.println(" 전화번호 변경 완료 ");
			System.out.println(" 다시 로그인하세요 ");
			System.out.println();
			
			LoginUI ui = new LoginUI();
			ui.execute();
		
		}
	}

}
