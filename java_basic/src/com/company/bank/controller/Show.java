package com.company.bank.controller;

import java.util.ArrayList;

import com.company.bank.common.Common;
import com.company.bank.dao.BDAO;
import com.company.bank.dto.Account;

public class Show implements Bank_Controller{
	
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		String str = com.inputAccount();
		Account account = new Account();
		
		BDAO bDAO = new BDAO();
		account = bDAO.selectAccount(str);
		
		if(account.getNo()!=0) {
			System.out.println("===계좌조회");
			System.out.println("ID : "+ account.getId());
			System.out.println("PW : " + account.getPw());
			System.out.println("잔액 : " + account.getBalance());
			System.out.println("IP : " + account.getIp());
		}else {
			System.out.println("다시 확인해주세요.");
		}
		
//		int idPwChk = com.accountChk(str.split("/")[0],str.split("/")[1],creAccount);
//		if( idPwChk > 0) {
//			System.out.println("===계좌조회");
//			System.out.println("ID : " + creAccount.get(idPwChk-1).getId());
//			System.out.println("PW : " + creAccount.get(idPwChk-1).getPw());
//			System.out.println("나이 : " + creAccount.get(idPwChk-1).getAge());
//			System.out.println("잔액 : " + creAccount.get(idPwChk-1).getMoney());
//		}else {
//			System.out.println("다시 확인해주세요.");
//		}		
	}

}
