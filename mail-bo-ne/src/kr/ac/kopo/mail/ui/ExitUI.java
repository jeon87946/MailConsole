package kr.ac.kopo.mail.ui;

public class ExitUI extends BaseUI implements ImailUI {

	@Override
	public void execute() throws Exception {

		System.out.println(" 프로그램 종료 ");
		System.exit(0);
	}

}
