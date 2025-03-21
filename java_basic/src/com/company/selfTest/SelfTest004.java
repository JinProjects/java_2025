package com.company.selfTest;

import java.util.Scanner;

public class SelfTest004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor;
		int eng;
		kor = sc.nextInt();
		eng = sc.nextInt();
		
		if(kor<40) {
			System.out.println("국어과락");
		}
		if(eng<40) {
			System.out.println("영어과락");
		}
	}

}
