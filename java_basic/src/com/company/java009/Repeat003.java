package com.company.java009;

import java.util.Scanner;

public class Repeat003 {

	public static void main(String[] args) {
		for(int i=100; i<=300; i+=100) {
			System.out.print(i+" ");
		}
		
		int i = 100;
		while(i<=300) {
			System.out.print(i + " ");
			i+= 100;
		}
		i = 100;
		do {
			System.out.println(i + " ");
			i+=100;
		}while(i<=300);
	}

}
