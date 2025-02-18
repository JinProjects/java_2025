package com.company.java002;

public class Var001 {

	public static void main(String[] args) {
		// 1. 변수 - 자료형 변수명
		int a=0; // a   [0]
		System.out.println( a );
		a = 10; // a   [0]
		System.out.println( a );
		a = 100000 - 11000; // a   [0]
		System.out.println( a );
		
		a = a - 3000;
		System.out.println( a );
		
		// 2. 변수의 범위
		{ int b = 20; System.out.println(b);}
		
		// 3. 변수명 $_소문자7
		int $c = 1232; int _2 = 2; int a3bc =3; 
		//int package; int static;
		System.out.println($c + "\t" + _2+ "\t" +a3bc);
		
		
	}

}
