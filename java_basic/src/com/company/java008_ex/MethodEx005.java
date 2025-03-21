package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx005 {

	public static void main(String[] args) {
		String name = "";
		int kor,eng,math,total;
		float avg = 0.0f;
		String pass = "";
		String jang = "";
		String star = "";
		String level_kor ="",level_eng="",level_math="";
		String re= "";
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요>");
		name = sc.next();
		System.out.print("국어 점수 입력>");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력>");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력>");
		math = sc.nextInt();
		
		total = process_total(kor,eng,math);
		avg = process_avg(total);
		pass = pass(avg, kor, eng, math);
		jang = process_scholar(avg);
		star = process_star(avg);
		process_show(name,kor,eng,math,total,avg,pass,jang,star);
	}

	private static void process_show(String name, int kor, int eng, int math, int total, float avg, String pass,
			String jang, String star) {
		System.out.println("::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("-------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f", avg)+"\t"+pass+"\t"+jang+"\t"+star);
		System.out.println("-------------------------------------------------");
	}

	private static String process_star(float avg) {
		String starCnt = "★";
//		for(int i=0; i<(int)avg/10; i++) {
//			starCnt += "★";
//		}
		return starCnt.repeat((int)avg/10);
	}

	private static String process_scholar(float avg) {
		return (avg>=95?"장학생":"---");
	}

	private static String pass(float avg, int kor, int eng, int math) {
		String str = "";
//		if(avg >= 60&&(kor>=40&&eng>=40&&math>=40)) {
//			str = "불합격";
//		}else{
//			str = "재시험";
//		}
		if(avg >= 60) {
			str = "불합격";
		}
		if(kor>=40||eng>=40||math>=40) {
			str = "재시험";
		}
		return str;
	}

	private static float process_avg(int total) {
		return (float)total/3;
	}

	private static int process_total(int kor, int eng, int math) {
		return kor + eng + math;
	}

	
}
