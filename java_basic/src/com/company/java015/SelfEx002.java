package com.company.java015;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class UserInfo2{
	private int no;
	private String name;
	private int age;
	
	public UserInfo2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	
	// set, Map 중복허용 1) hashCode 2)equals
	@Override
	public int hashCode() {
		return Objects.hash(no,name,age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
	
}

public class SelfEx002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<UserInfo2> users = new HashSet<>();
		users.add(new UserInfo2(1,"아이언맨",50));
		users.add(new UserInfo2(2,"헐크",40));
		users.add(new UserInfo2(3,"캡틴",120));
		
		for(UserInfo2 user : users) {
			System.out.println(user.getNo() +"/"+ user.getName() + "/" + user.getAge());
		}
		
		Iterator<UserInfo2> iter = users.iterator();
		while(iter.hasNext()) {
			UserInfo2 user = iter.next();
			System.out.println(user.getNo() +"/"+ user.getName() + "/" + user.getAge());
		}
		
		System.out.print("이름을 입력해주세요>");
		String name = sc.next();
		
		for(UserInfo2 user : users) {
			if(user.getName().equals(name)) {
				System.out.println(user.getNo() +"/"+ user.getName() + "/" + user.getAge());
				break;
			}
		}
	
	}

}
