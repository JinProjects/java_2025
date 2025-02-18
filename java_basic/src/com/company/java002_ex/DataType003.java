package com.company.java002_ex;

import java.util.Scanner;

/**
 * Scanner이용해서 파이값을 입력받고 출력
 * 파이값을 입력하시오 > 
 * 파이값은 ***입니다.
 */
public class DataType003 {
	
	public static void main(String[] args) {
		//1. 자료형 - 기본형 / 참조형
		//2. 기본형 - 논리, 정수(1,2,4,8), 실수(float, double)
		
		//gigo - 변수 - 입력 - 처리 - 출력
		//변수
		float f = 0.0f;
		double d = 0.0;
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("실수를 입력하세요 >");
		d = sc.nextDouble();
		//처리
		
		//출력
		System.out.println("입력하신값은?"+d);
	}//end main
}//end class
