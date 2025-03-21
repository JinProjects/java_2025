package com.company.selfTest;

import java.util.Scanner;

public class SelfTest002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		System.out.println("당신의 이름을 입력하세요>");
		name = sc.next();
		System.out.println("당신의 이름은 "+name);
	}

}
