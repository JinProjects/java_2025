package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대문자 입력 >");
		char ch = ' ';
		
		ch = sc.next().charAt(0);
		
		ch += 32;
		System.out.println(ch);
		
		//Q 실수에 정수대입시 실수로 
		
		
	}

}
