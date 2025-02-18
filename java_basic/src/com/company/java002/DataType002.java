package com.company.java002;

import java.util.Scanner;

public class DataType002 {

	public static void main(String[] args) {
		// 자료형의 분류 : 기본형 참조형
		// 기본형 : 논리형, 정수형(byte short int long), 실수형(float double)
		
		// OOP? 클래스(부품객체) 조립해 완성해가는 프로그램
		int a = 1; // 기본형
		Scanner sc = new Scanner(System.in); //참조형 : 
		//1. new 공간빌리기 heap 21312번지 []
		//2. Scanner(System.in);  사용할 수 있게 초기화 - 키보드로 입력
		// heap 21312번지 [[키보드로 입력 받는 기능]] ← scanner [21312번지]
		
		//## oop
		
		System.out.print("좋아하는 숫자를 입력 >");
		a = sc.nextInt(); //자료형에 맞게 입력받고 처리
		
		System.out.println("좋아하는 숫자는 : " + a);
		
		
	}

}
