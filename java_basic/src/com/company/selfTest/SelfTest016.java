package com.company.selfTest;

import java.util.Scanner;

public class SelfTest016 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		int num = 100;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num ++;
			}
			num = 200;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println();
			}
		}
		
	}

}
