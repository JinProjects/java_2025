package com.company.test;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		BankImpl shinHan = new ShinhanBank();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("=========BANK=========");
			System.out.println("* 1.추가");
			System.out.println("* 2.조회");
			System.out.println("* 3.입금");
			System.out.println("* 4.출금");
			System.out.println("* 5.삭제");
			System.out.println("* 9.종료");
			System.out.print("입력>>> ");
			
			int select = sc.nextInt();
			if(select == 1) {
				shinHan.createAccount();
			}else if(select == 2) {
				shinHan.selectAccount();
			}else if(select == 3) {
				shinHan.deposit();
			}else if(select == 4) {
				shinHan.withdraw();
			}else if(select == 5) {
				shinHan.delete();
			}else{
				System.exit(0);
			}
		}
		
	}
}
