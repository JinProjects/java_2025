package com.company.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ShinhanBank implements BankImpl{
	ArrayList<Account> creAccount = new ArrayList<Account>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		
		String str = inputAccount();
		for(int i = 0; i < creAccount.size(); i++) {
			if(creAccount.get(i).getId().equals(str.split("/")[0])) {
			System.out.println(creAccount.get(i));
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

	@Override
	public void selectAccount() {
		String str = inputAccount();
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1],creAccount);
		if( idPwChk > 0) {
			System.out.println("===계좌조회");
			System.out.println("ID : " + creAccount.get(idPwChk-1).getId());
			System.out.println("PW : " + creAccount.get(idPwChk-1).getPw());
			System.out.println("나이 : " + creAccount.get(idPwChk-1).getAge());
			System.out.println("잔액 : " + creAccount.get(idPwChk-1).getMoney());
		}else {
			System.out.println("다시 확인해주세요.");
		}		
	}

	@Override
	public void deposit() {
		String str = inputAccount();
		Scanner sc = new Scanner(System.in);
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1], creAccount);
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

	@Override
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		String str = inputAccount();
		
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1], creAccount);
		
		if(idPwChk > 0) {
			System.out.print("출금:");
			int money = sc.nextInt();
			int myMoney = creAccount.get(idPwChk-1).getMoney();
			
			myMoney -= money;
			System.out.println("==출금완료");
			System.out.println("잔액 : "+myMoney);
			creAccount.get(idPwChk-1).setMoney(myMoney);
		}		
	}

	@Override
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String str = inputAccount();
		
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1], creAccount);
		
		if(idPwChk > 0) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			String flag = sc.next();
			if(flag.charAt(0) == 'Y' || flag.charAt(0) == 'y') {
				///// 100만개일때 ...... 시스템안멈추게.....
				/// 그자리만 초기화 
			  /// 삭제할 계좌만 초기화
				creAccount.remove(idPwChk-1);
			}
//			else {
//				return;
//			}
		}
		return;		
	}
	private static String inputAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 >");
		String id = sc.next();
		System.out.print("비밀번호 입력 >");
		String pw = sc.next();
		
		return id+"/"+pw;
	}
	private static int accountChk(String id, String pw, ArrayList<Account> creAccount) {
		boolean idFlag = false;
		boolean pwFlag = false;
		int num = 0;
		for(int i=0; i<creAccount.size(); i++) {
			
			if(creAccount.get(i) != null && creAccount.get(i).getId().equals(id)) {
//				if(creAccount != null && creAccount[i].getId().equals(id)) {
				idFlag = true;
			}else {
				idFlag = false;
			}
			
			if(creAccount.get(i) != null && creAccount.get(i).getPw().equals(pw)) {
				pwFlag = true;
			}else {
				pwFlag = false;
			}
			num++;
			if(idFlag && pwFlag) 	{
				break;
			}
		}
			
			if(idFlag && pwFlag) {
				return num;
			}else {
				return 0;
			}
	}
}
