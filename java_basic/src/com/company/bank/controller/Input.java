package com.company.bank.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.DBConnection;
import com.company.bank.common.Common;
import com.company.bank.dto.Account;
//계정 생성
public class Input implements Bank_Controller{
	
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Scanner sc = new Scanner(System.in);
		String sql = "";
		String str = com.inputAccount();
		String id = str.split("/")[0];
		String pw = str.split("/")[1];
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.connection();
			sql = "select * from bank where id = '" + str.split("/")[0] + "'";
			
			System.out.println(sql);
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				System.out.println("이미 아이디가 존재합니다.");
				rs.close();
				psmt.close();
				conn.close();
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//for(int i = 0; i < creAccount.size(); i++) {
		//	if(creAccount.get(i).getId().equals(str.split("/")[0])) {
//			System.out.println(creAccount.get(i));
//				System.out.println("이미 아이디가 존재합니다.");
//				return;
//			}
//		}
		System.out.print("잔액 입력:");
		int balance = sc.nextInt();
		InetAddress local = null;
		String myIp = "" ;
		try {
			local = InetAddress.getLocalHost();
			myIp = local.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Account newAccount = new Account(str.split("/")[0], str.split("/")[1], balance);
		boolean result = true; 
		try {
			sql = "insert into bank(id, pass, balance, ip) values (?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setInt(3, balance);
			psmt.setString(4, myIp);
			psmt.executeUpdate();
			
			if(result) {
				creAccount.add(newAccount);
				System.out.println("등록되었습니다.");
			}
			rs.close();
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
