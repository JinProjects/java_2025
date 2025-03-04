package com.company.selfTest;

import java.util.Scanner;

public class SelfTest013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("원하는 단을 입력하세요>");
		num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num + "*"+ i + "=" +(num*i));
		}
	}

}
