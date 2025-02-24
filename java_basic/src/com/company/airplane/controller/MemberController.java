package com.company.airplane.controller;

import java.util.ArrayList;

import com.company.airplane.dto.Member;

public interface MemberController {
	public void login();//로그인
	public void logout();//로그아웃
	public void newAccount(ArrayList<Member> mList);//회원가입
}
