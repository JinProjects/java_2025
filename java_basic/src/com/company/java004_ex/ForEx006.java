package com.company.java004_ex;

import java.util.Scanner;

public class ForEx006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		boolean flag = true;
		int num1 = 0;
		int num2;
		while(flag) {
			//마이너스 값 입력 x
			System.out.print("정수1를 하나 입력해주세요>");
			num1 = sc.nextInt();
			if(!(num1 >= 0 && num1 <=100)) {
				continue;
			}
			break;
		}
			for(;;) {
				System.out.print("정수2를 하나 입력해주세요>");
				num2 = sc.nextInt();
				if(!(num2 >= 0 && num2 <=100)) {
					continue;
				}
				break;
			}
			while(true) {
				System.out.print("연산자를 입력해주세요(+,-,*,/)");
				String oper1 = sc.next();
				char oper2 = oper1.charAt(0);
				if(oper2 == '+') {
					result += num1 + "+" + num2 +"="+(num1+num2); break;
				}else if(oper2 == '-') {
					result += num1 + "-" + num2 +"="+(num1-num2); break;
				}else if(oper2 == '*') {
					result += num1 + "*" + num2 +"="+(num1*num2); break;
				}else if(oper2 == '/') {
					result += num1 + "/" + num2 +"="+(num1/num2); break;
				}
			}
			System.out.println(result);
		
	}

}
