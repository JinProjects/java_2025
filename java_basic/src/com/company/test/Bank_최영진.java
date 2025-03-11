package com.company.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.company.bank.Account;


public class Bank_최영진 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList creAccount = new ArrayList<Account>();
		//Account[] creAccount = new Account[3];   // 콜렉션프레임워크 
		int accountCnt = 0;
		int num = 0;
		
		boolean flag = true;
		int select = 0;
		String id;
		String pw;
		
		
		while(flag) {
			System.out.println( creAccount.toString()   );
			System.out.println("=========BANK=========");
			System.out.println("* 1.추가");
			System.out.println("* 2.조회");
			System.out.println("* 3.입금");
			System.out.println("* 4.출금");
			System.out.println("* 5.삭제");
			System.out.println("* 9.종료");
			System.out.print("입력>>> ");
			select = sc.nextInt();
			
			if(select == 1) {
				accountCnt = createAccount(creAccount,accountCnt);
			}else if(select == 2) {
				selectAccount(creAccount, accountCnt);
			}else if(select == 3) {
				//입금
				deposit(creAccount,accountCnt);
			}else if(select == 4) {
				withdraw(creAccount,accountCnt);
			}else if(select == 5) {
				accountCnt = delete(creAccount,accountCnt);
			}else {
				System.exit(0);
//				return;
			}
			
		}
		
	} 
	private static int delete(ArrayList<Account> creAccount, int accountCnt) {
		Scanner sc = new Scanner(System.in);
		String str = inputAccount();
		
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1], accountCnt, creAccount);
		
		if(idPwChk > 0) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			String flag = sc.next();
			if(flag.charAt(0) == 'Y' || flag.charAt(0) == 'y') {
				///// 100만개일때 ...... 시스템안멈추게.....
				/// 그자리만 초기화 
			  /// 삭제할 계좌만 초기화
				creAccount.remove(idPwChk-1);
			}else {
				return accountCnt;
			}
		}
		return --accountCnt;
	}
	private static void withdraw(ArrayList<Account> creAccount, int accountCnt) {
		Scanner sc = new Scanner(System.in);
		String str = inputAccount();
		
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1], accountCnt, creAccount);
		
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
	
	private static void deposit(ArrayList<Account> creAccount, int accountCnt) {
		String str = inputAccount();
		Scanner sc = new Scanner(System.in);
		int idPwChk = accountChk(str.split("/")[0],str.split("/")[1], accountCnt, creAccount);
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

	private static void selectAccount(ArrayList<Account> creAccount, int accountCnt) {
		boolean flag = true;
		String str = inputAccount();
			int idPwChk = accountChk(str.split("/")[0],str.split("/")[1],accountCnt,creAccount);
			if( idPwChk > 0) {
				System.out.println("===계좌조회");
				System.out.println("ID : " + creAccount.get(idPwChk-1).getId());
				System.out.println("PW : " + creAccount.get(idPwChk-1).getPw());
				System.out.println("나이 : " + creAccount.get(idPwChk-1).getAge());
				System.out.println("잔액 : " + creAccount.get(idPwChk-1).getMoney());
			}else {
				System.out.println("다시 확인해주세요.");
				flag = false;
			}
	}

	public static int createAccount(ArrayList<Account> creAccount,int accountCnt) {
		Scanner sc = new Scanner(System.in);
		
		String str = inputAccount();
		for(int i = 0; i < accountCnt; i++) {
			if(creAccount.get(i).getId().equals(str.split("/")[0])) {
			System.out.println(creAccount.get(i));
				System.out.println("이미 아이디가 존재합니다.");
				return 0;
			}
		}
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.print("잔액 입력:");
		int money = sc.nextInt();
		
		Account newAccount = new Account(str.split("/")[0], str.split("/")[1], age, money);
		creAccount.add(newAccount);
		
		return ++accountCnt;
	}
	
	private static int accountChk(String id, String pw, int accountCnt, ArrayList<Account> creAccount) {
		boolean idFlag = false;
		boolean pwFlag = false;
		int num = 0;
		for(int i=0; i<accountCnt; i++) {
			
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
	private static String inputAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 >");
		String id = sc.next();
		System.out.print("비밀번호 입력 >");
		String pw = sc.next();
		
		return id+"/"+pw;
	}
}
// class Account {
//	String id;
//	String pw;
//	int age;
//	int money;
//	
//  //기본생성자 ##
//  public Account(){}
//
//  // toString 상태확인 ##
//	public Account(String id, String pw, int age, int money) {
//		this.id	= id;
//		this.pw = pw;
//		this.age = age;
//		this.money = money;
//	}
//
//	@Override
//	public String toString() {
//		return "Account [id=" + id + ", pw=" + pw + ", age=" + age + ", money=" + money + "]";
//	}
//	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getPw() {
//		return pw;
//	}
//
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	
//}
