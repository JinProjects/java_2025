package com.company.bank.controller;

import java.util.ArrayList;

import com.company.bank.common.Common;
import com.company.bank.dao.BDAO;
import com.company.bank.dto.Account;

public class Deposit implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		String str = com.inputAccount();
		
		try {
			Account account = new Account();
			BDAO bDAO = new BDAO();
			account = bDAO.depositDAO(str);
			
			if(account.getNo() != 0) {
				System.out.println("=======");
				System.out.println("입금완료");
				System.out.println("잔액 : "+account.getBalance());
			//creAccount.get(idPwChk-1).setMoney(myMoney);
			}else {
				System.out.println("다시 확인해주세요.");
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
