package com.company.bank.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.DBConnection;
import com.company.bank.common.Common;
import com.company.bank.dto.Account;

public class Withdraw implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		String str = com.inputAccount();
		String id =  str.split("/")[0];
		String pw = str.split("/")[1];
		
		String sql = "select * from bank where id = ? and pass = ?";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.connection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs =  psmt.executeQuery();
			
			while(rs.next()) {
				account.setId(rs.getString("id"));
				account.setPw(rs.getString("pass"));
				account.setBalance(rs.getInt("balance"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		if(num > 0) {
//			System.out.println("출금 되었습니다.");
//		}
//		
		//int idPwChk = com.accountChk(id,pw, creAccount);
		try {
			//if(idPwChk > -1) {
			if(account.getId().equals(id)&&account.getPw().equals(pw)) {
				System.out.print("출금:");
				int money = sc.nextInt();
				
				int myMoney = account.getBalance();
				sql = "update bank set balance=? where id=? ";
				psmt = conn.prepareStatement(sql);
				myMoney -= money;
				psmt.setDouble(1, myMoney);
				psmt.setString(2, id);
				int num = psmt.executeUpdate();
				if(num > 0) {
					System.out.println("==출금완료");					
				}
				//System.out.println("잔액 : "+myMoney);
				//creAccount.get(idPwChk-1).setMoney(myMoney);
			//}else {
			//}
			}else {
				System.out.println("다시 확인해주세요.");
			}
			rs.close();
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
