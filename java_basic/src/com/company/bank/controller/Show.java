package com.company.bank.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.company.bank.DBConnection;
import com.company.bank.common.Common;
import com.company.bank.dto.Account;

public class Show implements Bank_Controller{
	
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Connection conn;
		PreparedStatement psmt; 
		ResultSet rs;
		String sql = "select * from bank where id = ? and pass = ?";
		try {
			conn = DBConnection.connection();
			psmt = conn.prepareStatement(sql);
			String str = com.inputAccount();
			String id = str.split("/")[0];
			String pw = str.split("/")[1];
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("===계좌조회");
				System.out.println("ID : "+rs.getString(2));
				System.out.println("PW : " + rs.getString(3));
				System.out.println("잔액 : " + rs.getString(4));
				System.out.println("IP : " + rs.getString(6));
			}else {
				System.out.println("다시 확인해주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		int idPwChk = com.accountChk(str.split("/")[0],str.split("/")[1],creAccount);
//		if( idPwChk > 0) {
//			System.out.println("===계좌조회");
//			System.out.println("ID : " + creAccount.get(idPwChk-1).getId());
//			System.out.println("PW : " + creAccount.get(idPwChk-1).getPw());
//			System.out.println("나이 : " + creAccount.get(idPwChk-1).getAge());
//			System.out.println("잔액 : " + creAccount.get(idPwChk-1).getMoney());
//		}else {
//			System.out.println("다시 확인해주세요.");
//		}		
	}

}
