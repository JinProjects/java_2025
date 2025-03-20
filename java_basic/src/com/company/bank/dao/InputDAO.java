package com.company.bank.dao;

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

public class InputDAO {
	public Account selectAccount(){
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "";
		
		Common com = new Common();
		String str = com.inputAccount();
		String id = str.split("/")[0];
		String pw = str.split("/")[1];
		Account account = new Account();
		int num = 0;
		try {
			conn = DBConnection.connection();
			sql = "select * from bank where id = '" + id + "'";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			if(!rs.next()) {
				account.setId(id);
				account.setPw(pw);
			}
			rs.close();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return account;
	}
	
	public int inputAccount(ArrayList<Account> creAccount,Account account) {
		Scanner sc =new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "";
		
		int balance = sc.nextInt();
		InetAddress local = null;
		String myIp = "" ;
		
		int num = 0;
		try {
			local = InetAddress.getLocalHost();
			myIp = local.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		Account newAccount = new Account(account.getId(), account.getPw(), balance);
		try {
			conn = DBConnection.connection();
			sql = "insert into bank(id, pass, balance, ip) values (?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, account.getId());
			psmt.setString(2, account.getPw());
			psmt.setInt(3, balance);
			psmt.setString(4, myIp);
			num = psmt.executeUpdate();
			
				creAccount.add(newAccount);
				
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return num;
	}
}
