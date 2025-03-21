package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
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
public class MapEx2 {

	public static void main(String[] args) {
		Map<Integer,UserInfo> map = new HashMap<>();
		map.put(1, new UserInfo("아이언맨",50));
		map.put(2, new UserInfo("헐크",40));
		map.put(3, new UserInfo("캡틴",120));
		map.put(1, new UserInfo("아이언맨-new",50));
		
		Iterator iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			int key = (int)iter.next();
			UserInfo user = map.get(key);
			System.out.println(user.getName()+"/"+user.getAge());
		}
	}

}
