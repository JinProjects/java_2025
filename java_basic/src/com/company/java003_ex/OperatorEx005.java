package com.company.java003_ex;

public class OperatorEx005 {

	public static void main(String[] args) {
		int a = 3;
		int b = 10;
		
		System.out.println(b+=10 - a--);//17
		System.out.println(a+=5);//7
		System.out.println(a>=10 || a<0 && a>3);//false
	}

}
