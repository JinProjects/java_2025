package com.company.java009;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'j':
			System.out.println("java");
			break;
		case 'h':
			System.out.println("html");
			break;
		case 'c':
			System.out.println("css");
			break;
		}
	}

}
