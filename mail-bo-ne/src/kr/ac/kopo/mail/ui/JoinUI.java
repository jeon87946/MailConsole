package kr.ac.kopo.mail.ui;

import kr.ac.kopo.mail.vo.MemberVO;

public class JoinUI extends BaseUI{

	@Override
	public void execute() throws Exception {

		System.out.println(" <<<<<<<<<<<<ȸ������ ����>>>>>>>>>>>> ");
		String id;
		
		while(true) {
			id = scanStr(" ���̵� �Է��ϼ��� : ");
			String yid = Meservice.searchid(id);
			if(yid != null) {
				System.out.println("�����ϴ� ���̵��Դϴ�");
			} else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�");
				break;
			}	
			}
		String callno = scanStr(" ��ȭ��ȣ�� �Է��ϼ��� : ");
		String name = scanStr(" �̸��� �Է��ϼ��� : ");
		String pwd = scanStr(" ��й�ȣ�� �Է��ϼ��� : " );
			
		MemberVO member = new MemberVO(id, pwd, name, callno);
		Meservice.addMember(member);
		
		System.out.println(" <<<<<<<<<<<<ȸ������ �Ϸ�!!>>>>>>>>>>>>>");
//		list�� �޾Ƽ� �����ϱ�
	}

}
