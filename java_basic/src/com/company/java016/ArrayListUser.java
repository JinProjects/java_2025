package com.company.java016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class UserInfo{
	private String name;
	private int age;
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ArrayListUser {

	public static void main(String[] args) {
		ArrayList<UserInfo> users = new ArrayList<>();
		users.add(new UserInfo("아이언맨",50));
		users.add(new UserInfo("헐크",40));
		users.add(new UserInfo("캡틴",120));
		
		for(UserInfo user : users) {
			System.out.println(user.getName()+"/"+user.getAge());
		}
	}

}
