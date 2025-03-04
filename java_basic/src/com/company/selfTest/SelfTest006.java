package com.company.selfTest;

import java.util.Scanner;

public class SelfTest006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		
		System.out.print("국어점수를 입력해주세요>");
		kor = sc.nextInt();
		
		if(kor>=90) {
			System.out.println("수");
		}else if(kor >= 80) {
			System.out.println("우");
		}else if(kor >= 70) {
			System.out.println("미");
		}else if(kor >= 60){
			System.out.println("양");
		}else {
			System.out.println("가");
		}
	}

}
