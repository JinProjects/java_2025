package com.company.bank.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.common.Common;
import com.company.bank.dao.BDAO;
import com.company.bank.dao.InputDAO;
import com.company.bank.dto.Account;
//계정 생성
public class Input implements Bank_Controller{
	
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Scanner sc = new Scanner(System.in);
		BDAO bDAO = new BDAO();
		Account account = bDAO.selectAccount();
			
			if(account.getId()==null && account.getPw()==null) {	
				System.out.println("이미 아이디가 존재합니다.");
				return;
			}
			
			System.out.print("잔액 입력:");
			int insertNum = bDAO.inputAccount(creAccount,account);
			
			if(insertNum > -1) {
				System.out.println("등록되었습니다.");
			}else {
				System.err.println("다시 확인해 주세요");
			}
			
		//for(int i = 0; i < creAccount.size(); i++) {
		//	if(creAccount.get(i).getId().equals(str.split("/")[0])) {
//			System.out.println(creAccount.get(i));
//				System.out.println("이미 아이디가 존재합니다.");
//				return;
//			}
//		}
		
	}

}
