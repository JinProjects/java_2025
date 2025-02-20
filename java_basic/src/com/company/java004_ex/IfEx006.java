package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("여자");
		}else {
			System.out.println("남자");			
		}
	}

}
