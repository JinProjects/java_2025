package com.company.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.company.bank.DBConnection;
import com.company.bank.dto.Account;

public class DepositDAO {
	public Account depositDAO(String str) {
		String sql = "";
		Connection conn = null;
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		String id = str.split("/")[0];
		String pw = str.split("/")[1];
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		
		try {
			sql = "select * from bank where id = ? and pass = ?";
			conn = DBConnection.connection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			while(rs.next()) {
				account.setNo(rs.getInt("no"));
				account.setId(rs.getString("id"));
				account.setPw(rs.getString("pass"));
				account.setBalance(rs.getInt("balance"));
			}
			
			sql = "update bank set balance = ? where id=?";
			
			psmt = conn.prepareStatement(sql);
			System.out.print("입금:");
			int depo = sc.nextInt();
			int myMoney = account.getBalance();
			myMoney += depo;
			psmt.setDouble(1, myMoney);
			psmt.setString(2, id);
			
			int num = psmt.executeUpdate();
			if(num > 0) {
				System.out.println("=======");
				System.out.println("입금완료");
				System.out.println("잔액 : "+myMoney);
			//creAccount.get(idPwChk-1).setMoney(myMoney);
			}else {
				System.out.println("다시 확인해주세요.");
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return account; 
	}
	
}
