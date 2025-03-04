package com.company.selfTest;

import java.util.Scanner;

public class SelfTest015 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			arr[i] = num;
			num++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
