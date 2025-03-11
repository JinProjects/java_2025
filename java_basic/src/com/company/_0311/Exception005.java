package com.company._0311;

import java.util.Scanner;

public class Exception005 {
	public static int nextInt() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int one = 0;
		while(true) {
			try {
				one = nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
			}
			if(one == 1) {
				break;
			}
		}
	}

}
