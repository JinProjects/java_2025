package com.company.bank.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.Account;
import com.company.bank.Common;

public class Delete implements Bank_Controller{
	ArrayList<Account> creAccount = new ArrayList<Account>();
	@Override
	public void exec(ArrayList<Account> users) {
		Common com = new Common();
		Scanner sc = new Scanner(System.in);
		String str = com.inputAccount();
		String flag = "";
		
		int idPwChk = com.accountChk(str.split("/")[0],str.split("/")[1], creAccount);
		
		if(idPwChk > 0) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			flag = sc.next();
		}else {
			System.out.println("다시 확인해주세요.");
			return;
		}
		
		if(flag.charAt(0) == 'Y' || flag.charAt(0) == 'y') {
			///// 100만개일때 ...... 시스템안멈추게.....
			/// 그자리만 초기화 
		  /// 삭제할 계좌만 초기화
			creAccount.remove(idPwChk-1);
		}
	}

}
