package com.company.java006_ex;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요>");
		char str = sc.next().charAt(0);	
		switch(str) {
		case 'a':
			System.out.println("apple");
			break;
		case 'b':
			System.out.println("banana");
			break;
		case 'c':
			System.out.println("coconut");
			break;
		}

	}

}
