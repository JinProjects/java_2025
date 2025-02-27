package com.company.java009;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch == 'j') {
			System.out.println("java");
		}else if(ch == 'h') {
			System.out.println("html");
		}else if(ch == 'c') {
			System.out.println("css");
		}
	}

}
