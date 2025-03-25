package bank.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import bank.common.Common;
import bank.common.DBConnection;
import bank.dto.Account;

public class BDAO {
	
	//계정 확인
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
		//아이디를 조회한다
		//아이디가 없으면 rs.next()는 false리턴
		//id와 pw를 넘긴다.
		//객체를 넘긴다.
		//숫자를 넘긴다.
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
	//계정 생성
	public int inputAccount(ArrayList<Account> creAccount,Account account) {
		Scanner sc =new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement psmt = null;
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
	
	//입금
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
			
			account.setBalance(myMoney);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return account; 
	}
	
	//출금
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
	
	//삭제
	public int deleteDAO(String str) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "";
		
		String id = str.split("/")[0];
		String pw = str.split("/")[1];
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Account account = new Account();
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
		
		try {
			if(account.getId() != null && account.getPw() != null) {
				System.out.println("계좌를 삭제하시겠습니까?(Y/N)");
				flag = sc.next();
			}else {
				System.out.println("다시 확인해주세요.");
				return -1;
			}
			if(flag.charAt(0) == 'Y' || flag.charAt(0) == 'y') {
				///// 100만개일때 ...... 시스템안멈추게.....
				/// 그자리만 초기화 
			  /// 삭제할 계좌만 초기화
					sql = "delete from bank where id = ?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					num = psmt.executeUpdate();
					
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
		return num;
	}
}
