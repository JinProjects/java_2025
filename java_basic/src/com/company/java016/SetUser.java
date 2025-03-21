package com.company.java016;

import java.util.HashSet;
import java.util.Set;

public class SetUser {

	public static void main(String[] args) {
		Set<UserInfo> users = new HashSet<>();
		users.add(new UserInfo("아이언맨",50));
		users.add(new UserInfo("헐크",40));
		users.add(new UserInfo("캡틴",120));
		
		for(UserInfo user : users) {
			System.out.println(user.getName() + "/" + user.getAge());
		}
	}

}
