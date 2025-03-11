package com.company.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain_v2 {
	public static void main(String[] args) {
		ArrayList<Account> creAccount = new ArrayList<Account>();
		//은행선택
		//BankImpl_v2[] bank =  {new ShinhanBank_v2(),new WooriBank(), new KookminBank() };
		BankImpl_v2 bank =  new ShinhanBank_v2();
		Scanner sc = new Scanner(System.in);
		while(true){
			bank.bankMenu();
			
			int select = sc.nextInt();
		 	if(select == 1) {
				bank.createAccount(creAccount); 
			}else if(select == 2) {
				bank.selectAccount(creAccount);
			}else if(select == 3) {
				bank.deposit(creAccount);
			}else if(select == 4) {
				bank.withdraw(creAccount);
			}else if(select == 5) {
				bank.delete(creAccount);
			}else{
				System.out.println("종료기능입니다.");
				System.exit(0);
			}
		}
		
	}
}
