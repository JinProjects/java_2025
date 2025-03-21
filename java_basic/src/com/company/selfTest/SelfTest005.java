package com.company.selfTest;

import java.util.Scanner;

public class SelfTest005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		System.out.print("당신의 나이를 입력하세요>");
		age = sc.nextInt();
		
		if(age < 19) {
			System.out.println("만약 19세 미만이라면 당신은 미성년자입니다.");
		}else {
			System.out.println("성인입니다.");
		}
	}

}
