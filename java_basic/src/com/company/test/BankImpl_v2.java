package com.company.test;

import java.util.ArrayList;

public interface BankImpl_v2 {
	void bankMenu();
	ArrayList<Account> createAccount();
	void selectAccount();
	void deposit();
	void withdraw();
	void delete();
}
