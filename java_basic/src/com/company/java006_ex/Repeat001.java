package com.company.java006_ex;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요>");
		char str = sc.next().charAt(0);		
		if(str == 'a') {
			System.out.println("apple");
		}else if(str == 'b') {
			System.out.println("banana");
		}else if(str == 'c') {
			System.out.println("coconut");
		}
	}

}
