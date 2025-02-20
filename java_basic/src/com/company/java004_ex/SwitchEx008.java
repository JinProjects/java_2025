package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		int num = sc.nextInt();
		switch(num) {
		case 3:
			System.out.println("봄");
		case 6:
			System.out.println("여름");
		case 9:
			System.out.println("가을");
		case 12:
			System.out.println("겨울");
		}
	}

}
