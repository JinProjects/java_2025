package com.company.test;

import java.util.ArrayList;

public interface BankImpl_v2 {
	void bankMenu();
	void createAccount(ArrayList<Account> creAccount);
	void selectAccount(ArrayList<Account> creAccount);
	void deposit(ArrayList<Account> creAccount);
	void withdraw(ArrayList<Account> creAccount);
	void delete(ArrayList<Account> creAccount);
}
