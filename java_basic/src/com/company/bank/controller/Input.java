package com.company.bank.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.common.Common;
import com.company.bank.dto.Account;
//계정 생성
public class Input implements Bank_Controller{
	
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Scanner sc = new Scanner(System.in);
		
		String str = com.inputAccount();
		for(int i = 0; i < creAccount.size(); i++) {
			if(creAccount.get(i).getId().equals(str.split("/")[0])) {
//			System.out.println(creAccount.get(i));
				System.out.println("이미 아이디가 존재합니다.");
				return;
			}
		}
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.print("잔액 입력:");
		int money = sc.nextInt();
		
		Account newAccount = new Account(str.split("/")[0], str.split("/")[1], age, money);
		creAccount.add(newAccount);

	}

}
