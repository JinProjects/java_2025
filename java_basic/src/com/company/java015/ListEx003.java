package com.company.java015;

import java.util.ArrayList;
import java.util.Scanner;

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
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
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
public class ListEx003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<UserInfo> users = new ArrayList<>(); 
		
		users.add(new UserInfo("아이언맨",50));
		users.add(new UserInfo("헐크",40));
		users.add(new UserInfo("캡틴",120));
		
		System.out.print("원하는 유저의 이름을 입력하세요 > ");
		String name = sc.next();
		
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getName().equals(name)) {
				System.out.println(users.get(i).getName() +"," +users.get(i).getAge());
			}
		}
		
		for(UserInfo user : users) {
			if(name.equals(user.getName())) {
				System.out.println(user.getName() +"," +user.getAge());
			}
		}
	}

}
