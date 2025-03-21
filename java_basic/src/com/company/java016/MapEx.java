package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
// 사전 : Entry<key, value> put, get, size, remove, contains
public class MapEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("==========================");
		System.out.println("KING\tName");
		System.out.println("==========================");
								//key, value 모음
		Iterator<Entry <String, String>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry <String, String> temp = iter.next();
			System.out.println(temp.getKey()+" "+temp.getValue());
			System.out.println("------------------------");
		}
//		Iterator<String> iter = map.keySet().iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			System.out.println(key+"\t"+map.get(key));
//			System.out.println("---------------------");
//		}
//		
		System.out.println("KING의 정보를 제공중입니다.");
		System.out.print("이름을 입력하세요 >");
		String name = sc.next();
		String result = "왕의 정보를 확인해주세요.";
		if(map.containsKey(name)) result = "ㅁ"+name+ ":"+map.get(name);			
			
			System.out.println(result);
		
	}

}
