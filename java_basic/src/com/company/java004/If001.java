package com.company.java004;

public class If001 {

	public static void main(String[] args) {
		//1. if (1형식)
		int a = 0;
		System.out.println("1형식-조건을 무조건 읽음");
		// a가 0이라면 0이다
			if(a == 0) {
				System.out.println("0이다.");
			}
		// a가 1이라면 1이다
			if(a == 1) {
				System.out.println("1이다.");
			}
		//2. if else (2형식) else 뒤에는 조건식이 못 옴
			System.out.println("2형식 - 맞다/틀리다");
			a=0;
			if(a==0) {System.out.println("0이다.");}
			else {System.out.println("0이 아니다.");}
		//3. if else if (다형식)
			//a가 1이라면 1이다
			//a가 2이라면 2이다.
			//a가 3이라면 3이다.
			a = 2;
			System.out.println("3형식 - 여러조건");
			if(a==1) {
				System.out.println("1이다.");
			}else if(a==2) {
				System.out.println("2이다.");
			}else if(a==3) {
				System.out.println("3이다.");
			}else {
				System.out.println("1,2,3이 아니다.");
			}
			
	}//end main

}//end class
