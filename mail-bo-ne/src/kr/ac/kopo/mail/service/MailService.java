package kr.ac.kopo.mail.service;

import java.util.List;

import kr.ac.kopo.mail.dao.MailDAO;
import kr.ac.kopo.mail.vo.MailVO;
import kr.ac.kopo.mail.vo.MemberVO;

public class MailService {
	private MailDAO dao;

	
	public MailService() {
		dao = new MailDAO();
		
	}
	//메일 쓰기
	public void addMail(MailVO mail) {
		
		dao.insert(mail);
	}
	
//	받은 메일함
	public List<MailVO> Inbox(MemberVO loginVO) {
		List<MailVO> list = dao.Inbox(loginVO);
		return list;
	}
	
//	보낸 메일함
	public List<MailVO> Outbox(MemberVO loginVO) {
		List<MailVO> list = dao.Outbox(loginVO);
		return list;
	}
//	내게 쓴 메일함
	public List<MailVO> Writeme(MemberVO loginVO) {
		List<MailVO> list = dao.writeme(loginVO);
		return list;
	}
//	로그아웃
}
