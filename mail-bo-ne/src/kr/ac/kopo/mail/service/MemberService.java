package kr.ac.kopo.mail.service;

import java.util.List;

import kr.ac.kopo.mail.dao.MemberDAO;
import kr.ac.kopo.mail.vo.MemberVO;

public class MemberService {
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
//	회원가입
	public void addMember(MemberVO member) {
		dao.insert(member);
	}
	
//	로그인
	public MemberVO login(String id, String pwd) {
		MemberVO member = dao.search(id, pwd);
		return member;
	}
// 아이디 찾기
	public MemberVO findid(String name, String callno) {
		MemberVO member = dao.findid(name, callno);
		return member;
	}
	
// 비밀번호 찾기
	public MemberVO findpwd(String id, String name, String callno) {
		MemberVO member = dao.findpwd(id, name, callno);
		return member;
	}
	
// 비밀번호 변경
	public void pchange(String id, String pwd) {
		dao.pchange(id, pwd);
	}
	
//	전화번호 변경
	public void ichange(String id, String callno) {
		dao.ichange(id, callno);
	}
	
// 아이디 중복
	public String searchid(String id) {
		String yid = dao.searchid(id);
		return yid;
	}

//	회원 탈퇴
	public MemberVO memberout(String id) {
		MemberVO member = dao.memberout(id);
		return member;
	}
	
}
