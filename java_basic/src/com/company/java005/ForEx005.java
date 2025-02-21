package com.company.java005;

public class ForEx005 {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i='a'; i<='z'; i++) {
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
				cnt++;
			}
		}
		
		System.out.println("모음 갯수 : "+cnt);
	}

}
