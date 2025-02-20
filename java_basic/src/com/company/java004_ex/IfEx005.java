package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력>");
		String str1 = sc.next();
		char str2 = str1.charAt(0);
		if(str2 >= 'A' && str2 <= 'Z') {
//			System.out.println("소문자로 변경 : "+(char)(str2+32));
			System.out.println("소문자로 변경 : "+(char)(str2+32));
		}
		if(str2 >= 'a' && str2 <= 'z') {
//			System.out.println("대문자로 변경 : "+(char)(str2-32));
			System.out.println("대문자로 변경 : "+(char)(str2-32));
		}
	}

}
