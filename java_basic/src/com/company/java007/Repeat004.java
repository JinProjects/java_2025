package com.company.java007;

import java.util.Arrays;

public class Repeat004 {

	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];
		
		int num = 10;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num;
				num += 10;
			}
			num = 50;
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
