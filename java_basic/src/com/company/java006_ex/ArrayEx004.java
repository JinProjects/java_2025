package com.company.java006_ex;

public class ArrayEx004 {

	public static void main(String[] args) {
		char[] arr = {'B','a','n','a','n','a'};
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'a') {
				cnt++;
			}
		}
		System.out.println("a 개수 : "+cnt);
	}

}
