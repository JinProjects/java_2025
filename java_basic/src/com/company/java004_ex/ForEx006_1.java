package com.company.java004_ex;

import java.util.Scanner;

public class ForEx006_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String result = "";
		int num1 = -1;
		int num2 = -1;
		String oper1 = "";
		char oper2;
		double result = 0;
//		String result = "";
		while(true) {
			//if(!(num1 >= 0 && num1 <=100)) {
			if(num1 < 0 || num1 > 100) {
				System.out.print("정수1를 하나 입력해주세요>");
				num1 = sc.nextInt();
				continue;
			}
			if(num2 < 0 || num2 > 100) {
				System.out.print("정수2를 하나 입력해주세요>");
				num2 = sc.nextInt();
				continue;
			}
//			System.out.print("연산자를 입력해주세요(+,-,*,/)");
//			oper1 = sc.next();
//			oper2 = oper1.charAt(0);
//			if(oper2) {
//				continue;
//			}
			
			oper1 = sc.next();
			oper2 = oper1.charAt(0);
			if(!(oper2=='+'||oper2=='-'||oper2=='*'||oper2=='/')) {
				System.out.print("연산자를 입력해주세요(+,-,*,/)");
				oper2 = sc.next().charAt(0); continue;
			}
			break;
//			if(oper2 == '+') {
//				result += num1 + "+" + num2 +"="+(int)(num1+num2); break;
//			}else if(oper2 == '-') {
//				result += num1 + "-" + num2 +"="+(int)(num1-num2); break;
//			}else if(oper2 == '*') {
//				result += num1 + "*" + num2 +"="+(int)(num1*num2); break;
//			}else if(oper2 == '/') {
//				result += num1 + "/" + num2 +"="+(num1/num2); break;
////				System.out.println(num1 + oper2 + num2 + "=" +
////						(oper2!='/'? ""+ (int)result:String.format("%.2f", result))); 
//			}
		}
		if(oper2 == '+') {
			result = num1 + num2;
		}else if(oper2 == '-') {
			result = num1 - num2;
		}else if(oper2 == '*') {
			result = num1 * num2;
		}else if(oper2 == '/') {
			result = num1 / num2;
		}
		System.out.println(result);
	}

}
