package com.company.java004_ex;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		int a = sc.nextInt();
		if(a == 1) {
			System.out.println("1이다");
		}else if(a == 2) {
			System.out.println("2이다");
		}else if(a == 3) {
			System.out.println("3이다");
		}
	}

}
