package com.company.java003_ex;

public class OperatorEx002 {

	public static void main(String[] args) {
		int x = 5;
		char ch1 = 'a';
		char ch2 = '1';
		char ch3 = 'z';
		
		System.out.println(x>3 && x<10);
		System.out.println(ch1=='a'||ch1=='A');
		System.out.println(ch2>=0&&ch2<=9);
		System.out.println(ch3 >=65 && ch3 <= 90 || 
							ch3 >= 97 && ch3<=122);
	}

}
