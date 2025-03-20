package com.company.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.company.bank.DBConnection;
import com.company.bank.dto.Account;

public class WithdrawDAO {
	public int withdrawDAO(String str) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		Account account = new Account();
		String id =  str.split("/")[0];
		String pw = str.split("/")[1];
		int num = 0;
		String sql = "select * from bank where id = ? and pass = ?";
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
			
			if(account.getId()!= null && account.getPw()!=null) {
				if(account.getId().equals(id)&&account.getPw().equals(pw)) {
					System.out.print("출금:");
					int money = sc.nextInt();
					
					int myMoney = account.getBalance();
					sql = "update bank set balance=? where id=? ";
					psmt = conn.prepareStatement(sql);
					myMoney -= money;
					psmt.setDouble(1, myMoney);
					psmt.setString(2, id);
					num = psmt.executeUpdate();
				}
			}else {
				System.out.println("다시 확인해주세요.");
			}
			rs.close();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
}
