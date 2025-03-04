package com.company.selfTest;

import java.util.Scanner;

public class SelfTest014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for(int i=1; i<10; i++) {
			if(i < 2 || i > 4) {
				continue;
			}
			for(int j=1; j<10; j++) {
				System.out.println(i+ "*"+ j + "=" +(i*j));									
			}
		}
	}

}
