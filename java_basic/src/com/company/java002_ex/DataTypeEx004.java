package com.company.java002_ex;

import java.util.Scanner;

/**
 * 
 */
public class DataTypeEx004 {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		int total;
		float avg;
//		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하시오>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하시오>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하시오>");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = (float)total/3;
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f",avg);
		
	}

}
