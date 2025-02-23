package com.company.test;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain_v2 {
	public static void main(String[] args) {
		ArrayList<Account> creAccount = new ArrayList<Account>();
		BankImpl_v2 bank =  new ShinhanBank_v2();
		Scanner sc = new Scanner(System.in);
		while(true){
			bank.bankMenu();
			
			int select = sc.nextInt();
		 	if(select == 1) {
				creAccount = bank.createAccount();
			}else if(select == 2) {
				bank.selectAccount();
			}else if(select == 3) {
				bank.deposit();
			}else if(select == 4) {
				bank.withdraw();
			}else if(select == 5) {
				bank.delete();
			}else{
				System.out.println("종료기능입니다.");
				System.exit(0);
			}
		}
		
	}
}
