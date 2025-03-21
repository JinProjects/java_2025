package bank.common;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.dto.Account;

public class Common {
	
	public String inputAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 >");
		String id = sc.next();
		System.out.print("비밀번호 입력 >");
		String pw = sc.next();
		
		return id+"/"+pw;
	}
	
	public int accountChk(String id, String pw, ArrayList<Account> creAccount) {
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
