package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex006 {

	public static void main(String[] args) {
		int[][] datas = {
						{10,10,10,10},
						{20,20,20,20},
						{30,30,30,30}
					};
		int[][] result = new int[datas.length+1][datas[0].length+1];
		int total = 0;
		//복사
//		for(int ch=0; ch<datas.length; ch++) {
//			for(int kan=0; kan<datas[ch].length;) {
//				result[ch][kan] = datas[ch][kan];
//			}
//		}
		//#4. 전체데이터 누적
//		for(int ch=0; ch<datas.length; ch++) {
//			for(int kan=0; kan<datas[ch].length;) {
//				//result[ch][4] += datas[ch][kan];
//				result[ch][datas[ch].length] += datas[ch][kan];
//			}
//		}
		
		//#3. 세로방향데이터누적
//		result[3][0] += result[0][0]; 
//		result[3][0] += result[1][0];
//		result[3][0] += result[2][0];
//		
//		result[3][1] += result[0][1]; 
//		result[3][2] += result[0][2];
//		result[3][3] += result[0][3];
//		
//		result[3][1] += result[0][1]; 
//		result[3][1] += result[1][2];
//		result[3][1] += result[2][3];
//		
//		result[3][1] += result[0][1]; 
//		result[3][2] += result[1][2];
//		result[3][3] += result[2][3];
//		
		
		int total2 = 0;
		for(int i=0; i<result.length; i++) {
			//복사
			for(int j=0; j<result[i].length; j++) {
				if(i<result.length-1&&j<result[i].length-1) {
					result[i][j] = datas[i][j];
				}
			}
			//데이터 추가x 세로방향데이터 누적
			
//			for(int o=0; o<result[i].length; o++) {
//				if(result[i][o] == 0) {
//					result[i][o] = 60;
//				}
//			}
			//총합
			for(int k=0; k<result[i].length-1; k++) {
				total += result[i][k];
				result[i][result[i].length-1] = total;
			}
			total = 0;
		}
		// 10 10 10 10 40
		// 20 20 20 20 80
		// 30 30 30 30 120
		// 60 60 60 60 240
		//세로데이터 누적
		for(int i=0; i<result.length+1; i++) {
			for(int j=0; j<result.length; j++) {
				total2 += result[j][i];
			}
			result[result.length-1][i] = total2;
			total2 =0;
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
