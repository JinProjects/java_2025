package com.company.java008;

public class Method003 {

	public static void main(String[] args) {
		System.out.println("당신의 이름은? " + sign());
		//당신의 이름은? sally
		
		int yournum = num();
		System.out.println("랜덤숫자:" +yournum);
		System.out.println("파이값? " + pie());
		
		System.out.println(hello("sally"));
		System.out.println(hello("alpha"));
	}
	public static String hello(String str) {
		return "안녕" + str;
	}
	public static String sign() {
		return "sally";
	}
	public static int num() {
		return (int) (Math.random()*45 + 1);
	}

	public static double pie(){
		return Math.PI;
	}
}
