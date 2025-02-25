package com.company.java007;

import java.util.Arrays;

public class Arr2_002 {

	public static void main(String[] args) {
		//int[][] << 자료형
		int[][] arr = new int[2][3];//2층 3칸 공간만 빌림
		
		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		
		arr[1][0] =4;
		arr[1][1] =5;
		arr[1][2] =6;

		int data = 1;
		arr[0][0] = data++;
		arr[0][1] = data++;
		arr[0][2] = data++;
		
		arr[1][0] = data++;
		arr[1][1] = data++;
		arr[1][2] = data++;
		
		data = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = data++; 
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
	}

}
