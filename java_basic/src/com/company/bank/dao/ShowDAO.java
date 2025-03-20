package com.company.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.bank.DBConnection;
import com.company.bank.dto.Account;

public class ShowDAO {
	public Account selectAccount(String str) {
		Account account = new Account();
		
		Connection conn;
		PreparedStatement psmt; 
		ResultSet rs;
		String sql = "select * from bank where id = ? and pass = ?";
		try {
			conn = DBConnection.connection();
			psmt = conn.prepareStatement(sql);
			String id = str.split("/")[0];
			String pw = str.split("/")[1];
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				account.setNo(rs.getInt(1));
				account.setId(rs.getString(2));
				account.setPw(rs.getString(3));
				account.setBalance(rs.getInt(4));
				account.setIp(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}
}
