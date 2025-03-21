package com.company.selfTest;

import java.util.Scanner;

public class SelfTest012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean flag = true;
		while(flag) {
			System.out.print("숫자를 입력해주세요 >");
			num = sc.nextInt();
			if(num  >= 1 && num <= 100) {
				flag = false;
			}
		}
	}

}
