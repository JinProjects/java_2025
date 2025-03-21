package com.company.java007;

import java.util.Arrays;

public class Repeat003 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int num = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = num;
			num+=10;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print((i==2?arr[i]:arr[i]+","));
		}
//		System.out.println(Arrays.toString(arr));
	}

}
