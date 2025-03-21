package com.company.java016;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
		HashMap<String,Integer> map = new HashMap<>();
		
		Set<String> set = new HashSet<>();
		
		/*
		 * 2. 다음과 같이 출력하시오.
			{A=1, B=4, C=2, D=3, E=1}
			A:#1
			B:####4
			C:##2
			D:###3
			E:#1
			보험왕 > [B]
		 * 
		 * */
		int cnt = 0;
		int idx = 0;
		char ch = data[0].charAt(0);
		
		for(int i=0; i<data.length; i++) {
			ch = data[idx].charAt(0);
			
			for(int j=idx; j<data.length; j++) {
				if(ch == data[j].charAt(0)) {
					cnt++;
				}
			}
			if(!map.containsKey(data[idx])) {
				map.put(data[idx], cnt);
			}
			idx++;
			cnt = 0;
		}
		
		Iterator<String> iter = map.keySet().iterator();
		String str = "";
		
		while(iter.hasNext()) {
			String alpha  = iter.next();
			for(int i=0; i<map.get(alpha); i++) {
				str += "#";
			}
			System.out.println(alpha+":"+str+map.get(alpha));
			str = "";
		}
//		Iterator<String> iter2 = map.keySet().iterator();
//		int i = 0;
//		String temp = "";
//		while(iter2.hasNext()) {
//			String alpha = iter2.next();
//			int num = map.get(alpha);
//			if(num>i) {
//				temp = alpha;//temp에 저장
//				i = num;//변수 i에 해당 값 저장
//			}
//		}
		
		Entry<String, Integer> maxValue = null;
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(maxValue == null || entry.getValue() > maxValue.getValue()) {
				maxValue = entry;
			}
		}
		
//		System.out.println("보험왕>"+ "["+temp+"]");
		System.out.println("보험왕>"+ "["+maxValue.getKey()+"]");
	}
}
