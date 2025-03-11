package com.company.bank.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.Account;
import com.company.bank.Common;

public class Withdraw implements Bank_Controller{
	ArrayList<Account> creAccount = new ArrayList<Account>();
	@Override
	public void exec(ArrayList<Account> users) {
		Common com = new Common();
		Scanner sc = new Scanner(System.in);
		String str = com.inputAccount();
		
		int idPwChk = com.accountChk(str.split("/")[0],str.split("/")[1], creAccount);
		
		if(idPwChk > 0) {
			System.out.print("출금:");
			int money = sc.nextInt();
			int myMoney = creAccount.get(idPwChk-1).getMoney();
			
			myMoney -= money;
			System.out.println("==출금완료");
			System.out.println("잔액 : "+myMoney);
			creAccount.get(idPwChk-1).setMoney(myMoney);
		}else {
			System.out.println("다시 확인해주세요.");
		}
	}

}
