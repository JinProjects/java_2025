package com.company.airplane.controller;

import java.util.Scanner;

import com.company.airplane.dto.Member;

public class KoreaAir implements BaseController, MemberController,AirPlaneController{
	
	public KoreaAir() {
		System.out.println("=============🛬🛬Korea Air🛬🛬=============");
	}

//--------------BaseController--------------------------------
	@Override
	public void menu() {
		System.out.println("1. 로그인/t2. 회원가입/t3. 회원탈퇴/t4. 종료");
		System.out.println("=============🛬🛬Korea Air🛬🛬=============");
	}
	
///-------------MemberController------------------------------
	@Override
	public void login() {
		
	}

	@Override
	public void newAccount() {
		ArrayList 
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("* 회원가입 *");
		//아이디 중복체크
		System.out.println("● 아이디 입력 : ");
		member.setId(sc.next());
		//비밀번호 확인 체크
		System.out.println("● 비밀번호 입력 : ");
		member.setPw(sc.next());
		System.out.println("● 비밀번호 확인 입력 : ");
		
		System.out.println("● 이름 입력 : ");
		member.setName(sc.next());
		System.out.println("● 영문이름 입력 : ");
		member.setEngName(sc.next());
		System.out.println("● 생년월일 입력(8자리 / YYYYMMDD : ");
		member.setBirth(sc.next());
		System.out.println("● 성별 입력 (1.남자\t2.여자 : ");
		member.setGender(sc.nextInt());
		//이메일 형식 체크
		System.out.println("● e-mail 입력 : ");
		member.setEmail(sc.next());
		System.out.println("● 휴대전화 번호 입력(숫자만 입력하세요) : ");
		member.setHp(sc.next())
		//여권번호 형식 체크
		System.out.println("● 여권번호 입력(알파벳 M + 숫자 8자리) : ");
		member.setPassPortNum(sc.next());
		System.out.println("● 거주국가/지역 입력(ex.kor) : ");
		member.setCountry(sc.next());
		
		
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}


//-------------AirPlaneController--------------------------------
	@Override
	public void ticketReservation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ticketSelect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ticketCancle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seatChange() {
		// TODO Auto-generated method stub
		
	}	
}
