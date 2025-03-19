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

public class Delete implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "";
		Account account = new Account();
		
		String str = com.inputAccount();
		Scanner sc = new Scanner(System.in);
		String id = str.split("/")[0];
		String pw = str.split("/")[1];
		
		try {
			sql = "select * from bank where id = ? and pass = ?";
			conn = DBConnection.connection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				account.setId(id);
				account.setPw(pw);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String flag = "";
		if(account.getId() != null && account.getPw() != null) {
			System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
			flag = sc.next();
		}else {
			System.out.println("다시 확인해주세요.");
			return;
		}
		
		
		try {
			if(flag.charAt(0) == 'Y' || flag.charAt(0) == 'y') {
				///// 100만개일때 ...... 시스템안멈추게.....
				/// 그자리만 초기화 
			  /// 삭제할 계좌만 초기화
					sql = "delete from bank where id = ?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					int num = psmt.executeUpdate();
					if(num > 0) {
						System.out.println("삭제가 완료되었습니다.");
					}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
