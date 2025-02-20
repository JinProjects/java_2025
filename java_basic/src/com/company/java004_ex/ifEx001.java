package com.company.java004_ex;

import java.util.Scanner;

public class ifEx001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "불합격";
		System.out.print("평균 입력>");
		int avg = sc.nextInt();
		if(avg >= 60) {
			result = "합격";
		}
		System.out.println(result);
	}

}
