package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		char str2 = str1.charAt(0); 
		if(str2>= 'a' && str2<='z') {
			System.out.println("소문자 입니다.");
		}
		if(str2>='A' && str2<='Z') {
			System.out.println("대문자 입니다.");
		}
	}

}
