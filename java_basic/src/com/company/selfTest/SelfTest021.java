package com.company.selfTest;

import java.util.Scanner;

public class SelfTest021 {

	public static void main(String[] args) {
		print(3,5);
		print(1.2,3.4);
	}
	
	public static void print(int num1, int num2) {
		System.out.println("결과값: "+ (num1+num2));
	}
	public static void print(double num1, double num2) {
		System.out.println("결과값: "+ (num1+num2));
	}
}
