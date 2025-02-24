package com.company.java006_ex;

public class ArrayEx005 {

	public static void main(String[] args) {
		char[] arr = {'B','a','n','a','n','a'};
		int upperCnt = 0;
		int lowerCnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				upperCnt++;
			}
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				lowerCnt++;
			}
		}
		System.out.println("대문자의 갯수는 : "+ upperCnt);
		System.out.println("소문자의 갯수는 : "+ lowerCnt);
	}

}
