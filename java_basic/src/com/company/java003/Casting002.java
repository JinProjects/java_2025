package com.company.java003;

import java.util.Scanner;

public class Casting002 {

	public static void main(String[] args) {
		//#1. 문자초기화
		char ch1 = ' '; // 공백한개라도 있어야 함.
		char ch2 = '\u0000';
		
		System.out.println("1 : "+ ch1 + "\t" + ch2); //    \t 탭 누른 효과
		System.out.println("2 : "+ (int)ch1 + "\t" + (int)ch2); //    \t 탭 누른 효과
		//#2. 문자의 연산
		
		char c = 'A';
		System.out.println(  c  + "\t" + (int)c);
		// 1)	+ 더하기 연산
		// 2) 숫자 + 숫자 더하기
		// 3)	+ 더하기 연산
		// 1)	+ 더하기 연산
		// byte - short(2byte) / char(2byte) - int
		byte ex1 = 1;
		int result1 = ex1 + 10;
		// 대문자 'A'를 소문자 'a'로 바꾸기
		char a = 'A'+1;
			a += 32;
		System.out.println(a); 
		//#3. 문자열
		// 자료형의 분류는 기본형(값)과 참조형(주소) 
		String str1 = "abc"; //객체사용시 str1 주소
		Scanner sc = new Scanner(System.in); //scanner 주소
		
		System.out.println();
		//대문자입력받아서 소문자로 변경
		
		String str = sc.next();
		System.out.println("입력한 문자열 : " + str.charAt(0));
		System.out.println("입력한 문자열 : " + str.charAt(1));
		System.out.println("입력한 문자열 : " + str.charAt(2));
		
		//대문자 입력 받아서 소문자로 변경
		
	}

}
