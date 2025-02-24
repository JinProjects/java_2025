package com.company.java005_ex;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한개 입력해주세요 >");
		int num = sc.nextInt();
		if(num == 10) {
			System.out.println("10이다");
		}else if(num == 20) {
			System.out.println("20이다");
		}else if(num == 30) {
			System.out.println("30이다");
		}
	}

}
