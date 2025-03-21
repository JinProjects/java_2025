package com.company.java008_ex;

public class MethodEx003 {

	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(3,5);
		disp(7,'*');
	}
	
	public static void test1(int num) {
		System.out.println(num);
	}
	public static void test2(double num) {
		System.out.println(num);
	}
	public static void hap(int num1, int num2) {
		int total = 0;
		for(int i=num1; i<=num2; i++) {
			total += i;
		}
		System.out.println(total);
	}
	public static void disp(int num1, char ch) {
		for(int i = 0; i<num1; i++) {
			System.out.print(ch);
		}
	}
}
