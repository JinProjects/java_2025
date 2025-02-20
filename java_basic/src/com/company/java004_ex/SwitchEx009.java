package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		int num = sc.nextInt();
		switch(num) {
		case 1:
		case 2:
		case 3:
			System.out.println("봄");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("여름");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("가을");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("겨울");
			break;
		
		}
	}

}
