package com.company.selfTest;

import java.util.Scanner;

public class SelfTest007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alpha = ' ';
		
		System.out.print("a,b,c중에 입력해주세요>");
		alpha = sc.next().charAt(0);
		
		switch(alpha) {
		case 'a':
		case 'A':
			System.out.println("apple");
			break;
		case 'b':
		case 'B':
			System.out.println("banana");
			break;
		case 'c':
		case 'C':
			System.out.println("coconut");
			break;
		}
	
	}

}
