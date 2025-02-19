package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		double result;
		
		System.out.print("숫자입력1>");
		num1 = sc.nextInt();
		System.out.print("숫자입력2>");
		num2 = sc.nextInt();
		result = (double)num1/num2;
		
		System.out.println("결과 값 : "+ String.format("%.2f", result));
	}	

}
