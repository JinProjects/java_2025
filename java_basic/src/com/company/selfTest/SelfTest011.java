package com.company.selfTest;

import java.util.Scanner;

public class SelfTest011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for(;;) {
			System.out.print("숫자를 입력해주세요 >");
			num = sc.nextInt();
			if(num  >= 1 && num <= 100) {
				break;
			}
		}
	}

}
