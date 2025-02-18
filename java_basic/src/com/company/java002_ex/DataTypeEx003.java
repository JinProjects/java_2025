package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {

	public static void main(String[] args) {
		
		float pi = 0.0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파이값을 입력하시오 >");
		pi = sc.nextFloat();
		
		System.out.println("파이값은 " + pi + "입니다.");
		System.out.printf("파이값은 %f입니다.\n",pi);
		System.out.printf("파이값은 %.2f입니다.\n",pi);
		System.out.printf("파이값은 %.3f입니다.\n",pi);
	}

}
