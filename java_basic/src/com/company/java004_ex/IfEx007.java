package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해주세요 >");
		int num1 = sc.nextInt();
		System.out.print("정수를 하나 입력해주세요 >");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요(+,-,*,/) >");
		String oper1 = sc.next();
		
		char oper2 = oper1.charAt(0);
		
		
		System.out.println(num1 + "" +oper2 + "" + num2 +"=" +
				((oper2=='+')?num1+num2:(oper2=='-')
							?num1-num2:(oper2=='*')
							?num1*num2:String.format("%.2f", (double)num1/num2)));
	}

}
