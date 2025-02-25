package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008 {

	public static void main(String[] args) {
		String[] name = {"아이언맨","헐크","캡틴","토르","호크아이"};
		int[] kor = {100,20,90,70,35};
		int[] eng = {100,50,95,80,100};
		int[] mat = {100,30,90,60,100};
//		int[] avg = new int[5];
		double[] avg = new double[5];
		
		
		//평균
		for(int i=0; i<name.length; i++) {
			avg[i] = (double)(kor[i]+eng[i]+mat[i])/3;
		}
		//평균 60점 이상 합격 아니면 불합격
		//평균 95점 이상 장학생
		System.out.println(Arrays.toString(avg));
		//등수
		int[] rank = new int[5];
		int cnt = 0;
		int k = 0;
		
		for(int i=k; i<rank.length; i++) {
			for(int j=0; j<rank.length; j++) {
				if(avg[i] <= avg[j]) {
					cnt++;
				}
			}
			rank[i] = cnt;
			cnt = 0;
			k++;
		}
		System.out.println(Arrays.toString(rank));
		System.out.println(":::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t순위");
		System.out.println(":::::::::::::::::::::::::");
		for(int i=0; i<avg.length; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"
						+String.format("%.2f", avg[i])+"\t"
						+(avg[i]>=60?"합격":"불합격")+"\t"
						+(avg[i]>=95?"장학생":"---")+"\t"
						+rank[i]+"등");
		}
		System.out.println(":::::::::::::::::::::::::");
		
	}

}
