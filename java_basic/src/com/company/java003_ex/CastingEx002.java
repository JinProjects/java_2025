package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		System.out.print("국어점수 입력 > ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 > ");
		eng = sc.nextInt();
		System.out.print("수학점수 입력 > ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = (float)total/3;
		System.out.println("-------------------");
		System.out.println("::GOOD IT SCORE::");
		System.out.println("-------------------");
		System.out.println("국어 영어 수학 총점 평균 레벨");
		System.out.printf("%d  %d  %d  %d   %.2f  %d",kor,eng,math,total,avg,(int)avg/10);
		
	}

}
