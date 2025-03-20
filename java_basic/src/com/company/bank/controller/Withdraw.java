package com.company.bank.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.bank.DBConnection;
import com.company.bank.common.Common;
import com.company.bank.dao.WithdrawDAO;
import com.company.bank.dto.Account;

public class Withdraw implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		String str = com.inputAccount();
		WithdrawDAO withdrawDAO = new WithdrawDAO();
		int num = withdrawDAO.withdrawDAO(str);
		
		if(num > 0) {
			System.out.println("==출금완료");					
		}
	}

}
