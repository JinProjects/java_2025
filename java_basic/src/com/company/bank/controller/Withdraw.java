package com.company.bank.controller;

import java.util.ArrayList;

import com.company.bank.common.Common;
import com.company.bank.dao.BDAO;
import com.company.bank.dto.Account;

public class Withdraw implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		String str = com.inputAccount();
		BDAO bDAO = new BDAO();
		int num = bDAO.withdrawDAO(str);
		
		if(num > 0) {
			System.out.println("==출금완료");					
		}
	}

}
