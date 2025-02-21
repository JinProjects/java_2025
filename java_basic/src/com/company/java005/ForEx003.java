package com.company.java005;

import java.util.Scanner;

public class ForEx003 {

	public static void main(String[] args) {
		
		int total = 0;
		int num1 = 1;
		for(int i=1; i<=10; i++) {
			total+=i;
			System.out.print((i==1?"":"+")+i); 
//			System.out.println(total+"+"+i+"="+(total+=i)); 
		}
		System.out.println("="+total);
	}

}
