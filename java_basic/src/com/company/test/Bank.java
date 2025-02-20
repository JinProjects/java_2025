package com.company.test;

import java.util.Arrays;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] creAccount = new Account[100];
		int accountCnt = 0;
		int num = 0;
		
		boolean flag = true;
		int select = 0;
		String id;
		String pw;
		
		
		while(flag) {
			System.out.println(Arrays.toString(creAccount));
			System.out.println("=========BANK=========");
			System.out.println("* 1.추가");
			System.out.println("* 2.조회");
			System.out.println("* 3.입금");
			System.out.println("* 4.출금");
			System.out.println("* 5.삭제");
			System.out.println("* 9.종료");
			System.out.print("입력>>> ");
			select = sc.nextInt();
			
			if(select == 1) {//추가
				accountCnt = createAccount(creAccount,accountCnt);
			}else if(select == 2) {//조회
				selectAccount(creAccount, accountCnt);
			}else if(select == 3) {//입금
				deposit(creAccount,accountCnt);
			}else if(select == 4) {//출금
				withdraw(creAccount,accountCnt);
			}else if(select == 5) {//삭제
				accountCnt = delete(creAccount,accountCnt);
			}else {//종료
				System.exit(0);
//				return;
			}
			
		}
		
	} 
	//삭제
	private static int delete(Account[] creAccount, int accountCnt) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id:");
		String id = sc.next();
		System.out.print("pw:");
		String pw = sc.next();
		
		int idPwChk = accountChk(id, pw, accountCnt, creAccount);
		
		if(idPwChk > 0) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			String flag = sc.next();
//			Account tempAccount = null;
			if(flag.charAt(0) == 'Y' || flag.charAt(0) == 'y') {
//				for(int i = idPwChk; i<creAccount.length-1; i++) {
//					creAccount[i-1] = creAccount[i];
//					creAccount[i] = creAccount[i+1];
//					creAccount[i+1] = tempAccount;
					creAccount[idPwChk-1] = null;
//				}
			}else {
				return idPwChk;
			}
		}
		return idPwChk;
	}
	//출금
	private static void withdraw(Account[] creAccount, int accountCnt) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id:");
		String id = sc.next();
		System.out.print("pw:");
		String pw = sc.next();
		
		int idPwChk = accountChk(id, pw, accountCnt, creAccount);
		
		if(idPwChk > 0) {
			System.out.print("출금:");
			int money = sc.nextInt();
			int myMoney = creAccount[idPwChk-1].getMoney();
			
			myMoney -= money;
			System.out.println("==출금완료");
			System.out.println("잔액 : "+myMoney);
			creAccount[idPwChk-1].setMoney(myMoney);
		}else {
			System.out.println("다시 확인해주세요.");		}
		
	}
	//입금
	private static void deposit(Account[] creAccount, int accountCnt) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id:");
		String id = sc.next();
		System.out.print("pw:");
		String pw = sc.next();
		
		int idPwChk = accountChk(id, pw, accountCnt, creAccount);
		if(idPwChk > 0) {
			System.out.print("입금:");
			int depo = sc.nextInt();
			int myMoney = creAccount[idPwChk-1].getMoney();
			myMoney += depo;
			System.out.println("=======");
			System.out.println("입금완료");
			System.out.println("잔액 : "+myMoney);
			creAccount[idPwChk-1].setMoney(myMoney);
		}else {
			System.out.println("다시 확인해주세요.");
		}
	}
	//조회
	private static void selectAccount(Account[] creAccount, int accountCnt) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String id;
		String pw;
			System.out.print("id : ");
			id = sc.next();
			System.out.print("pw : ");
			pw = sc.next();
			int idPwChk = accountChk(id,pw,accountCnt,creAccount);
			if( idPwChk > 0) {
				System.out.println("===계좌조회");
				System.out.println("ID : " + creAccount[idPwChk-1].getId());
				System.out.println("PW : " + creAccount[idPwChk-1].getPw());
				System.out.println("나이 : " + creAccount[idPwChk-1].getAge());
				System.out.println("잔액 : " + creAccount[idPwChk-1].getMoney());
			}else {
				System.out.println("다시 확인해주세요.");
				flag = false;
			}
	}
	//추가
	public static int createAccount(Account[] creAccount,int accountCnt) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 >");
		String id = sc.next();
		System.out.print("비밀번호 입력 >");
		String pw = sc.next();
		
		for(int i = 0; i < accountCnt; i++) {
			if(creAccount[i].getId().equals(id)) {
				System.out.println("이미 아이디가 존재합니다.");
				return 0;
			}
		}
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.print("잔액 입력:");
		int money = sc.nextInt();
		creAccount[accountCnt++] = new Account(id, pw, age, money);
		
		return accountCnt;
	}
	
	private static int accountChk(String id, String pw, int accountCnt, Account[] creAccount) {
		boolean idFlag = false;
		boolean pwFlag = false;
		
		int num = 0;
		for(int i=0; i<accountCnt; i++) {
			
			if(creAccount[i] != null && creAccount[i].getId().equals(id)) {
//				if(creAccount != null && creAccount[i].getId().equals(id)) {
				idFlag = true;
			}else {
				idFlag = false;
			}
			
			if(creAccount[i] != null && creAccount[i].getPw().equals(pw)) {
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
 class Account {
	String id;
	String pw;
	int age;
	int money;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String id, String pw, int age, int money) {
		this.id	= id;
		this.pw = pw;
		this.age = age;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [id=\""+ id + "\", pw=\""+ pw + "\", age=\"" + age + "\", money=\""+money + "\"]";
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
