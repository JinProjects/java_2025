package com.company.bank.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.Account;
import com.company.bank.Common;

public class Deposit implements Bank_Controller{
	ArrayList<Account> creAccount = new ArrayList<Account>();
	@Override
	public void exec(ArrayList<Account> users) {
		Common com = new Common();
		String str = com.inputAccount();
		Scanner sc = new Scanner(System.in);
		int idPwChk = com.accountChk(str.split("/")[0],str.split("/")[1], creAccount);
		if(idPwChk > 0) {
			System.out.print("입금:");
			int depo = sc.nextInt();
			int myMoney = creAccount.get(idPwChk-1).getMoney();
			myMoney += depo;
			System.out.println("=======");
			System.out.println("입금완료");
			System.out.println("잔액 : "+myMoney);
			creAccount.get(idPwChk-1).setMoney(myMoney);
		}else {
			System.out.println("다시 확인해주세요.");
		}		
	}

}
