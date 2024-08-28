package kr.ac.kopo.mail.service;

import java.util.List;

import kr.ac.kopo.mail.dao.MemberDAO;
import kr.ac.kopo.mail.vo.MemberVO;

public class MemberService {
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
//	ȸ������
	public void addMember(MemberVO member) {
		dao.insert(member);
	}
	
//	�α���
	public MemberVO login(String id, String pwd) {
		MemberVO member = dao.search(id, pwd);
		return member;
	}
// ���̵� ã��
	public MemberVO findid(String name, String callno) {
		MemberVO member = dao.findid(name, callno);
		return member;
	}
	
// ��й�ȣ ã��
	public MemberVO findpwd(String id, String name, String callno) {
		MemberVO member = dao.findpwd(id, name, callno);
		return member;
	}
	
// ��й�ȣ ����
	public void pchange(String id, String pwd) {
		dao.pchange(id, pwd);
	}
	
//	��ȭ��ȣ ����
	public void ichange(String id, String callno) {
		dao.ichange(id, callno);
	}
	
// ���̵� �ߺ�
	public String searchid(String id) {
		String yid = dao.searchid(id);
		return yid;
	}

//	ȸ�� Ż��
	public MemberVO memberout(String id) {
		MemberVO member = dao.memberout(id);
		return member;
	}
	
}
