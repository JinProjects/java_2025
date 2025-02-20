package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번 입력 >");
		String num = sc.next();
		System.out.print("국어점수 입력 >");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 >");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 >");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = (double)total/3;
		
		String pass = "불합격";
		String level = "";
		String grade = "";
		
		if(avg>=60 && kor>=40 && eng>=40 && math >=40) {
			pass = "합격";
		}
		if(avg >= 95) {
			grade = "장학생";
		}
		if(avg >= 90) {
			level = "수";
		}else if(avg >= 80) {
			level = "우";
		}else if(avg >= 70) {
			level = "미";
		}else if(avg >= 60) {
			level = "양";
		}else {
			level = "가";
		}
		System.out.println("=================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println("=================================================================");
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s",num,kor,eng,math,total,avg,pass,level,grade);
		System.out.println(num+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f",avg)+"\t"+pass+"\t"+level+"\t"+grade);
		
	}

}
