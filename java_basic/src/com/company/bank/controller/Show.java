package com.company.bank.controller;

import java.util.ArrayList;

import com.company.bank.Account;
import com.company.bank.Common;

public class Show implements Bank_Controller{
	
	@Override
	public void exec(ArrayList<Account> users) {
		Common com = new Common();
		String str = com.inputAccount();
		int idPwChk = com.accountChk(str.split("/")[0],str.split("/")[1],users);
		if( idPwChk > 0) {
			System.out.println("===계좌조회");
			System.out.println("ID : " + users.get(idPwChk-1).getId());
			System.out.println("PW : " + users.get(idPwChk-1).getPw());
			System.out.println("나이 : " + users.get(idPwChk-1).getAge());
			System.out.println("잔액 : " + users.get(idPwChk-1).getMoney());
		}else {
			System.out.println("다시 확인해주세요.");
		}		
	}

}
