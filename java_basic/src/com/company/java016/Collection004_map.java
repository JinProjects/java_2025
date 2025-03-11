package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collection004_map {

	public static void main(String[] args) {
		//   key,   value - put, get, for, remove, size
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "두울");
//		map.put("one", "세엣"); 키 값이 같으면 덮어씀
		map.put("three", "세엣");
		
		System.out.println(map);
		System.out.println(map.get("one")); //2. 가져오기
		System.out.println(map.size()); //3. 갯수
		
		System.out.println(map.remove("three"));//4. 삭제 key Object(객체)
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet());//[one,two] 키들 모으기
		System.out.println(map.values());//값들 모으기
		System.out.println(map.entrySet());// 키, 값 모두 가져옴
		
		//출력
		//향상된 for
		for(Entry <String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "/" + e.getValue());
		}
		//iter - ver1
		//1.key모으기 2.처리대상확인 3.값 꺼내오기 next
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + "/" + map.get(key));
		}
		System.out.println();
		System.out.println();
		//iter - ver2
		//1.key모으기 2.처리대상확인 3.값 꺼내오기
		Iterator<Entry <String, String>> eter = map.entrySet().iterator(); //iter -> [one=하나, two=두울]
		while(eter.hasNext()) {//2.처리대상확인 hasNext
			//3.값 꺼내오기
			Entry <String, String> temp = eter.next(); //3. 값 꺼내오기
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	}

}
//List : ##5.   기차      인덱스여부 [ O ] ,  중복허용여부 [ O ] ,  
//				[ add, get, remove, size, contains ] 
//Set  : ##6.   주머니   인덱스여부  [ X ] ,  중복허용여부  [ X ]  ,   
//				[ add,for/Iterator, remove, size, contains  ] 
//Map  : ##7.   사전      [ 키(key) / 값(value) ] - 쌍(Entry), [ O ] 
//				[ put, get, for, remove, size ]
